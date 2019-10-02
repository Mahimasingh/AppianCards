package org.appian.app;


public class Card implements ICard {
	IRank cardRank; // Refers to rank of the card
	ISuit cardSuit; // refers to suit of the card
	
	public Card(IRank rank, ISuit suit) {
		this.cardRank = rank;
		this.cardSuit = suit;
	}
	public IRank getRank() {
		return this.cardRank;
	}

	public ISuit getSuit() {
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

}
