package designPatterns.creational.factory.CardSrc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import designPatterns.creational.factory.Errors.ErrorFactory;
import designPatterns.creational.factory.Value.ValueFactory;
import designPatterns.creational.factory.Value.ValueType;

public class CardGame {
	
	//---------------\\
	//--[[DECLARE]]--\\
	//---------------\\
	private ValueFactory vFactory;
	BufferedReader br;
	
	//-------------------\\
	//--[[CONSTRUCTOR]]--\\
	//-------------------\\
	public CardGame(){
		 vFactory = new ValueFactory();
		 br = new BufferedReader(new InputStreamReader(System.in));
		
	}
	//-----------------\\
	//--[[FUNCTIONS]]--\\
	//-----------------\\
	
	//Function to run the game
	public void run() throws IOException {
		Deck deck = new Deck(); //Create new deck object
    	deck.shuffle();//Shuffle the deck
    	deck.printDeck();//print the deck to console
    	ArrayList<Card> chosen = new ArrayList<Card>();//Create array list of chosen cards
        for (int i=0; i<2; i++) {
            System.out.println("Hit <RETURN> to choose a card");
            br.readLine();//wait for user input
            Card choice = deck.pickCard();//Pick a random card
            System.out.println("You chose:");
            choice.printCard();//print chosen card
            System.out.println("\n");
            chosen.add(choice);//add it to list of chosen cards
            deck.getCards().remove(chosen);//remove card from deck
        }
        // Display the cards chosen and remaining cards
        System.out.println("Cards chosen: ");
        for (Card card:chosen) {//for all chosen cards
        	card.printCard();//print card
        }
        System.out.println("Remaining cards: ");
        deck.printDeck();//print the remaining deck
        boolean win = false;
        for (Card card:chosen) {//for chosen cards
        	if (card.getValue().getValueType() == ValueType.ACE) {//if it is an ace
        		win = true;//user wins
        		break;
        	}
        	else win = false;//user loses if not an ace
        }
        //print result
        if (win) System.out.println("\nYou won!");
        else System.out.println("\nYou lost!");
	}
}
