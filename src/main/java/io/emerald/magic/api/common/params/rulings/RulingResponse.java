package io.emerald.magic.api.common.params.rulings;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class RulingResponse
{
	private String			object;

	@SerializedName("has_more")
	private boolean			hasMore;

	private List<Ruling>	data;

	/**
	 * @return the object
	 */
	public String getObject()
	{
		return this.object;
	}

	/**
	 * @param object the object to set
	 */
	public void setObject(String object)
	{
		this.object = object;
	}

	/**
	 * @return the hasMore
	 */
	public boolean isHasMore()
	{
		return this.hasMore;
	}

	/**
	 * @param hasMore the hasMore to set
	 */
	public void setHasMore(boolean hasMore)
	{
		this.hasMore = hasMore;
	}

	/**
	 * @return the data
	 */
	public List<Ruling> getData()
	{
		return this.data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<Ruling> data)
	{
		this.data = data;
	}
}
