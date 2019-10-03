package org.appian.app;

/*
 *
 * Interface defines an abstract view of Card
 */
public interface ICard {
	
	/*
	 *  @returns : Enum type Rank
	 *  The function returns the Rank of the Card
	 */
	Rank getRank();
	/*
	 * @returns : Enum type Suit
	 * The function returns the Suit of the card
	 */
	Suit getSuit();
	/*
	 * @returns : String representation of card
	 */
	String getStringRepresentation();

}
