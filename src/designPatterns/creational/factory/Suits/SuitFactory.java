package designPatterns.creational.factory.Suits;

public class SuitFactory {
	//Factory for building suits
		public static Suit buildSuit(SuitType suitType) {
			Suit suit = null;
			//builds suit depending on input
			switch(suitType) {
				case HEARTS:
					suit = new HeartSuit();
					break;
					
				case DIAMONDS:
					suit = new DiamondSuit();
					break;
					
				case CLUBS:
					suit = new ClubSuit();
					break;
					
				case SPADES:
					suit = new SpadeSuit();
					break;
			}
			return suit;
		}
}
