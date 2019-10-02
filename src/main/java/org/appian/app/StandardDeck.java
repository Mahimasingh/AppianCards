package org.appian.app;

import java.util.ArrayList;
import java.util.List;

public class StandardDeck extends Deck implements IDeck {
	public StandardDeck() {

		this.deck = new ArrayList<>();
		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				ICard card = new Card(rank,suit);
				this.deck.add(card);
			}
		}
	}
	
	public StandardDeck(List<ICard> cards) {
		this.deck = cards;
	}
}
