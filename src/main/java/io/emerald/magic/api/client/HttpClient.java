package io.emerald.magic.api.client;

import org.asynchttpclient.BoundRequestBuilder;

public interface HttpClient
{
	/**
	 * 
	 * Builds the necessary request information in order to receive information from
	 * the Scryfall api.
	 * 
	 * @param endpoint which end point to call
	 * @return the object ready to make the request
	 */
	public BoundRequestBuilder prepare(String endpoint);

	/**
	 * 
	 * Builds the necessary request information in order to receive information from
	 * the Scryfall api with additional query parameters.
	 * 
	 * @param endpoint which end point to call
	 * @return the object ready to make the request
	 */
	public BoundRequestBuilder prepare(String endpoint, String params);

	/**
	 * Get the base url for this HttpClient
	 * 
	 * @return the base url for this HttpClient
	 */
	public String getBaseUrl();

	/**
	 * Set the base url for this HttpClient
	 *
	 */
	public void setBaseUrl(String url);

}
