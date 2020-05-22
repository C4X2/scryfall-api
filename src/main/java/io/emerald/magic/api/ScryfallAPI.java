package io.emerald.magic.api;

import io.emerald.magic.api.cards.CardsAPI;

/**
 * 
 * @author C4X2
 *
 */
public class ScryfallAPI
{
	private CardsAPI cardsAPI;
	
	public ScryfallAPI()
	{
		init();
	}

	private void init()
	{
		this.setCardsAPI(new CardsAPI());	
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

}
