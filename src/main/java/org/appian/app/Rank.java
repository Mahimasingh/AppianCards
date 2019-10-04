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
	JACK(11,"Jack"),
	QUEEN(12,"Queen"),
	KING(13,"King"),
	ACE(1,"Ace");

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	private final int value; //Refers to the value of rank
	private final String name; //Name of Rank

	Rank(int value, String name){
		this.value = value;
		this.name = name;
	}

}
