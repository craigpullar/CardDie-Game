package designPatterns.creational.factory.Value;

public abstract class Value {
	
	//---------------\\
	//--[[DECLARE]]--\\
	//---------------\\
	private ValueType valueType;
	
	//-------------------\\
	//--[[CONSTRUCTOR]]--\\
	//-------------------\\
	public Value(ValueType newValue) {
		this.setValueType(newValue);
	}

	//-------------------------\\
	//--[[GETTERS & SETTERS]]--\\
	//-------------------------\\
	public ValueType getValueType() {
		return valueType;
	}

	public void setValueType(ValueType valueType) {
		this.valueType = valueType;
	}

}
