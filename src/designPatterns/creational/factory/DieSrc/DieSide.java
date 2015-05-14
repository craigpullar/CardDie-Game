package designPatterns.creational.factory.DieSrc;

public abstract class DieSide {
	private DieSideType sideType;
	
	//This class is a prototype for the 6 possibilities a side can have
	

	
	protected abstract void construct();//Possible function on die build
	
	//--[[GETTERS & SETTERS]]--\\
	public DieSide(DieSideType side){
		this.setSide(side);
	}

	public DieSideType getSide() {
		return sideType;
	}
	public void setSide(DieSideType side) {
		this.sideType = side;
	}
}
