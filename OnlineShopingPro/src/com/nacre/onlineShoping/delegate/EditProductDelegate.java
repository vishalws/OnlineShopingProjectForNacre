package com.nacre.onlineShoping.delegate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.DAOImpl.EditProductDAO;
import com.nacre.onlineShopping.DTO.ProductDTO;

public class EditProductDelegate {

	public List<ProductDTO> getEditProductInDelegate() throws SQLException{
		EditProductDAO EditProductDao=new EditProductDAO();
		List<ProductBO> lproductBo=null;
		List<ProductDTO> lproductDto=new ArrayList<ProductDTO>();
		lproductBo = EditProductDao.getEditProductDetails();
		for(ProductBO bo:lproductBo){
			ProductDTO productDto=new ProductDTO();
			productDto.setProduct_id(String.valueOf(bo.getProduct_id()));
			productDto.setProduct_name(bo.getProduct_name());
			productDto.setProduct_price(String.valueOf(bo.getProduct_price()));
			productDto.setProduct_quantity(String.valueOf(bo.getProduct_quantity()));
			productDto.setProduct_color(bo.getProduct_color());
			productDto.setProduct_description(bo.getProduct_description());
			productDto.setProduct_date(String.valueOf(bo.getProduct_date()));
			lproductDto.add(productDto);
		}
		return lproductDto;
		
	}
}
