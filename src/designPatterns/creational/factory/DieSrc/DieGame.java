package designPatterns.creational.factory.DieSrc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DieGame {
	
	//---------------\\
	//--[[DECLARE]]--\\
	//---------------\\
	
	private Die die;
	private BufferedReader br;
	
	//-------------------\\
	//--[[CONSTRUCTOR]]--\\
	//-------------------\\
	public DieGame() {
		this.setDie(new Die());
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	//-----------------\\
	//--[[FUNCTIONS]]--\\
	//-----------------\\
	
	//Run the dice game
	public void run() throws IOException {
		ArrayList<DieSide> rolledNumbers = new ArrayList<DieSide>();
    	
        for (int i=0; i<2; i++) {//loop and wait for user input
            System.out.println("Hit <RETURN> to roll the die");
            br.readLine();
            
            DieSide rolled = die.roll();//roll dice and get result
            System.out.println("You rolled " + rolled.getSide().toString() + "\n");//print result
            rolledNumbers.add(rolled);//add result to list
        }
        
        // Display the numbers rolled
        System.out.println("Numbers rolled: ");
        for (DieSide side: rolledNumbers) {
        	System.out.println(side.getSide().toString());
        }

        // Now see if (s)he has won!
        boolean win = false;
        for (DieSide side: rolledNumbers) {
        	if (side.getSide() == DieSideType.ONE){//if side equals 1
        		win = true;//win
        		break;
        	}
        	else win = false;//else lose
        }
        //print result
        if (win) System.out.println("\nYou won!");
        else System.out.println("\nYou lost!");
	}
	
	//------------------------\\
	//-[[GETTERS & SETTERS]]--\\
	//------------------------\\
	
	public Die getDie() {
		return die;
	}

	public void setDie(Die die) {
		this.die = die;
	}
 }
