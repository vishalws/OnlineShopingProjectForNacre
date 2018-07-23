package com.nacre.onlineShopping.DTO;

public class AddressDTO {
private String addid;


public String getAddid() {
	return addid;
}

public void setAddid(String addid) {
	this.addid = addid;
}

@Override
public String toString() {
	return "AddressDTO [addid=" + addid + "]";
}

}
