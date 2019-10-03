package org.appian.app;

import java.util.List;
import java.util.Random;


public class Deck implements IDeck {
	protected List<ICard> deck;
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

	public ICard dealOneCard() {
		if(deck.isEmpty()) {
			throw new  IllegalStateException("Deck of cards is empty!!");
		}
		ICard pulledCard = deck.get(0);
		deck.remove(0);
		return pulledCard;
	}

	public List<ICard> getCards() {
		return this.deck;
	}

}
