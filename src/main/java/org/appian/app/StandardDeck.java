package org.appian.app;

import java.util.ArrayList;
import java.util.List;
/*
 * Standard deck is deck of poker-style playing cards.
(Fifty-two playing cards in four suits: hearts, spades, clubs, diamonds, with face values of Ace,
2-10, Jack, Queen, and King.)
 */
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

}
