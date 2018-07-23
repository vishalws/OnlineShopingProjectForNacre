package com.nacre.onlineShopping.DTO;

public class CountryDetailsDTO {
	
	private int cid;
	private String countryName;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
@Override
public String toString() {
	return "CountryDetailsDTO [cid=" + cid + ", countryName=" + countryName + "]";
}
}
