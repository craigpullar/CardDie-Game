package designPatterns.creational.factory.DieSrc;


import designPatterns.creational.factory.LinearCongruentialGenerator;
import designPatterns.creational.factory.RandomInterface;

public class Die {
	
	//---------------\\
	//--[[DECLARE]]--\\
	//---------------\\
	private DieSide showing;
	private DieSide[] sides;
	private DieSideFactory sideFactory;
	private RandomInterface randInter;
	
	//------------------\\
	//--[[CONSTRUCTOR]]--\\
	//-------------------\\
	public Die() {
		this.setSideFactory(new DieSideFactory());
		this.setRandInter(new LinearCongruentialGenerator());
		//Use side factory to build a die using all the possible sides 1-6
		DieSide[] sides = {
		                   this.getSideFactory().buildDie(DieSideType.ONE),
		                   this.getSideFactory().buildDie(DieSideType.TWO),
		                   this.getSideFactory().buildDie(DieSideType.THREE),
		                   this.getSideFactory().buildDie(DieSideType.FOUR),
		                   this.getSideFactory().buildDie(DieSideType.FIVE),
		                   this.getSideFactory().buildDie(DieSideType.SIX)
						};      
		this.setSides(sides);                     
	}
	
	//----------------\\
	//--[[FUNCTIONS]]--\\
	//-----------------\\
	
	//use random interface to pick a random side
	public DieSide roll() {
		int index = (int) (this.getRandInter().next() * this.getSides().length);
		DieSide dieSide = this.getSides()[index];
		return dieSide;
	}
	
	//-------------------------\\
	//--[[GETTERS & SETTERS]]--\\
	//-------------------------\\
	public DieSide getShowing() {
		return showing;
	}

	public void setShowing(DieSide showing) {
		this.showing = showing;
	}

	public DieSide[] getSides() {
		return sides;
	}

	public void setSides(DieSide[] sides) {
		this.sides = sides;
	}

	public DieSideFactory getSideFactory() {
		return sideFactory;
	}

	public void setSideFactory(DieSideFactory sideFactory) {
		this.sideFactory = sideFactory;
	}

	public RandomInterface getRandInter() {
		return randInter;
	}

	public void setRandInter(RandomInterface randInter) {
		this.randInter = randInter;
	}
}
