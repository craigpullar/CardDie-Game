package designPatterns.creational.factory.Errors;

public abstract class Error {
	
	//---------------\\
	//--[[DECLARE]]--\\
	//---------------\\
	private ErrorType type;
	private String message;
	
	
	//-------------------\\
	//--[[CONSTRUCTOR]]--\\
	//-------------------\\
	public Error(ErrorType type,String message){
		this.setType(type);
		this.setMessage(message);
	}
	
	//-----------------------\\
	//--[[GETTER & SETTER]]--\\
	//-----------------------\\
	public ErrorType getType() {
		return type;
	}

	public void setType(ErrorType type) {
		this.type = type;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
}
