package io.emerald.magic.api.common.params.card;

import io.emerald.magic.api.common.utils.JsonUtil;

public class Legalities
{
	private String	standard;
	private String	future;
	private String	historic;
	private String	pioneer;
	private String	modern;
	private String	legacy;
	private String	pauper;
	private String	vintage;
	private String	penny;
	private String	commander;
	private String	brawl;
	private String	duel;
	private String	oldschool;

	@Override
	public String toString()
	{
		return JsonUtil.toJson(this);
	}

	/**
	 * @return the standard
	 */
	public String getStandard()
	{
		return this.standard;
	}

	/**
	 * @param standard the standard to set
	 */
	public void setStandard(String standard)
	{
		this.standard = standard;
	}

	/**
	 * @return the future
	 */
	public String getFuture()
	{
		return this.future;
	}

	/**
	 * @param future the future to set
	 */
	public void setFuture(String future)
	{
		this.future = future;
	}

	/**
	 * @return the historic
	 */
	public String getHistoric()
	{
		return this.historic;
	}

	/**
	 * @param historic the historic to set
	 */
	public void setHistoric(String historic)
	{
		this.historic = historic;
	}

	/**
	 * @return the pioneer
	 */
	public String getPioneer()
	{
		return this.pioneer;
	}

	/**
	 * @param pioneer the pioneer to set
	 */
	public void setPioneer(String pioneer)
	{
		this.pioneer = pioneer;
	}

	/**
	 * @return the modern
	 */
	public String getModern()
	{
		return this.modern;
	}

	/**
	 * @param modern the modern to set
	 */
	public void setModern(String modern)
	{
		this.modern = modern;
	}

	/**
	 * @return the legacy
	 */
	public String getLegacy()
	{
		return this.legacy;
	}

	/**
	 * @param legacy the legacy to set
	 */
	public void setLegacy(String legacy)
	{
		this.legacy = legacy;
	}

	/**
	 * @return the pauper
	 */
	public String getPauper()
	{
		return this.pauper;
	}

	/**
	 * @param pauper the pauper to set
	 */
	public void setPauper(String pauper)
	{
		this.pauper = pauper;
	}

	/**
	 * @return the vintage
	 */
	public String getVintage()
	{
		return this.vintage;
	}

	/**
	 * @param vintage the vintage to set
	 */
	public void setVintage(String vintage)
	{
		this.vintage = vintage;
	}

	/**
	 * @return the penny
	 */
	public String getPenny()
	{
		return this.penny;
	}

	/**
	 * @param penny the penny to set
	 */
	public void setPenny(String penny)
	{
		this.penny = penny;
	}

	/**
	 * @return the commander
	 */
	public String getCommander()
	{
		return this.commander;
	}

	/**
	 * @param commander the commander to set
	 */
	public void setCommander(String commander)
	{
		this.commander = commander;
	}

	/**
	 * @return the brawl
	 */
	public String getBrawl()
	{
		return this.brawl;
	}

	/**
	 * @param brawl the brawl to set
	 */
	public void setBrawl(String brawl)
	{
		this.brawl = brawl;
	}

	/**
	 * @return the duel
	 */
	public String getDuel()
	{
		return this.duel;
	}

	/**
	 * @param duel the duel to set
	 */
	public void setDuel(String duel)
	{
		this.duel = duel;
	}

	/**
	 * @return the oldschool
	 */
	public String getOldschool()
	{
		return this.oldschool;
	}

	/**
	 * @param oldschool the oldschool to set
	 */
	public void setOldschool(String oldschool)
	{
		this.oldschool = oldschool;
	}
}
