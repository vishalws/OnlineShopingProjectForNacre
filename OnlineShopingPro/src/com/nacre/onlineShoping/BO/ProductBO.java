package com.nacre.onlineShoping.BO;
import java.sql.Date;

import com.mysql.jdbc.Blob;


public class ProductBO {
	private int adminId;
	private int product_id;
	private String product_name;
	private int product_price;
	private String product_description;
	private String product_images;
	private Date product_date;
	
	private int product_quantity;
	private String product_color;
	private int addId;
	private String userId;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	
	
	
	
	public String getProduct_images() {
		return product_images;
	}
	public void setProduct_images(String product_images) {
		this.product_images = product_images;
	}
	public Date getProduct_date() {
		return product_date;
	}
	public void setProduct_date(Date product_date) {
		this.product_date = product_date;
	}
	
	
	
	public int getProduct_quantity() {
		return product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}
	public String getProduct_color() {
		return product_color;
	}
	public void setProduct_color(String product_color) {
		this.product_color = product_color;
	}
	@Override
	public String toString() {
		return "ProductBO [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_description=" + product_description + ", product_images=" + product_images
				+ ", product_date=" + product_date + ", product_quantity=" + product_quantity + ", product_color="
				+ product_color + ", addId=" + addId + "]";
	}
	

	
	
	
}
