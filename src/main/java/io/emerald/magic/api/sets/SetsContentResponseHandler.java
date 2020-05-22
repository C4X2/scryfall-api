package io.emerald.magic.api.sets;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

import io.emerald.magic.api.client.ResponseHandler;
import io.emerald.magic.api.common.params.set.SetResponse;

public class SetsContentResponseHandler implements ResponseHandler<SetResponse>
{
	private Gson gson;

	public SetsContentResponseHandler()
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
	public SetResponse transform(String jsonResponse)
	{
		SetResponse setResposne = new SetResponse();
		if (StringUtils.isNotBlank(jsonResponse))
		{
			setResposne = getGson().fromJson(jsonResponse, SetResponse.class);
		} 
		return setResposne;
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
