package com.nacre.onlineShopping.ServicesImpl;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.DAO.ProductDAO;
import com.nacre.onlineShoping.DAOImpl.ProductDAOImpl;
import com.nacre.onlineShopping.DTO.ProductDTO;
import com.nacre.onlineShopping.Servies.ProductService;

public class ProductServiceImpl implements ProductService {

	@Override
	public int getProductDetailsformService(ProductBO productBo) throws SQLException, FileNotFoundException {
		ProductDAO productDao=new ProductDAOImpl();
	return	productDao.getProductDetailsFromDao(productBo);
	
	}

	

}
