package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;

public interface EditProductService {
	public List<ProductBO> getEditProductDetails() throws SQLException;
}
