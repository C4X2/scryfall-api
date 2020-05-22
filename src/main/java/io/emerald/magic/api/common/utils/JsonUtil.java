package io.emerald.magic.api.common.utils;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;

/**
 * A generic utility class to convert java object to json and json objects to
 * java. Acts as a weak wrapper for Google's Gson library.
 * 
 * @author C4X2
 * @version 1.0
 *
 */
public class JsonUtil
{
	private final static Gson gson = new Gson();
	private final static String EMPTY_JSON = "{}";

	
	public static String toJson(Object clazz)
	{
		if (clazz == null)
		{
			return EMPTY_JSON;
		}
		return gson.toJson(clazz);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T fromJson(String json, T clazz)
	{
		if (StringUtils.isBlank(json))
		{
			return null;
		}
		return gson.fromJson(json, (Class<T>) clazz);
	}
	
	public static boolean isValidJson(String json)
	{
		if (StringUtils.isBlank(json))
		{
			return false;
		}
		return true;
		//TODO
	}
}
