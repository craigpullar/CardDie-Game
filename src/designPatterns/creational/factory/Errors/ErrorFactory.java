package designPatterns.creational.factory.Errors;

public class ErrorFactory {
	//Factory for building errors
	public static Error buildError(ErrorType errorType) {
		Error error = null;
		switch (errorType) {
		//Creates error based on input
			case INPUT:
				error = new InputError();
				break;
		}
		return error;
	}
}
