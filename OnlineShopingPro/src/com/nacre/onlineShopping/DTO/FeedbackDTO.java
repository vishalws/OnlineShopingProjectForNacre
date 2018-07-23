package com.nacre.onlineShopping.DTO;

public class FeedbackDTO {
private int productid;
private int userid;
private String feedback;
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getFeedback() {
	return feedback;
}
public void setFeedback(String feedback) {
	this.feedback = feedback;
}
}
