package org.appian.app;
/*
 * @author : Mahima Singh
 * Interface defines an abstract view of Card
 */
public interface ICard {
	
	/*
	 *  @returns : An object of type Rank
	 *  The function returns the Rank of the Card
	 */
	IRank getRank();
	/*
	 * @returns : An object of type Suit
	 * The function returns the Suit of the card
	 */
	ISuit getSuit();

}
