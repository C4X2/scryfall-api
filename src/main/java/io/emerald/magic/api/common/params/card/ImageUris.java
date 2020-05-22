package io.emerald.magic.api.common.params.card;

import com.google.gson.annotations.SerializedName;

public class ImageUris
{
	private String									small;
	private String									normal;
	private String									large;
	private String									png;
	@SerializedName("art_crop") 
	private String		                            artCrop;
	@SerializedName("border_crop")
	private String	                                borderCrop;

	/**
	 * @return the small
	 */
	public String getSmall()
	{
		return this.small;
	}

	/**
	 * @param small the small to set
	 */
	public void setSmall(String small)
	{
		this.small = small;
	}

	/**
	 * @return the normal
	 */
	public String getNormal()
	{
		return this.normal;
	}

	/**
	 * @param normal the normal to set
	 */
	public void setNormal(String normal)
	{
		this.normal = normal;
	}

	/**
	 * @return the large
	 */
	public String getLarge()
	{
		return this.large;
	}

	/**
	 * @param large the large to set
	 */
	public void setLarge(String large)
	{
		this.large = large;
	}

	/**
	 * @return the png
	 */
	public String getPng()
	{
		return this.png;
	}

	/**
	 * @param png the png to set
	 */
	public void setPng(String png)
	{
		this.png = png;
	}

	/**
	 * @return the artCrop
	 */
	public String getArtCrop()
	{
		return this.artCrop;
	}

	/**
	 * @param artCrop the artCrop to set
	 */
	public void setArtCrop(String artCrop)
	{
		this.artCrop = artCrop;
	}

	/**
	 * @return the borderCrop
	 */
	public String getBorderCrop()
	{
		return this.borderCrop;
	}

	/**
	 * @param borderCrop the borderCrop to set
	 */
	public void setBorderCrop(String borderCrop)
	{
		this.borderCrop = borderCrop;
	}
}
