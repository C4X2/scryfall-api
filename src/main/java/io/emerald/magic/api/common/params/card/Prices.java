package io.emerald.magic.api.common.params.card;

import com.google.gson.annotations.SerializedName;

/**
 * This contains the different prices available for MTG cards.
 * 
 * @author C4X2
 * @version 1.0
 *
 */
public class Prices
{
	private Double	usd;

	@SerializedName("usd_foil")
	private Double	usdFoil;

	private Double	eur;

	private Double	tix;

	/**
	 * @return the usd
	 */
	public Double getUsd()
	{
		return this.usd;
	}

	/**
	 * @param usd the usd to set
	 */
	public void setUsd(Double usd)
	{
		this.usd = usd;
	}

	/**
	 * @return the usdFoil
	 */
	public Double getUsdFoil()
	{
		return this.usdFoil;
	}

	/**
	 * @param usdFoil the usdFoil to set
	 */
	public void setUsdFoil(Double usdFoil)
	{
		this.usdFoil = usdFoil;
	}

	/**
	 * @return the eur
	 */
	public Double getEur()
	{
		return this.eur;
	}

	/**
	 * @param eur the eur to set
	 */
	public void setEur(Double eur)
	{
		this.eur = eur;
	}

	/**
	 * @return the tix
	 */
	public Double getTix()
	{
		return this.tix;
	}

	/**
	 * @param tix the tix to set
	 */
	public void setTix(Double tix)
	{
		this.tix = tix;
	}
}
