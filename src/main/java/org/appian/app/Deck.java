package org.appian.app;

import java.util.List;
import java.util.Random;
/*
 * Class Deck implements the interface IDeck
 */

public class Deck implements IDeck {
	protected List<ICard> deck;
	/*
	 * (non-Javadoc)
	 * @see org.appian.app.IDeck#shuffle()
	 * Here we are randomly shuffling the cards using Fisher-Yates shuffle algorithm.
	 * Please read here for more information : https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle
	 */
	public void shuffle() {
		Random random = new Random();
		int index;
		ICard tmp;
		for (int i = deck.size()- 1; i > 0; i--)
	    {
	        index = random.nextInt(i + 1);
	        if (index != i)
	        {
	               tmp = deck.get(index);
	               deck.set(index, deck.get(i));
	               deck.set(i, tmp);
	        }
	    }
		
	}
	/*
	 * (non-Javadoc)
	 * @see org.appian.app.IDeck#dealOneCard()
	 * 
	 */
	public ICard dealOneCard() {
		if(deck.isEmpty()) {
			throw new  IllegalStateException("Deck of cards is empty!!");
		}
		ICard pulledCard = deck.get(0);
		deck.remove(0);
		return pulledCard;
	}
	/*
	 * (non-Javadoc)
	 * @see org.appian.app.IDeck#getCards()
	 */
	public List<ICard> getCards() {
		return this.deck;
	}

}
