package com.nacre.onlineShoping.delegate;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Connection;
import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShopping.DTO.ProductDTO;
import com.nacre.onlineShopping.ServicesImpl.ProductServiceImpl;
import com.nacre.onlineShopping.Servies.ProductService;

public class ProductDelegate {

	public int getProductDetailsFromDelegate(ProductDTO productDto) throws SQLException, ParseException, FileNotFoundException{
		ProductService productService=new ProductServiceImpl();
		ProductBO productBo=new ProductBO();
		Connection con=null;
		/*String date1=productDto.getProduct_date();
		SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date ud=sdf.parse(date1);
		Long ms=ud.getTime();*/
		//Date sd=new Date(ms);
		/*DateFormat formatter = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
		Date date = formatter.parse(productDto.getProduct_date());
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());*/
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
		java.util.Date date = sdf1.parse(productDto.getProduct_date());
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
		productBo.setProduct_color(productDto.getProduct_color());
		productBo.setProduct_date(sqlStartDate);
		productBo.setProduct_description(productDto.getProduct_description());
		productBo.setProduct_images(productDto.getProduct_images());
		productBo.setProduct_name(productDto.getProduct_name());
		productBo.setProduct_price(Integer.valueOf(productDto.getProduct_price()));
		productBo.setProduct_quantity(Integer.parseInt(productDto.getProduct_quantity()));
	 // productBo.setAddId(Integer.parseInt(productDto.getAddId()));
		System.out.println("product dwlwgate="+productBo.getAddId());
		return productService.getProductDetailsformService(productBo);
		
		
	}
}
