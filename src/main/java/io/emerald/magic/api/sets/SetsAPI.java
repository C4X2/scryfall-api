package io.emerald.magic.api.sets;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.commons.lang3.StringUtils;
import org.asynchttpclient.ListenableFuture;
import org.asynchttpclient.Response;
import org.springframework.stereotype.Component;

import io.emerald.magic.api.client.ScryfallHttpClient;
import io.emerald.magic.api.common.ScryfallAPIConstants;
import io.emerald.magic.api.common.params.card.Card;
import io.emerald.magic.api.common.params.set.SetResponse;
import io.emerald.magic.api.common.params.set.Sets;

/**
 * Gets Card object from Scryfall API.
 * 
 * @author C4X2
 * @version 1.0
 * 
 */
public class SetsAPI
{

	private ScryfallHttpClient	scryfallHttpClient;
	private SetsResponseHandler	setsResponseHandler;
	private SetsContentResponseHandler setsContentResponseHandler;
	private static final String	SETS_ENPOINT			= "/sets";


	public SetsAPI()
	{
		init();
	}

	private void init()
	{
		String url = StringUtils.join(ScryfallAPIConstants.SCRYFALL_API, SETS_ENPOINT);
		this.setScryfallHttpClient(new ScryfallHttpClient(url));
		this.setSetsResponseHandler(new SetsResponseHandler());
		this.setSetsContentResponseHandler(new SetsContentResponseHandler());
	}

	public List<Card> getSetContents(String setName)
	{
		Sets set = searchForSet(setName);
		String contentsUrl = set.getSearchUri();
		SetResponse setResponse = getPageResponse(contentsUrl);
		List<Card> cards = setResponse.getData();
		while (setResponse.isHasMore())
		{
			setResponse = getPageResponse(setResponse.getNextPage());
			if (setResponse != null)
			{
				cards.addAll(setResponse.getData());
			}
			
		}
		return cards;
	}
	
	private SetResponse getPageResponse(String contentsUrl)
	{
		ScryfallHttpClient tempClient = new ScryfallHttpClient(contentsUrl);
		ListenableFuture<Response> setResponse = tempClient.prepare(StringUtils.EMPTY).execute();
		Response realSetResponse = null;
		try 
		{
			realSetResponse = setResponse.get();
			if (realSetResponse != null)
			{
				return getSetsContentResponseHandler().transform(realSetResponse.getResponseBody());
			}
		}
		catch (InterruptedException | ExecutionException e)
		{
			getSetsContentResponseHandler().onError(e);
		}
		finally
		{
			try
			{
				tempClient.getAsychHttpClient().close();
			} catch (IOException e)
			{

			}
		}
		return null;
	}
	public Sets searchForSet(String setName)
	{
		String url = StringUtils.join(ScryfallAPIConstants.FORWARD_SLASH, setName);
		return getAPIResponse(url);
	}

	private Sets getAPIResponse(String url)
	{
		if (StringUtils.isBlank(url))
		{
			return null;
		}
		ListenableFuture<Response> set = getScryfallHttpClient().prepare(url).execute();
		Response setResponse = null;
		try
		{
			setResponse = set.get();
			if (setResponse != null)
			{
				return getSetsResponseHandler().transform(setResponse.getResponseBody());
			}

		} catch (InterruptedException | ExecutionException e)
		{
			getSetsResponseHandler().onError(e);
		}
		return null;
	}

	/**
	 * @return the scryfallHttpClient
	 */
	public ScryfallHttpClient getScryfallHttpClient()
	{
		return this.scryfallHttpClient;
	}

	/**
	 * @param scryfallHttpClient the scryfallHttpClient to set
	 */
	public void setScryfallHttpClient(ScryfallHttpClient scryfallHttpClient)
	{
		this.scryfallHttpClient = scryfallHttpClient;
	}

	/**
	 * @return the setsResponseHandler
	 */
	public SetsResponseHandler getSetsResponseHandler()
	{
		return this.setsResponseHandler;
	}

	/**
	 * @param setsResponseHandler the setsResponseHandler to set
	 */
	public void setSetsResponseHandler(SetsResponseHandler setsResponseHandler)
	{
		this.setsResponseHandler = setsResponseHandler;
	}

	/**
	 * @return the setsContentResponseHandler
	 */
	public SetsContentResponseHandler getSetsContentResponseHandler()
	{
		return this.setsContentResponseHandler;
	}

	/**
	 * @param setsContentResponseHandler the setsContentResponseHandler to set
	 */
	public void setSetsContentResponseHandler(SetsContentResponseHandler setsContentResponseHandler)
	{
		this.setsContentResponseHandler = setsContentResponseHandler;
	}

}
