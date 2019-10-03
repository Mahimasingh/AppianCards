package org.appian.app;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
public class CardTest {
	
	@Test
	public void testCard() {
		ICard card = new Card(Rank.ACE,Suit.CLUBS);
		assertEquals(Rank.ACE, card.getRank());
		assertEquals(Suit.CLUBS,card.getSuit());
		ICard testCard = new Card(Rank.ACE,Suit.CLUBS);
		assertEquals(card,testCard);
		ICard testCard2 = new Card(Rank.ACE,Suit.DIAMONDS);
		assertNotEquals(card,testCard2);
	}

}
