package designPatterns.creational.factory.DieSrc;
public class DieSideFactory {
	
	//Generates the side depending on the input
	public static DieSide buildDie(DieSideType side) {
		DieSide die = null;
		//each case is a side of the die
		switch(side) {
			case ONE:
				die = new OneDieSide();
				break;
			
			case TWO:
				die = new TwoDieSide();
				break;
			
			case THREE:
				die = new ThreeDieSide();
				break;
			
			case FOUR:
				die = new FourDieSide();
				break;
			
			case FIVE:
				die = new FiveDieSide();
				break;
			
			case SIX:
				die = new SixDieSide();
				break;
		}
		return die;
	}
}
