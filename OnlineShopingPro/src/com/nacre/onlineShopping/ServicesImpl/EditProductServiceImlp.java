package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.DAO.EditProductDAO;
import com.nacre.onlineShopping.Servies.EditProductService;

public class EditProductServiceImlp implements EditProductService{
	EditProductDAO EditProductDao=new com.nacre.onlineShoping.DAOImpl.EditProductDAO();
	@Override
	public List<ProductBO> getEditProductDetails() throws SQLException {
	return EditProductDao.getEditProductDetails();
	
	}
}
