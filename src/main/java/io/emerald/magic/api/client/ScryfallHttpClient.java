package io.emerald.magic.api.client;

import org.asynchttpclient.*;
import static org.asynchttpclient.Dsl.asyncHttpClient;
import org.apache.commons.lang3.StringUtils;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.AsyncHttpClientConfig;
import org.asynchttpclient.BoundRequestBuilder;

@SuppressWarnings("unused") 
public class ScryfallHttpClient implements HttpClient
{
	
	private String baseUrl;
	private AsyncHttpClient asychHttpClient;
	private static final String CONTENT_TYPE = "Content-type";
	private static final String JSON = "application/json";

	public ScryfallHttpClient(String baseUrl)
	{
		this(baseUrl, null);
	}
	
	public ScryfallHttpClient(String baseUrl, AsyncHttpClientConfig config)
	{
		this.setBaseUrl(baseUrl);
		this.asychHttpClient = (config == null) ? asyncHttpClient() : asyncHttpClient(config);
	}
	

	@Override 
	public BoundRequestBuilder prepare(String endpoint)
	{
		String url = StringUtils.join(getBaseUrl(), endpoint);
		return getAsychHttpClient().prepareGet(url).addHeader(CONTENT_TYPE, JSON);
	}

	@Override
	public BoundRequestBuilder prepare(String endpoint, String params)
	{
		return prepare(endpoint + params);
	}

	@Override 
	public String getBaseUrl()
	{
		return this.baseUrl;
	}

	/**
	 * @param baseUrl the baseUrl to set
	 */
	@Override
	public void setBaseUrl(String baseUrl)
	{
		this.baseUrl = baseUrl;
	}

	/**
	 * @return the asychHttpClient
	 */
	public AsyncHttpClient getAsychHttpClient()
	{
		return asychHttpClient;
	}

	/**
	 * @param asychHttpClient the asychHttpClient to set
	 */
	public void setAsychHttpClient(AsyncHttpClient asychHttpClient)
	{
		this.asychHttpClient = asychHttpClient;
	}

}
