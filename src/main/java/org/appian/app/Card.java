package org.appian.app;

import java.util.Objects;

public class Card implements ICard {
	Rank cardRank; // Refers to rank of the card
	Suit cardSuit; // refers to suit of the card
	
	public Card(Rank rank, Suit suit) {
		this.cardRank = rank;
		this.cardSuit = suit;
	}
	public Rank getRank() {
		return this.cardRank;
	}

	public Suit getSuit() {
		return this.cardSuit;
	}
	
	@Override
    public boolean equals(Object obj) {
		if (obj == null) {
			throw new NullPointerException("Object value is null");
        }
		if (!Card.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
		final ICard c = (ICard) obj;
		return (c.getRank().equals(this.getRank()) && c.getSuit().equals(this.getSuit()));
			
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.cardRank,this.cardSuit);
	}

}
