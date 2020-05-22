package io.emerald.magic.api.common.params.card;

/**
 * Contains the different uris you can purchase the card at.
 * 
 * @author C4X2
 * @version 1.0
 * @see {@link #Card.java}
 */
public class PurchaseUris
{
	private String	tcgplayer;
	private String	cardmarket;
	private String	cardhoarder;

	/**
	 * @return the tcgplayer
	 */
	public String getTcgplayer()
	{
		return this.tcgplayer;
	}

	/**
	 * @param tcgplayer the tcgplayer to set
	 */
	public void setTcgplayer(String tcgplayer)
	{
		this.tcgplayer = tcgplayer;
	}

	/**
	 * @return the cardmarket
	 */
	public String getCardmarket()
	{
		return this.cardmarket;
	}

	/**
	 * @param cardmarket the cardmarket to set
	 */
	public void setCardmarket(String cardmarket)
	{
		this.cardmarket = cardmarket;
	}

	/**
	 * @return the cardhoarder
	 */
	public String getCardhoarder()
	{
		return this.cardhoarder;
	}

	/**
	 * @param cardhoarder the cardhoarder to set
	 */
	public void setCardhoarder(String cardhoarder)
	{
		this.cardhoarder = cardhoarder;
	}

}
