package com.nacre.onlineShopping.BO;

public class CityBO {
private int ctid;
private String cityName;
public int getCtid() {
	return ctid;
}
public void setCtid(int ctid) {
	this.ctid = ctid;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}
@Override
public String toString() {
	return "CityBO [ctid=" + ctid + ", cityName=" + cityName + "]";
}

}
