package org.appian.app;

import java.util.List;
import java.util.Random;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Deck implements IDeck {
	List<ICard> deck;
	ISuit[] suits;
	IRank[] ranks;
	int size;
	private static final Logger logger = LogManager.getLogger(Deck.class);
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

	public ICard pullCard() {
		if(deck.isEmpty()) {
			logger.error("The Deck is empty. Cannot Pull any card.");
			return null;
		}
		ICard pulledCard = deck.get(0);
		deck.remove(0);
		logger.info("Successfully Pulled first Card from Deck.");
		return pulledCard;
	}

	public List<ICard> getCards() {
		return this.deck;
	}

}
