package org.appian.app;
/*
 * Rank enumeration refers to rank of the card in a standard deck.
 * 
 */
public enum Rank {
	
	TWO(2,"Two"),
	THREE(3,"Three"),
	FOUR(4,"Four"),
	FIVE(5,"Five"),
	SIX(6,"Six"),
	SEVEN(7,"Seven"),
	EIGHT(8,"Eight"),
	NINE(9,"Nine"),
	TEN(10,"Ten"),
	JACK(0,"Jack"),
	QUEEN(0,"Queen"),
	KING(0,"King"),
	ACE(0,"Ace");
	
	public int getPips() {
		return pips;
	}

	public String getName() {
		return name;
	}

	private final int pips; //Number of symbols on a playing card that denote its suit and value.
	private final String name; //Name of Rank
	
	Rank(int pips, String name){
		this.pips = pips;
		this.name = name;
	}

}
