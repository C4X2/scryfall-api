package io.emerald.magic.api.client;

/**
 * A generic handler for information gathered from the Scryfall API.
 * 
 * @author C4X2
 *
 */
public interface ResponseHandler<T>
{
	/**
	 * An error from the Scryfall API is any response returned with the 4XX or 5XX
	 * response codes.
	 * 
	 * @param e error information
	 */
	void onError(Exception e);

	/**
	 * This method will be executed on a successful response of the Scryfall API
	 */
	void onSuccess();

	/**
	 * Transforms the response from the API call into a java object.
	 * 
	 * @param jsonResponse the json response received from the Request
	 * @throws NullPointerException if the given parameter is null or empty
	 * @return the transform object from the json.
	 */
	T transform(String jsonResponse);
}
