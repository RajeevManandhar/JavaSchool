package com.as.util;

public class State {
	
	private String stateName;
	private String stateCode;
	private String stateCapital;

	public State(String stateName, String stateCode, String stateCapital){
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.stateCapital = stateCapital;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateCapital() {
		return stateCapital;
	}
	public void setStateCapital(String stateCapital) {
		this.stateCapital = stateCapital;
	}

	public String toString(){
		String string = this.getStateName() + " " + this.getStateCode()+" "+this.getStateCapital();
		return string;
	}
}
