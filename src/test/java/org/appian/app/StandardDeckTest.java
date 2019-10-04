package org.appian.app;
import static org.junit.Assert.*;

import java.util.List;

import org.appian.app.ICard;
import org.appian.app.StandardDeck;
import org.junit.Test;
public class StandardDeckTest {

	@Test
	public void testCardShuffle() {
		StandardDeck deck = new StandardDeck();
		printCards(deck.getCards());
		deck.shuffle();
		printCards(deck.getCards());

	}

	private void printCards(List<ICard> deck) {
		for(ICard card : deck) {
			System.out.println(card.getStringRepresentation());
		}
	}

	@Test
	public void testCardPull() {
		StandardDeck deck = new StandardDeck();
		assertNotEquals(deck.dealOneCard(),deck.dealOneCard());
	}

	@Test(expected=IllegalStateException.class)
	public void testCardPullFailure() throws Exception {
		StandardDeck deck = new StandardDeck();
		for(int i =0; i <53 ; i++)
			deck.dealOneCard();
	}





}
