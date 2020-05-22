package io.emerald.magic.api.cards;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.commons.lang3.StringUtils;
import org.asynchttpclient.ListenableFuture;
import org.asynchttpclient.Response;

import io.emerald.magic.api.client.ScryfallHttpClient;
import io.emerald.magic.api.common.ScryfallAPIConstants;
import io.emerald.magic.api.common.params.card.Card;
import io.emerald.magic.api.common.params.card.CardSearchCriteria;
import io.emerald.magic.api.common.params.card.FilterCritieria;


/**
 * Gets Card object from Scryfall API.
 * 
 * @author C4X2
 * @version 1.0
 * 
 */
public class CardsAPI
{

	private ScryfallHttpClient	scryfallHttpClient;
	private CardResponseHandler	cardResponseHandler;
	private static final String	CARDS_ENPOINT			= "/cards";
	private static final String	CARDS_SEARCH_ENPOINT	= "/search";
	private static final String	CARDS_NAMED_ENDPOINT	= "/named";
	private static final String	FUZZY_OPERATOR			= "fuzzy=";
	private static final String	EXACT_OPERATOR			= "exact=";
	private static final String	CARDS_RANDOM_ENPOINT	= "/random";

	public CardsAPI()
	{
		init();
	}

	private void init()
	{
		String url = StringUtils.join(ScryfallAPIConstants.SCRYFALL_API, CARDS_ENPOINT);
		this.setScryfallHttpClient(new ScryfallHttpClient(url));
		this.setCardResponseHandler(new CardResponseHandler());
	}

	public List<Card> getAllCards()
	{
		// TODO
		return null;
	}

	public Card searchForCard(String cardName, boolean fuzzy)
	{
		String fuzz = fuzzy ? StringUtils.join(FUZZY_OPERATOR, cardName) : StringUtils.join(EXACT_OPERATOR, cardName);
		String endpoint = StringUtils.join(CARDS_NAMED_ENDPOINT, ScryfallAPIConstants.RESTFUL_QUERY_OPERATOR, fuzz);
		return getAPIResponse(endpoint);
	}

	public Card searchForCard(String cardName)
	{
		return searchForCard(cardName, false);
	}

	public Card searchForCard(CardSearchCriteria cardSearchCriteria)
	{
		// TODO
		return null;
	}

	public Card getRandomCard()
	{
		return getAPIResponse(CARDS_RANDOM_ENPOINT);
	}

	public Card getRandomCard(FilterCritieria filterCriteria)
	{
		// TODO
		return null;
	}

	private Card getAPIResponse(String url)
	{
		if (StringUtils.isBlank(url))
		{
			return null;
		}
		ListenableFuture<Response> card = getScryfallHttpClient().prepare(url).execute();
		Response cardResponse = null;
		try
		{
			cardResponse = card.get();
			if (cardResponse != null)
			{
				return getCardResponseHandler().transform(cardResponse.getResponseBody());
			}

		} catch (InterruptedException | ExecutionException e)
		{
			getCardResponseHandler().onError(e);
		}
		return null;
	}

	/**
	 * @return the scryfallHttpClient
	 */
	public ScryfallHttpClient getScryfallHttpClient()
	{
		return scryfallHttpClient;
	}

	/**
	 * @param scryfallHttpClient the scryfallHttpClient to set
	 */
	public void setScryfallHttpClient(ScryfallHttpClient scryfallHttpClient)
	{
		this.scryfallHttpClient = scryfallHttpClient;
	}

	/**
	 * @return the cardResponseHandler
	 */
	public CardResponseHandler getCardResponseHandler()
	{
		return cardResponseHandler;
	}

	/**
	 * @param cardResponseHandler the cardResponseHandler to set
	 */
	public void setCardResponseHandler(CardResponseHandler cardResponseHandler)
	{
		this.cardResponseHandler = cardResponseHandler;
	}

}
