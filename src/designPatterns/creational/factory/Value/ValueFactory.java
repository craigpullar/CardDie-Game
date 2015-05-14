package designPatterns.creational.factory.Value;
//creates value factory
public class ValueFactory {
	public static Value buildValue(ValueType valueType){
		Value value = null;
		//creates value based on input
		switch(valueType) {
			case ACE:
				value = new AceValue();
				break;
				
			case TWO:
				value = new TwoValue();
				break;
				
			case THREE:
				value = new ThreeValue();
				break;
				
			case FOUR:
				value = new FourValue();
				break;
				
			case FIVE:
				value = new FiveValue();
				break;
				
			case SIX:
				value = new SixValue();
				break;
				
			case SEVEN:
				value = new SevenValue();
				break;
				
			case EIGHT:
				value = new EightValue();
				break;
				
			case NINE:
				value = new NineValue();
				break;
				
			case TEN:
				value = new TenValue();
				break;
				
			case JACK:
				value = new JackValue();
				break;
				
			case QUEEN:
				value = new QueenValue();
				break;
				
			case KING:
				value = new KingValue();
				break;
				
		}
		return value;
	}
}
