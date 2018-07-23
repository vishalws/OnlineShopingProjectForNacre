package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.BO.RatingBO;

public interface ViewProductService {

	public List<ProductBO> getViewProductDetails() throws SQLException;
	public int getRatingDataisService(RatingBO ratingBo) throws SQLException;
}
