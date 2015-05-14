package designPatterns.creational.factory.CardSrc;

import designPatterns.creational.factory.Suits.Suit;
import designPatterns.creational.factory.Value.Value;

public class Card {
	
	//---------------\\
	//--[[DECLARE]]--\\
	//---------------\\
	private Suit suit;
	private Value value;
	
	//-------------------\\
	//--[[CONSTRUCTOR]]--\\
	//-------------------\\
	public Card(Suit suit, Value value) {
		this.setSuit(suit);
		this.setValue(value);
	}
	
	//-----------------\\
	//--[[FUNCTIONS]]--\\
	//-----------------\\
	
	//PRINTS THE CARD INFORMATION EG. ACE OF SPACES
	public void printCard() {
		System.out.println(this.getValue().getValueType().toString()+" of " + this.getSuit().getSuitType().toString());
	}
	//-------------------------\\
	//--[[GETTERS & SETTERS]]--\\
	//-------------------------\\
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Value getValue() {
		return value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
}
