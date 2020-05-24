package io.emerald.magic.api.rulings;

import java.util.List;

import io.emerald.magic.api.cards.CardsAPI;
import io.emerald.magic.api.common.params.card.Card;
import io.emerald.magic.api.common.params.rulings.RuleSet;
import io.emerald.magic.api.common.params.rulings.Ruling;

public class RulingsAPI
{
	private CardsAPI cardsAPI;

	public RulingsAPI()
	{
		init();
	}

	private void init()
	{
		this.setCardsAPI(new CardsAPI());
	}

	public List<Ruling> getRulings(Card card)
	{
		return null; //TODO
	}

	/**
	 * Receives the rules from the given rule set
	 * 
	 * @param card a card object
	 * @param ruleSet which rule set to follow
	 * @throws UnknownRuleSetException when the given ruleset does not exist or is
	 *         null
	 *
	 * @return a list of rules for the given card object, an empty list if non exist
	 *         or the card is null.
	 */
	public List<Ruling> getRulings(Card card, RuleSet ruleSet)
	{
		return null;
	}

	public List<Ruling> getRulings(String cardname)
	{
		return getRulings(cardname, false);
	}

	public List<Ruling> getRulings(String cardName, boolean fuzzy)
	{
		Card card = getCardsAPI().searchForCard(cardName, fuzzy);
		return getRulings(card);
	}

	/**
	 * @return the cardsAPI
	 */
	public CardsAPI getCardsAPI()
	{
		return this.cardsAPI;
	}

	/**
	 * @param cardsAPI the cardsAPI to set
	 */
	public void setCardsAPI(CardsAPI cardsAPI)
	{
		this.cardsAPI = cardsAPI;
	}
}
