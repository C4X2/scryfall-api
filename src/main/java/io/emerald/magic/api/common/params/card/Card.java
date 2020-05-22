package io.emerald.magic.api.common.params.card;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.annotations.SerializedName;

/**
 * Represent a Card object response from Scryfall.
 * 
 * @author C4X2
 * @version 1.0.1
 * @see {@link https://scryfall.com/docs/api/cards}
 */
public class Card
{
	/**
	 * The object type for this response. Always will be "card".
	 */
	private String			object;

	/**
	 * Unique Scryfall identifier for this card object. Changes between different
	 * versions of the same card.
	 */
	private String			id;

	/**
	 * A unique ID for this card's oracle identity. This value is consistent across
	 * reprinted card editions, and unique among different cards with the same name
	 * (namely tokens).
	 */
	@SerializedName("oracle_id")
	private String			oracleId;

	/**
	 * This card's multiverse IDs on Gatherer, if any, as an array of integers.
	 */
	@SerializedName("multiverse_ids")
	private int[]			multiverseIds;

	/**
	 * This card's Magic Online ID (also known as the Catalog ID), if any. A large
	 * percentage of cards are not available on Magic Online and do not have this
	 * ID.
	 */
	@SerializedName("mtgo_id")
	private Integer			mtgoId;

	/**
	 * This card's foil Magic Online ID (also known as the Catalog ID), if any. A
	 * large percentage of cards are not available on Magic Online and do not have
	 * this ID.
	 *
	 */
	@SerializedName("mtgo_foil_id")
	private Integer			mtgoFoilId;

	/**
	 * This card's ID on TCGplayer's API, also known as the productId.
	 */
	@SerializedName("tcgplayer_id")
	private Integer			tcgplayerId;

	/**
	 *
	 * The name of this card. If this card has multiple faces, this field will
	 * contain both names separated by //.
	 */
	private String			name;

	/**
	 * Language of the card.
	 */
	private String			lang;

	/**
	 * The date this card was first released.
	 */
	@SerializedName("released_at")
	private Date			releasedAt;

	/**
	 * A link to this card object on Scryfall's API.
	 */
	private String			uri;

	@SerializedName("scryfall_uri")
	private String			scryfallUri;

	private String			layout;

	@SerializedName("highres_image")
	private String			highresImage;

	private ImageUris		imageUris;

	@SerializedName("mana_cost")
	private String			manaCost;

	private Integer			cmc;

	@SerializedName("type_line")
	private String			typeLine;

	@SerializedName("oracle_text")
	private String			oracleText;

	/**
	 * Whenever the API presents set of Magic colors, the field will be an array
	 * that uses the uppercase, single-character abbreviations for those colors. For
	 * example, ["W","U"] represents something that is both white and blue.
	 * Colorless sources are denoted with an empty array []
	 *
	 */
	private String[]		colors;

	@SerializedName("color_identity")
	private String[]		colorIdentity;

	private Legalities		legalities;

	private boolean			reserved;

	private boolean			foil;

	private boolean			nonfoil;

	private boolean			overzied;

	private boolean			promo;

	private boolean			reprint;

	private boolean			variation;

	private String			set;

	@SerializedName("set_name")
	private String			setName;

	@SerializedName("set_type")
	private String			setType;

	@SerializedName("set_uri")
	private String			setUri;

	@SerializedName("set_search_uri")
	private String			setSearchUri;

	@SerializedName("scryfall_set_uri")
	private String			scryfallSetUri;

	@SerializedName("rulings_uri")
	private String			rulingsUri;

	@SerializedName("prints_search_uri")
	private String			printsSearchUri;

	@SerializedName("collector_number")
	private String			collectorNumber;

	private boolean			digital;

	private String			rarity;

	private String			watermark;

	@SerializedName("flavor_text")
	private String			flavorText;

	@SerializedName("card_back_id")
	private String			cardBackId;

	private String			artist;

	@SerializedName("artist_ids")
	private String[]		artistIds;

	@SerializedName("illustration_id")
	private String			illustrationId;

	@SerializedName("border_color")
	private String			borderColor;

	private String			frame;

	@SerializedName("full_art")
	private boolean			fullArt;

	private boolean			textless;

	private boolean			booster;

	@SerializedName("story_spotlight")
	private boolean			storySpotlight;

