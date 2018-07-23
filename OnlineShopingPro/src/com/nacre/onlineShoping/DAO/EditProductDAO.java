package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;

public interface EditProductDAO {
	public List<ProductBO> getEditProductDetails() throws SQLException;
}
