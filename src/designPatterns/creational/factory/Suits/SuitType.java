package designPatterns.creational.factory.Suits;

public enum SuitType {
	
	//defines types of suits and there string outputs
	CLUBS("CLUBS"),
	HEARTS("HEARTS"),
	SPADES("SPADES"),
	DIAMONDS("DIAMONDS");
	
	
	//overrides toString to allow for string output
	private final String name; 
	 private SuitType(String s) {
       name = s;
   }

   public boolean equalsName(String otherName){
       return (otherName == null)? false:name.equals(otherName);
   }

   public String toString(){
      return name;
   }
}
