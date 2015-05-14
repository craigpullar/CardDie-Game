package designPatterns.creational.factory.Value;

public enum ValueType {
	
	//defines all value types and their string input
	ACE("ACE"),
	TWO("TWO"),
	THREE("THREE"),
	FOUR("FOUR"),
	FIVE("FIVE"),
	SIX("SIX"),
	SEVEN("SEVEN"),
	EIGHT("EIGHT"),
	NINE("NINE"),
	TEN("TEN"),
	JACK("JACK"),
	QUEEN("QUEEN"),
	KING("KING");
	
	
	//methods to overide toString function to allow String output
	private final String name; 
	 private ValueType(String s) {
      name = s;
  }

  public boolean equalsName(String otherName){
      return (otherName == null)? false:name.equals(otherName);
  }

  public String toString(){
     return name;
  }
}
