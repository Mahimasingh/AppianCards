package org.appian.app;

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

	private final int pips;
	private final String name;
	
	Rank(int pips, String name){
		this.pips = pips;
		this.name = name;
	}

}