	@SerializedName("edhrec_rank")
	private Integer			edhrecRank;

	private Prices			prices;

	@SerializedName("related_uris")
	private RelatedUris		relatedUris;

	@SerializedName("purchase_uris")
	private PurchaseUris	purchaseUris;


	@Override
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Card: ").append(getName());
		stringBuilder.append(StringUtils.LF);
		stringBuilder.append("Flavor Text: ").append(getFlavorText());
		stringBuilder.append(StringUtils.LF);
		return stringBuilder.toString();
	}

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
	 * @return the multiverseIds
	 */
	public int[] getMultiverseIds()
	{
		return this.multiverseIds;
	}

	/**
	 * @param multiverseIds the multiverseIds to set
	 */
	public void setMultiverseIds(int[] multiverseIds)
	{
		this.multiverseIds = multiverseIds;
	}

	/**
	 * @return the mtgoId
	 */
	public Integer getMtgoId()
	{
		return this.mtgoId;
	}

	/**
	 * @param mtgoId the mtgoId to set
	 */
	public void setMtgoId(Integer mtgoId)
	{
		this.mtgoId = mtgoId;
	}

	/**
	 * @return the mtgoFoilId
	 */
	public Integer getMtgoFoilId()
	{
		return this.mtgoFoilId;
	}

	/**
	 * @param mtgoFoilId the mtgoFoilId to set
	 */
	public void setMtgoFoilId(Integer mtgoFoilId)
	{
		this.mtgoFoilId = mtgoFoilId;
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
	 * @return the lang
	 */
	public String getLang()
	{
		return this.lang;
	}

	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang)
	{
		this.lang = lang;
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
	 * @return the layout
	 */
	public String getLayout()
	{
		return this.layout;
	}

	/**
	 * @param layout the layout to set
	 */
	public void setLayout(String layout)
	{
		this.layout = layout;
	}

	/**
	 * @return the highresImage
	 */
	public String getHighresImage()
	{
		return this.highresImage;
	}

	/**
	 * @param highresImage the highresImage to set
	 */
	public void setHighresImage(String highresImage)
	{
		this.highresImage = highresImage;
	}

	/**
	 * @return the imageUris
	 */
	public ImageUris getImageUris()
	{
		return this.imageUris;
	}

	/**
	 * @param imageUris the imageUris to set
	 */
	public void setImageUris(ImageUris imageUris)
	{
		this.imageUris = imageUris;
	}

	/**
	 * @return the manaCost
	 */
	public String getManaCost()
	{
		return this.manaCost;
	}

	/**
	 * @param manaCost the manaCost to set
	 */
	public void setManaCost(String manaCost)
	{
		this.manaCost = manaCost;
	}

	/**
	 * @return the cmc
	 */
	public Integer getCmc()
	{
		return this.cmc;
	}

	/**
	 * @param cmc the cmc to set
	 */
	public void setCmc(Integer cmc)
	{
		this.cmc = cmc;
	}

	/**
	 * @return the typeLine
	 */
	public String getTypeLine()
	{
		return this.typeLine;
	}

	/**
	 * @param typeLine the typeLine to set
	 */
	public void setTypeLine(String typeLine)
	{
		this.typeLine = typeLine;
	}

	/**
	 * @return the oracleText
	 */
	public String getOracleText()
	{
		return this.oracleText;
	}

	/**
	 * @param oracleText the oracleText to set
	 */
	public void setOracleText(String oracleText)
	{
		this.oracleText = oracleText;
	}

	/**
	 * @return the colors
	 */
	public String[] getColors()
	{
		return this.colors;
	}

	/**
	 * @param colors the colors to set
	 */
	public void setColors(String[] colors)
	{
		this.colors = colors;
	}

	/**
	 * @return the colorIdentity
	 */
	public String[] getColorIdentity()
	{
		return this.colorIdentity;
	}

	/**
	 * @param colorIdentity the colorIdentity to set
	 */
	public void setColorIdentity(String[] colorIdentity)
	{
		this.colorIdentity = colorIdentity;
	}

	/**
	 * @return the legalities
	 */
	public Legalities getLegalities()
	{
		return this.legalities;
	}

	/**
	 * @param legalities the legalities to set
	 */
	public void setLegalities(Legalities legalities)
	{
		this.legalities = legalities;
	}

	/**
	 * @return the reserved
	 */
	public boolean isReserved()
	{
		return this.reserved;
	}

	/**
	 * @param reserved the reserved to set
	 */
	public void setReserved(boolean reserved)
	{
		this.reserved = reserved;
	}

	/**
	 * @return the foil
	 */
	public boolean isFoil()
	{
		return this.foil;
	}

	/**
	 * @param foil the foil to set
	 */
	public void setFoil(boolean foil)
	{
		this.foil = foil;
	}

	/**
	 * @return the nonfoil
	 */
	public boolean isNonfoil()
	{
		return this.nonfoil;
	}

	/**
	 * @param nonfoil the nonfoil to set
	 */
	public void setNonfoil(boolean nonfoil)
	{
		this.nonfoil = nonfoil;
	}

	/**
	 * @return the overzied
	 */
	public boolean isOverzied()
	{
		return this.overzied;
	}

	/**
	 * @param overzied the overzied to set
	 */
	public void setOverzied(boolean overzied)
	{
		this.overzied = overzied;
	}

	/**
	 * @return the promo
	 */
	public boolean isPromo()
	{
		return this.promo;
	}

	/**
	 * @param promo the promo to set
	 */
	public void setPromo(boolean promo)
	{
		this.promo = promo;
	}

	/**
	 * @return the reprint
	 */
	public boolean isReprint()
	{
		return this.reprint;
	}

	/**
	 * @param reprint the reprint to set
	 */
	public void setReprint(boolean reprint)
	{
		this.reprint = reprint;
	}

	/**
	 * @return the variation
	 */
	public boolean isVariation()
	{
		return this.variation;
	}

	/**
	 * @param variation the variation to set
	 */
	public void setVariation(boolean variation)
	{
		this.variation = variation;
	}

	/**
	 * @return the set
	 */
	public String getSet()
	{
		return this.set;
	}

	/**
	 * @param set the set to set
	 */
	public void setSet(String set)
	{
		this.set = set;
	}

	/**
	 * @return the setName
	 */
	public String getSetName()
	{
		return this.setName;
	}

	/**
	 * @param setName the setName to set
	 */
	public void setSetName(String setName)
	{
		this.setName = setName;
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
	 * @return the setUri
	 */
	public String getSetUri()
	{
		return this.setUri;
	}

	/**
	 * @param setUri the setUri to set
	 */
	public void setSetUri(String setUri)
	{
		this.setUri = setUri;
	}

	/**
	 * @return the setSearchUri
	 */
	public String getSetSearchUri()
	{
		return this.setSearchUri;
	}

	/**
	 * @param setSearchUri the setSearchUri to set
	 */
	public void setSetSearchUri(String setSearchUri)
	{
		this.setSearchUri = setSearchUri;
	}

	/**
	 * @return the scryfallSetUri
	 */
	public String getScryfallSetUri()
	{
		return this.scryfallSetUri;
	}

	/**
	 * @param scryfallSetUri the scryfallSetUri to set
	 */
	public void setScryfallSetUri(String scryfallSetUri)
	{
		this.scryfallSetUri = scryfallSetUri;
	}

	/**
	 * @return the rulingsUri
	 */
	public String getRulingsUri()
	{
		return this.rulingsUri;
	}

	/**
	 * @param rulingsUri the rulingsUri to set
	 */
	public void setRulingsUri(String rulingsUri)
	{
		this.rulingsUri = rulingsUri;
	}

	/**
	 * @return the printsSearchUri
	 */
	public String getPrintsSearchUri()
	{
		return this.printsSearchUri;
	}

	/**
	 * @param printsSearchUri the printsSearchUri to set
	 */
	public void setPrintsSearchUri(String printsSearchUri)
	{
		this.printsSearchUri = printsSearchUri;
	}

	/**
	 * @return the collectorNumber
	 */
	public String getCollectorNumber()
	{
		return this.collectorNumber;
	}

	/**
	 * @param collectorNumber the collectorNumber to set
	 */
	public void setCollectorNumber(String collectorNumber)
	{
		this.collectorNumber = collectorNumber;
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
	 * @return the rarity
	 */
	public String getRarity()
	{
		return this.rarity;
	}

	/**
	 * @param rarity the rarity to set
	 */
	public void setRarity(String rarity)
	{
		this.rarity = rarity;
	}

	/**
	 * @return the watermark
	 */
	public String getWatermark()
	{
		return this.watermark;
	}

	/**
	 * @param watermark the watermark to set
	 */
	public void setWatermark(String watermark)
	{
		this.watermark = watermark;
	}

	/**
	 * @return the flavorText
	 */
	public String getFlavorText()
	{
		return this.flavorText;
	}

	/**
	 * @param flavorText the flavorText to set
	 */
	public void setFlavorText(String flavorText)
	{
		this.flavorText = flavorText;
	}

	/**
	 * @return the cardBackId
	 */
	public String getCardBackId()
	{
		return this.cardBackId;
	}

	/**
	 * @param cardBackId the cardBackId to set
	 */
	public void setCardBackId(String cardBackId)
	{
		this.cardBackId = cardBackId;
	}

	/**
	 * @return the artist
	 */
	public String getArtist()
	{
		return this.artist;
	}

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	/**
	 * @return the artistIds
	 */
	public String[] getArtistIds()
	{
		return this.artistIds;
	}

	/**
	 * @param artistIds the artistIds to set
	 */
	public void setArtistIds(String[] artistIds)
	{
		this.artistIds = artistIds;
	}

	/**
	 * @return the illustrationId
	 */
	public String getIllustrationId()
	{
		return this.illustrationId;
	}

	/**
	 * @param illustrationId the illustrationId to set
	 */
	public void setIllustrationId(String illustrationId)
	{
		this.illustrationId = illustrationId;
	}

	/**
	 * @return the borderColor
	 */
	public String getBorderColor()
	{
		return this.borderColor;
	}

	/**
	 * @param borderColor the borderColor to set
	 */
	public void setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
	}

	/**
	 * @return the frame
	 */
	public String getFrame()
	{
		return this.frame;
	}

	/**
	 * @param frame the frame to set
	 */
	public void setFrame(String frame)
	{
		this.frame = frame;
	}

	/**
	 * @return the fullArt
	 */
	public boolean isFullArt()
	{
		return this.fullArt;
	}

	/**
	 * @param fullArt the fullArt to set
	 */
	public void setFullArt(boolean fullArt)
	{
		this.fullArt = fullArt;
	}

	/**
	 * @return the textless
	 */
	public boolean isTextless()
	{
		return this.textless;
	}

	/**
	 * @param textless the textless to set
	 */
	public void setTextless(boolean textless)
	{
		this.textless = textless;
	}

	/**
	 * @return the booster
	 */
	public boolean isBooster()
	{
		return this.booster;
	}

	/**
	 * @param booster the booster to set
	 */
	public void setBooster(boolean booster)
	{
		this.booster = booster;
	}

	/**
	 * @return the storySpotlight
	 */
	public boolean isStorySpotlight()
	{
		return this.storySpotlight;
	}

	/**
	 * @param storySpotlight the storySpotlight to set
	 */
	public void setStorySpotlight(boolean storySpotlight)
	{
		this.storySpotlight = storySpotlight;
	}

	/**
	 * @return the edhrecRank
	 */
	public Integer getEdhrecRank()
	{
		return this.edhrecRank;
	}

	/**
	 * @param edhrecRank the edhrecRank to set
	 */
	public void setEdhrecRank(Integer edhrecRank)
	{
		this.edhrecRank = edhrecRank;
	}

	/**
	 * @return the prices
	 */
	public Prices getPrices()
	{
		return this.prices;
	}

	/**
	 * @param prices the prices to set
	 */
	public void setPrices(Prices prices)
	{
		this.prices = prices;
	}

	/**
	 * @return the relatedUris
	 */
	public RelatedUris getRelatedUris()
	{
		return this.relatedUris;
	}

	/**
	 * @param relatedUris the relatedUris to set
	 */
	public void setRelatedUris(RelatedUris relatedUris)
	{
		this.relatedUris = relatedUris;
	}

	/**
	 * @return the purchaseUris
	 */
	public PurchaseUris getPurchaseUris()
	{
		return this.purchaseUris;
	}

	/**
	 * @param purchaseUris the purchaseUris to set
	 */
	public void setPurchaseUris(PurchaseUris purchaseUris)
	{
		this.purchaseUris = purchaseUris;
	}
}
