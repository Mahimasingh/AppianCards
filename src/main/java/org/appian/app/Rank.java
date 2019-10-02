package org.appian.app;

import java.util.Objects;

public class Rank implements IRank {
	
	private final String rankName; // refers to name of the rank
	private final int pips; // refers to the number of pips 
	private final char initials; // a short name of Rank
	
	public Rank(String name, int pips, char initials) {
		this.rankName = name;
		this.pips = pips;
		this.initials = initials;
	}

	public String getName() {
		return this.rankName;
	}

	public int getPips() {
		return this.pips;
	}

	public char getShortName() {
		return this.initials;
	}
	
	@Override
    public boolean equals(Object obj) {
		if (obj == null) {
            return false;
        }
		if (!Rank.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
		final IRank r = (IRank) obj;
		return (r.getName().equals(this.getName()) && r.getPips() == this.getPips());
			
	}
	
	@Override
	public int hashCode() {
        return Objects.hash(rankName,pips);
    }


}
