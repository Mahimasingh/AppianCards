package org.appian.app;

import java.util.Objects;
public class Suit implements ISuit {
	private final  String name; // refers to string name of Suit
	private final char symbol; //refers to symbol of the suit
	
	public Suit(String name, char symbol) {
		this.name = name;
		this.symbol = symbol;
	}
	public String getName() {
		return this.name;
	}

	public char getSymbol() {
		return this.symbol;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
    public boolean equals(Object obj) {
		if (obj == null) {
            return false;
        }
		if (!Suit.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
		final ISuit s = (ISuit) obj;
		return (s.getName().equals(this.getName()) && s.getSymbol() ==this.getSymbol());
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
        return Objects.hash(name,symbol);
    }

}
