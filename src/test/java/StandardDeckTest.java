import static org.junit.Assert.*;

import java.util.List;

import org.appian.app.ICard;
import org.appian.app.StandardDeck;
import org.junit.Test;
public class StandardDeckTest {
	
	@Test
	public void testCards() {
		StandardDeck deck = new StandardDeck();
		List<ICard> cards = deck.getCards();
		printCards(cards);
		deck.shuffle();
		System.out.println("After Shuffle");
		printCards(deck.getCards());
		
	}
	
	private void printCards(List<ICard> deck) {
		for(ICard card : deck) {
			System.out.println(card.getRank().getName()+card.getSuit().getSuitSymbol());
		}
	}
	

}
