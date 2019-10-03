package org.appian.app;
/*
 * Enum Suit represents suits of card
 */
public enum Suit {
	
	
	CLUBS ("Clubs", '\u2663'),
	DIAMONDS ("Diamonds", '\u2666'),
	HEARTS ("Hearts", '\u2764'),
	SPADES ("Spades", '\u2660');
	
	public String getSuitName() {
		return suitName;
	}

	public char getSuitSymbol() {
		return suitSymbol;
	}

	private final String suitName; // Name of the suit
	private final char suitSymbol; // Symbol of the suit
	
	Suit(String suitName, char suitSymbol){
		this.suitName = suitName;
		this.suitSymbol = suitSymbol;
	}

}
