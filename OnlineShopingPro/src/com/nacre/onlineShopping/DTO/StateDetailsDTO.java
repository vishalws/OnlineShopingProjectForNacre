package com.nacre.onlineShopping.DTO;

public class StateDetailsDTO {

	private String sid;
	private String stateName;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "StateDetailsDTO [sid=" + sid + ", stateName=" + stateName + "]";
	}
	
	
}
