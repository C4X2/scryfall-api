package io.emerald.magic.api.cards;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

import io.emerald.magic.api.client.ResponseHandler;
import io.emerald.magic.api.common.params.card.Card;

public class CardResponseHandler implements ResponseHandler<Card>
{
	private Gson gson;

	public CardResponseHandler()
	{
		init();
	}

	private void init()
	{
		this.setGson(new Gson());
	}

	@Override
	public void onError(Exception e)
	{
		if (e == null)
			return;
		e.printStackTrace();
	}

	@Override
	public void onSuccess()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Card transform(String jsonResponse)
	{
		Card cardObj = new Card();
		if (!StringUtils.isBlank(jsonResponse))
		{
			cardObj = getGson().fromJson(jsonResponse, Card.class);
		}
		return cardObj;
	}

	/**
	 * @return the gson
	 */
	public Gson getGson()
	{
		return gson;
	}

	/**
	 * @param gson the gson to set
	 */
	public void setGson(Gson gson)
	{
		this.gson = gson;
	}

}
