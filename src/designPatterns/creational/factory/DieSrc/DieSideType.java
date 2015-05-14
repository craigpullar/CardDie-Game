package designPatterns.creational.factory.DieSrc;

public enum DieSideType {
	//Declares the possible sides of the die
	//In brackets is the string output
	ONE("ONE"),
	TWO("TWO"),
	THREE("THREE"),
	FOUR("FOUR"),
	FIVE("FIVE"),
	SIX("SIX");
	
	//Functions to allow for string output
	private final String name; 
	 private DieSideType(String s) {
        name = s;
    }

    public boolean equalsName(String otherName){
        return (otherName == null)? false:name.equals(otherName);
    }

    public String toString(){
       return name;
    }
}
