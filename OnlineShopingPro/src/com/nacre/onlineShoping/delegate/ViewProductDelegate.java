package com.nacre.onlineShoping.delegate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.BO.RatingBO;
import com.nacre.onlineShoping.DAO.ViewProductDAO;
import com.nacre.onlineShoping.DAOImpl.ViewProductDaoImpl;
import com.nacre.onlineShopping.DTO.ProductDTO;
import com.nacre.onlineShopping.DTO.RatingDTO;
import com.nacre.onlineShopping.ServicesImpl.ViewProductServiceImpl;
import com.nacre.onlineShopping.Servies.ViewProductService;

public class ViewProductDelegate {
	ViewProductService viewProductService=new ViewProductServiceImpl();
	ViewProductDAO viewProductDao=new ViewProductDaoImpl();
public List<ProductDTO> getViewProductInDelegate() throws SQLException{
	
	List<ProductBO> lproductBo=null;
	List<ProductDTO> lproductDto=new ArrayList<ProductDTO>();
	lproductBo=viewProductDao.getViewProductDetails();
	for(ProductBO bo:lproductBo){
		ProductDTO productDto=new ProductDTO();
		productDto.setProduct_id(String.valueOf(bo.getProduct_id()));
		productDto.setProduct_name(bo.getProduct_name());
		productDto.setProduct_price(String.valueOf(bo.getProduct_price()));
		productDto.setProduct_quantity(String.valueOf(bo.getProduct_quantity()));
		productDto.setProduct_color(bo.getProduct_color());
		productDto.setProduct_images(bo.getProduct_images());
		lproductDto.add(productDto);
	}
	return lproductDto;
	
}

public int getRatingDetailsDelegate(RatingDTO dto) throws SQLException{
	System.out.println("rating delegate");
	RatingBO ratingBO=new RatingBO();
	ratingBO.setRating(Integer.parseInt(dto.getRating().replaceAll("'", "")));
	ratingBO.setProduct_id(dto.getProduct_id());
	ratingBO.setUser_id(dto.getUser_id());
	return viewProductService.getRatingDataisService(ratingBO);
	
	
	
	
}
}
