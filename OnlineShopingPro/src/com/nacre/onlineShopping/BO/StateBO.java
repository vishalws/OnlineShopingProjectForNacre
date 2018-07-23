package com.nacre.onlineShopping.BO;

public class StateBO {
private int sid;
private String stateName;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
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
	return "StateBO [sid=" + sid + ", stateName=" + stateName + "]";
}

}
