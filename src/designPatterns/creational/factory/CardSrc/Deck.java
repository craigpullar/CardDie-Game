package designPatterns.creational.factory.CardSrc;

import java.util.ArrayList;

import designPatterns.creational.factory.LinearCongruentialGenerator;
import designPatterns.creational.factory.RandomInterface;
import designPatterns.creational.factory.Suits.Suit;
import designPatterns.creational.factory.Suits.SuitFactory;
import designPatterns.creational.factory.Suits.SuitType;
import designPatterns.creational.factory.Value.Value;
import designPatterns.creational.factory.Value.ValueFactory;
import designPatterns.creational.factory.Value.ValueType;

public class Deck {
	//---------------\\
	//--[[DECLARE]]--\\
	//---------------\\
	private ArrayList<Card> cards;
	private ValueFactory valueFactory;
	private SuitFactory suitFactory;
	private RandomInterface randInter;
	
	//------------------\\
	//--[[CONSTRUCTOR]]--\\
	//-------------------\\
	public Deck() {
		this.setRandInter(new LinearCongruentialGenerator());
		this.setValueFactory(new ValueFactory());
		this.setSuitFactory(new SuitFactory());
		this.setCards(this.generateDeck());
	}
	
	//-----------------\\
	//--[[FUNCTIONS]]--\\
	//-----------------\\
	public ArrayList<Card> generateDeck() {
		
		//Use factory to create a list of suits
		Suit[] suits = {
				this.getSuitFactory().buildSuit(SuitType.HEARTS),
				this.getSuitFactory().buildSuit(SuitType.DIAMONDS),
				this.getSuitFactory().buildSuit(SuitType.CLUBS),
				this.getSuitFactory().buildSuit(SuitType.SPADES)
		};
		
		//use factory to create a list of values
		Value[] values = {
				this.getValueFactory().buildValue(ValueType.ACE),
				this.getValueFactory().buildValue(ValueType.TWO),
				this.getValueFactory().buildValue(ValueType.THREE),
				this.getValueFactory().buildValue(ValueType.FOUR),
				this.getValueFactory().buildValue(ValueType.FIVE),
				this.getValueFactory().buildValue(ValueType.SIX),
				this.getValueFactory().buildValue(ValueType.SEVEN),
				this.getValueFactory().buildValue(ValueType.EIGHT),
				this.getValueFactory().buildValue(ValueType.NINE),
				this.getValueFactory().buildValue(ValueType.TEN),
				this.getValueFactory().buildValue(ValueType.JACK),
				this.getValueFactory().buildValue(ValueType.QUEEN),
				this.getValueFactory().buildValue(ValueType.KING)
		};
		ArrayList<Card> cards = new ArrayList<Card>();
			for(Suit suit:suits) {//loop through suit list
				for(Value value:values) {//loop through value list
					cards.add(new Card(suit,value));//Create card and add it to deck
				}
			}
		return cards;//return deck

	}
	
	public void shuffle() {
		ArrayList<Card> cards = this.getCards();
	      for (int i=0; i<100; i++) {
	          // choose two random cards at random and swap them, 100 times
	          int firstIndex=((int) (this.getRandInter().next() * 52));
	          int secondIndex=((int) (this.getRandInter().next() * 52));

	          Card temp = cards.get(firstIndex);
	          cards.set(firstIndex, cards.get(secondIndex));
	          cards.set(secondIndex, temp);
	        }
	      this.setCards(cards);
	}
	
	public void printDeck() {//Print each card in deck
		for(Card card:this.getCards()) {
			System.out.println(card.getValue().getValueType().toString()+" of " + card.getSuit().getSuitType().toString());
		}
	}
	public Card pickCard() {//Use RandomInterface to pick a random card from the deck
		int index = (int) (this.getRandInter().next() * this.getCards().size());
		Card card = this.getCards().get(index);
		return card;
	}
	
	//-------------------------\\
	//--[[GETTERS & SETTERS]]--\\
	//-------------------------\\
	public RandomInterface getRandInter() {
		return randInter;
	}

	public void setRandInter(RandomInterface randInter) {
		this.randInter = randInter;
	}

	public SuitFactory getSuitFactory() {
		return suitFactory;
	}

	public void setSuitFactory(SuitFactory suitFactory) {
		this.suitFactory = suitFactory;
	}

	public ValueFactory getValueFactory() {
		return valueFactory;
	}

	public void setValueFactory(ValueFactory valueFactory) {
		this.valueFactory = valueFactory;
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
	
}
