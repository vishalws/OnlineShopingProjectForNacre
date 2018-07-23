package com.nacre.onlineShopping.DTO;

import java.io.File;

public class ProductDTO {
	private String AdminId;
	private String product_id;
	private String product_name;
	private String product_price;
	private String product_description;
	private String product_images;
	private String product_date;
	private String product_quantity;
	private String product_color;
	private String addId;
	private String userId;

	public String getAdminId() {
		return AdminId;
	}

	public void setAdminId(String adminId) {
		AdminId = adminId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getAddId() {
		return addId;
	}

	public void setAddId(String addId) {
		this.addId = addId;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_price() {
		return product_price;
	}

	public void setProduct_price(String product_price) {
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

	public String getProduct_date() {
		return product_date;
	}

	public void setProduct_date(String product_date) {
		this.product_date = product_date;
	}

	public String getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(String product_quantity) {
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
		return "ProductDTO [product_id=" + product_id + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_description=" + product_description + ", product_images=" + product_images
				+ ", product_date=" + product_date + ", product_quantity=" + product_quantity + ", product_color="
				+ product_color + ", addId=" + addId + "]";
	}

}
