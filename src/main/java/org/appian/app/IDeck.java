package org.appian.app;
import java.util.List;

/*
 * @author : Mahima Singh
 * This interface provides an abstract view of Deck
 */
public interface IDeck {
	
	/*
	 * Function to shuffle the deck of cards randomly 
	 */
	void shuffle();
	
	/*
	 * @returns : An object of type Card
	 * The function pulls the first card from the deck
	 */
	ICard pullCard();
	
	/*
	 * @returns : List<Cards
	 * This method returns the list of cards in the deck.
	 */
	List<ICard> getCards();
	
	

}
