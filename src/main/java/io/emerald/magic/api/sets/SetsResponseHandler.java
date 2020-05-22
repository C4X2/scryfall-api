package io.emerald.magic.api.sets;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

import io.emerald.magic.api.client.ResponseHandler;
import io.emerald.magic.api.common.params.set.Sets;

public class SetsResponseHandler implements ResponseHandler<Sets>
{
	private Gson gson;

	public SetsResponseHandler()
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
	public Sets transform(String jsonResponse)
	{
		Sets setObj = new Sets();
		if (!StringUtils.isBlank(jsonResponse))
		{
			setObj = getGson().fromJson(jsonResponse, Sets.class);
		}
		return setObj;
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
