package org.appian.app;

import java.util.Objects;
/*
 * Class Card implements interface ICard
 */
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
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * The function equals check the two playing card are equal only if their rank and suits matches.
	 */
	@Override
    public boolean equals(Object obj) {
		if (obj == null) {
			throw new NullPointerException("Object value is null");
        }
		if (!Card.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
		final Card c = (Card) obj;
		return (c.getRank().equals(this.getRank()) && c.getSuit().equals(this.getSuit()));
			
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.cardRank,this.cardSuit);
	}
	/*
	 * (non-Javadoc)
	 * @see org.appian.app.ICard#getStringRepresentation()
	 */
	@Override
	public String getStringRepresentation() {
		return this.cardRank.getName()+this.cardSuit.getSuitSymbol();
	}

}
