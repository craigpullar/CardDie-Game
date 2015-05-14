package designPatterns.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import designPatterns.creational.factory.CardSrc.Card;
import designPatterns.creational.factory.CardSrc.CardGame;
import designPatterns.creational.factory.CardSrc.Deck;
import designPatterns.creational.factory.DieSrc.DieGame;
import designPatterns.creational.factory.Errors.Error;
import designPatterns.creational.factory.Errors.ErrorFactory;
import designPatterns.creational.factory.Errors.ErrorType;
import designPatterns.creational.factory.Value.ValueFactory;
import designPatterns.creational.factory.Value.ValueType;

public class Application {
	
	//Main application loop
	public static void main(String agrs[]) throws IOException {
		DieGame dieGame = new DieGame();//Creates a die game object
		CardGame cardGame = new CardGame();//Creates a card game object
		ErrorFactory eFactory = new ErrorFactory();//Creates an error factory
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//Reads in console input
		
		
		System.out.print("Card (c) or Die (d) game? ");
	    String ans=br.readLine();//Gets console input
	    
	    if (ans.equals("c")){//if user enters c
	    	cardGame.run();//run the card game
	    }
	    else if (ans.equals("d")) {//if user enters d
	    	dieGame.run();//run the die game
	    }
	    else {
	    	 Error error = eFactory.buildError(ErrorType.INPUT);//if user enters anything except c or d
	    	 System.out.println(error.getMessage());//display error message
	    }
	}
}
