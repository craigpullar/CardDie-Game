package designPatterns.creational.factory.Errors;

public class InputError extends Error{

	//Creates the input error and the appropriate message
	public InputError() {
		super(ErrorType.INPUT, "Input not recognised by system, please try again.");
		// TODO Auto-generated constructor stub
	}

}
