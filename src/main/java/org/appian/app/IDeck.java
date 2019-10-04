package org.appian.app;
import java.util.List;

/*
 * 
 * This interface provides an abstract view of Deck
 */
public interface IDeck {

	/*
	 * Function to shuffle the deck of cards randomly 
	 */
	void shuffle();

	/*
	 * @returns : An object of type Card
	 * @throws : Illegal State Exception when deck is empty
	 * The function pulls the first card from the deck.
	 */
	ICard dealOneCard();

	/*
	 * @returns : A list of cards
	 * This method returns the list of cards in the deck.
	 */
	List<ICard> getCards();



}
