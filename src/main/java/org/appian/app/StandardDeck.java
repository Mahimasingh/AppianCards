package org.appian.app;

import java.util.ArrayList;


public class StandardDeck extends Deck implements IDeck {
	StandardDeck() {

		suits =  new ISuit[4];
		suits[0] = new Suit("Club",(char)'\u2663');
		suits[1] = new Suit("Spade",(char)'\u2660');
		suits[2] = new Suit("Diamond",(char)'\u2666');
		suits[3] = new Suit("Heart",(char)'\u2764');
		ranks =  new IRank[13];
		ranks[0] = new Rank("1",1,'A');
		ranks[1] = new Rank("2",2,'2');
		ranks[2] = new Rank("3",3,'3');
		ranks[3] = new Rank("4",4,'4');
		ranks[4] = new Rank("5",5,'5');
		ranks[5] = new Rank("6",6,'6');
		ranks[6] = new Rank("7",7,'7');
		ranks[7] = new Rank("8",8,'8');
		ranks[8] = new Rank("9",9,'9');
		ranks[9] = new Rank("10",10,'T');
		ranks[10] = new Rank("11",0,'J');
		ranks[11] = new Rank("12",0,'Q');
		ranks[12] = new Rank("13",0,'K');
		deck = new ArrayList<ICard>();
		for(int i = 0; i < ranks.length; i++) {
			for(int j = 0; j < suits.length; j++) {
				ICard c = new Card(ranks[i],suits[j]);
				deck.add(c);
			}
		}
		size = suits.length * ranks.length;
	}
}
