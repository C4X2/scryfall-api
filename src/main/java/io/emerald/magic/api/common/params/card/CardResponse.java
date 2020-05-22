package io.emerald.magic.api.common.params.card;

import java.util.List;

/**
 * When retrieving cards from the Scryfall API they are returned in pages, with
 * 175 cards per page. So to get all the cards multiple pages must be requested.
 * 
 * @author C4X2
 * 
 *
 */
public class CardResponse
{
	private List<Card>	cards;
	private Integer		page;
}
