package io.emerald.magic.api.common.params.set;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.annotations.SerializedName;

/**
 * Represent a Set object response from Scryfall API.
 * 
 * @author C4X2
 * @version 1.0.1
 * @see {@link https://scryfall.com/docs/api/sets}
 */
public class Sets
{
	/**
	 * A unique ID for this set on Scryfall that will not change.
	 */
	private String	id;

	/**
	 * The unique three to five-letter code for this set.
	 */
	private String	code;

	/**
	 * The unique code for this set on MTGO, which may differ from the regular code.
	 */
	@SerializedName("mtgo_code")
	private String	mtgoCode;

	/**
	 * The unique code for this set on Arena, which may differ from the regular
	 * code.
	 */
	@SerializedName("arena_code")
	private String	arenaCode;

	/**
	 * This set’s ID on TCGplayer's API, also known as the groupId.
	 */
	@SerializedName("tcgplayer_id")
	private Integer	tcgplayerId;

	/**
	 * The English name of the set.
	 */
	private String	name;

	/**
	 * A link to this set object on Scryfall's API.
	 */
	private String	uri;

	/**
	 * A link to this set's permapage on Scryfall's website.
	 */
	@SerializedName("scryfall_uri")
	private String	scryfallUri;

	/**
	 * A Scryfall API URI that you can request to begin paginating over the cards in
	 * this set.
	 */
	@SerializedName("search_uri")
	private String	searchUri;

	/**
	 * The date the set was released or the first card was printed in the set (in
	 * GMT-8 Pacific time).
	 */
	@SerializedName("released_at")
	private Date	releasedAt;

	/**
	 * A computer-readable classification for this set. See below.
	 *
	 */
	@SerializedName("set_type")
	private String	setType;

	/**
	 * The number of cards in this set.
	 */
	@SerializedName("card_count")
	private Integer	cardCount;

	/**
	 * True if this set was only released on Magic Online.
	 */
	private boolean	digital;

	/**
	 * True if this set contains only foil cards.
	 */
	@SerializedName("foil_only")
	private boolean	foilOnly;

	/**
	 * The block code for this set, if any.
	 */
	@SerializedName("block_code")
	private String	blockCode;

	/**
	 * The block or group name code for this set, if any.
	 */
	private String	block;

	/**
	 * A URI to an SVG file for this sets icon on Scryfall's CDN. Hotlinking this
	 * image is not recommended, because it may change slightly over time. You
	 * should download it and use it locally for your particular user interface
	 * needs.
	 */
	@SerializedName("icon_svg_uri")
	private String	iconSvgUri;

	/**
	 * @return the id
	 */
	public String getId()
	{
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public String getCode()
	{
		return this.code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code)
	{
		this.code = code;
	}

	/**
	 * @return the mtgoCode
	 */
	public String getMtgoCode()
	{
		return this.mtgoCode;
	}

	/**
	 * @param mtgoCode the mtgoCode to set
	 */
	public void setMtgoCode(String mtgoCode)
	{
		this.mtgoCode = mtgoCode;
	}

	/**
	 * @return the arenaCode
	 */
	public String getArenaCode()
	{
		return this.arenaCode;
	}

	/**
	 * @param arenaCode the arenaCode to set
	 */
	public void setArenaCode(String arenaCode)
	{
		this.arenaCode = arenaCode;
	}

	/**
	 * @return the tcgplayerId
	 */
	public Integer getTcgplayerId()
	{
		return this.tcgplayerId;
	}

	/**
	 * @param tcgplayerId the tcgplayerId to set
	 */
	public void setTcgplayerId(Integer tcgplayerId)
	{
		this.tcgplayerId = tcgplayerId;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the uri
	 */
	public String getUri()
	{
		return this.uri;
	}

	/**
	 * @param uri the uri to set
	 */
	public void setUri(String uri)
	{
		this.uri = uri;
	}

	/**
	 * @return the scryfallUri
	 */
	public String getScryfallUri()
	{
		return this.scryfallUri;
	}

	/**
	 * @param scryfallUri the scryfallUri to set
	 */
	public void setScryfallUri(String scryfallUri)
	{
		this.scryfallUri = scryfallUri;
	}

	/**
	 * @return the searchUri
	 */
	public String getSearchUri()
	{
		return this.searchUri;
	}

	/**
	 * @param searchUri the searchUri to set
	 */
	public void setSearchUri(String searchUri)
	{
		this.searchUri = searchUri;
	}

	/**
	 * @return the releasedAt
	 */
	public Date getReleasedAt()
	{
		return this.releasedAt;
	}

	/**
	 * @param releasedAt the releasedAt to set
	 */
	public void setReleasedAt(Date releasedAt)
	{
		this.releasedAt = releasedAt;
	}

	/**
	 * @return the setType
	 */
	public String getSetType()
	{
		return this.setType;
	}

	/**
	 * @param setType the setType to set
	 */
	public void setSetType(String setType)
	{
		this.setType = setType;
	}

	/**
	 * @return the cardCount
	 */
	public Integer getCardCount()
	{
		return this.cardCount;
	}

	/**
	 * @param cardCount the cardCount to set
	 */
	public void setCardCount(Integer cardCount)
	{
		this.cardCount = cardCount;
	}

	/**
	 * @return the digital
	 */
	public boolean isDigital()
	{
		return this.digital;
	}

	/**
	 * @param digital the digital to set
	 */
	public void setDigital(boolean digital)
	{
		this.digital = digital;
	}

	/**
	 * @return the foilOnly
	 */
	public boolean isFoilOnly()
	{
		return this.foilOnly;
	}

	/**
	 * @param foilOnly the foilOnly to set
	 */
	public void setFoilOnly(boolean foilOnly)
	{
		this.foilOnly = foilOnly;
	}

	/**
	 * @return the blockCode
	 */
	public String getBlockCode()
	{
		return this.blockCode;
	}

	/**
	 * @param blockCode the blockCode to set
	 */
	public void setBlockCode(String blockCode)
	{
		this.blockCode = blockCode;
	}

	/**
	 * @return the block
	 */
	public String getBlock()
	{
		return this.block;
	}

	/**
	 * @param block the block to set
	 */
	public void setBlock(String block)
	{
		this.block = block;
	}

	/**
	 * @return the iconSvgUri
	 */
	public String getIconSvgUri()
	{
		return this.iconSvgUri;
	}

	/**
	 * @param iconSvgUri the iconSvgUri to set
	 */
	public void setIconSvgUri(String iconSvgUri)
	{
		this.iconSvgUri = iconSvgUri;
	}
	
	@Override
	public String toString()
	{
		StringBuilder rtrnVal = new StringBuilder();
		rtrnVal.append("Set Name: ").append(getName());
		rtrnVal.append(StringUtils.LF);
		rtrnVal.append("Card Count: ").append(getCardCount());
		rtrnVal.append(StringUtils.LF);
		rtrnVal.append("First Released At: ").append(getReleasedAt());
		rtrnVal.append(StringUtils.LF);
		return rtrnVal.toString();
	}
}
