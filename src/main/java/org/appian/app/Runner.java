package org.appian.app;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/*
 * Runner class contains the main method to invoke the application.
 * How to invoke : java -jar Assignment-0.0.1-SNAPSHOT.jar org.appian.app.Runner
 */
public class Runner {
	
	private static void printCards(List<ICard> deck) {
		for(ICard card : deck) 
			System.out.println(card.getStringRepresentation());
		}
	public static void main(String[] args) {
		System.out.println("Press 1 to see contents of deck"+"\nPress 2 to deal one card"+"\nPress 3 to shuffle \n Press 4 to exit");
		int input = 0;
		StandardDeck deck = new StandardDeck();
		try(Scanner scanner = new Scanner(System.in)) { 
		do {
			input = scanner.nextInt();
			switch(input) {
			case 1 : printCards(deck.getCards());
					break;
			case 2 : ICard card = deck.dealOneCard();
					System.out.println("Card dealt : "+ card.getStringRepresentation());
					break;
			case 3 : deck.shuffle();
					System.out.println("Cards shuffled successfully!! Press 1 to look at contents");
					break;
			case 4 : scanner.close();
					System.exit(1);
			default :
	            System.out.println("Invalid option. Please enter 1/2/3/4");
			}
			System.out.println("Enter your option ---->");
		}while(input > 0);
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter numbers only. Exiting!!!");
		}
		catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}

}
