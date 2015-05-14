package designPatterns.creational.factory.Suits;

public abstract class Suit {
	
	//---------------\\
	//--[[DECLARE]]--\\
	//---------------\\
	private SuitType suitType;

	//-------------------\\
	//--[[CONSTRUCTOR]]--\\
	//-------------------\\
	public  Suit(SuitType suit) {
		this.setSuitType(suit);
	}

	//-------------------------\\
	//--[[GETTERS & SETTERS]]--\\
	//-------------------------\\

	public SuitType getSuitType() {
		return suitType;
	}


	public void setSuitType(SuitType suitType) {
		this.suitType = suitType;
	}

}

