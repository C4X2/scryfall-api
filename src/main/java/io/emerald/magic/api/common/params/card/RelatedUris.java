package io.emerald.magic.api.common.params.card;

import com.google.gson.annotations.SerializedName;

/**
 * Related URI to the card object in different online databases.
 * 
 * @author C4X2
 * @version 1.0
 * @see {@link Card}
 */
public class RelatedUris
{
	/**
	 * URI for the gather representation for this card
	 */
	private String	gather;

	@SerializedName("tcgplayer_decks")
	private String	tcgplayerDecks;

	private String	edhrec;

	private String	mtgtop8;

	/**
	 * @return the gather
	 */
	public String getGather()
	{
		return this.gather;
	}

	/**
	 * @param gather the gather to set
	 */
	public void setGather(String gather)
	{
		this.gather = gather;
	}

	/**
	 * @return the tcgplayerDecks
	 */
	public String getTcgplayerDecks()
	{
		return this.tcgplayerDecks;
	}

	/**
	 * @param tcgplayerDecks the tcgplayerDecks to set
	 */
	public void setTcgplayerDecks(String tcgplayerDecks)
	{
		this.tcgplayerDecks = tcgplayerDecks;
	}

	/**
	 * @return the edhrec
	 */
	public String getEdhrec()
	{
		return this.edhrec;
	}

	/**
	 * @param edhrec the edhrec to set
	 */
	public void setEdhrec(String edhrec)
	{
		this.edhrec = edhrec;
	}

	/**
	 * @return the mtgtop8
	 */
	public String getMtgtop8()
	{
		return this.mtgtop8;
	}

	/**
	 * @param mtgtop8 the mtgtop8 to set
	 */
	public void setMtgtop8(String mtgtop8)
	{
		this.mtgtop8 = mtgtop8;
	}
}
