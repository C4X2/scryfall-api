package io.emerald.magic.api;

import io.emerald.magic.api.cards.CardsAPI;
import io.emerald.magic.api.rulings.RulingsAPI;
import io.emerald.magic.api.sets.SetsAPI;

/**
 * 
 * @author C4X2
 *
 */
public class ScryfallAPI
{
	private CardsAPI	cardsAPI;
	private RulingsAPI	rulingAPI;
	private SetsAPI		setsAPI;

	public ScryfallAPI()
	{
		init();
	}

	private void init()
	{
		this.setCardsAPI(new CardsAPI());
		this.setRulingAPI(new RulingsAPI());
		this.setSetsAPI(new SetsAPI());
	}

	/**
	 * @return the cardsAPI
	 */
	public CardsAPI getCardsAPI()
	{
		return cardsAPI;
	}

	/**
	 * @param cardsAPI the cardsAPI to set
	 */
	public void setCardsAPI(CardsAPI cardsAPI)
	{
		this.cardsAPI = cardsAPI;
	}

	/**
	 * @return the rulingAPI
	 */
	public RulingsAPI getRulingAPI()
	{
		return this.rulingAPI;
	}

	/**
	 * @param rulingAPI the rulingAPI to set
	 */
	public void setRulingAPI(RulingsAPI rulingAPI)
	{
		this.rulingAPI = rulingAPI;
	}

	/**
	 * @return the setsAPI
	 */
	public SetsAPI getSetsAPI()
	{
		return this.setsAPI;
	}

	/**
	 * @param setsAPI the setsAPI to set
	 */
	public void setSetsAPI(SetsAPI setsAPI)
	{
		this.setsAPI = setsAPI;
	}

}
