package io.emerald.magic.api.common.params.set;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import io.emerald.magic.api.common.params.card.Card;

/**
 * When getting the cards in a set, a list of cards is returned and stored in
 * this object.
 * 
 * @author C4X2
 * @version 1.0
 * 
 *
 */
public class SetResponse
{
	private List<Card>	data;
	@SerializedName("total_cards")
	private Integer		totalCards;
	@SerializedName("has_more")
	private boolean		hasMore;
	@SerializedName("next_page")
	private String		nextPage;

	/**
	 * @return the data
	 */
	public List<Card> getData()
	{
		return this.data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<Card> data)
	{
		this.data = data;
	}

	/**
	 * @return the totalCards
	 */
	public Integer getTotalCards()
	{
		return this.totalCards;
	}

	/**
	 * @param totalCards the totalCards to set
	 */
	public void setTotalCards(Integer totalCards)
	{
		this.totalCards = totalCards;
	}

	/**
	 * @return the hasMore
	 */
	public boolean isHasMore()
	{
		return this.hasMore;
	}

	/**
	 * @param hasMore the hasMore to set
	 */
	public void setHasMore(boolean hasMore)
	{
		this.hasMore = hasMore;
	}

	/**
	 * @return the nextPage
	 */
	public String getNextPage()
	{
		return this.nextPage;
	}

	/**
	 * @param nextPage the nextPage to set
	 */
	public void setNextPage(String nextPage)
	{
		this.nextPage = nextPage;
	}

}
