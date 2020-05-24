package io.emerald.magic.api.common.params.rulings;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Ruling
{
	private String	object;

	@SerializedName("oracle_id")
	private String	oracleId;

	private String	source;

	@SerializedName("published_at")
	private Date	publishedAt;

	private String	comments;

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
	 * @return the oracleId
	 */
	public String getOracleId()
	{
		return this.oracleId;
	}

	/**
	 * @param oracleId the oracleId to set
	 */
	public void setOracleId(String oracleId)
	{
		this.oracleId = oracleId;
	}

	/**
	 * @return the source
	 */
	public String getSource()
	{
		return this.source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source)
	{
		this.source = source;
	}

	/**
	 * @return the publishedAt
	 */
	public Date getPublishedAt()
	{
		return this.publishedAt;
	}

	/**
	 * @param publishedAt the publishedAt to set
	 */
	public void setPublishedAt(Date publishedAt)
	{
		this.publishedAt = publishedAt;
	}

	/**
	 * @return the comments
	 */
	public String getComments()
	{
		return this.comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments)
	{
		this.comments = comments;
	}
}
