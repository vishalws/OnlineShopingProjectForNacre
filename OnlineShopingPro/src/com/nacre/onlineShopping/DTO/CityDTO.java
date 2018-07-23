package com.nacre.onlineShopping.DTO;

public class CityDTO {

	private String ctid;
	private String cityName;
	public String getCtid() {
		return ctid;
	}
	public void setCtid(String ctid) {
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
		return "CityDTO [ctid=" + ctid + ", cityName=" + cityName + "]";
	}
	
}
