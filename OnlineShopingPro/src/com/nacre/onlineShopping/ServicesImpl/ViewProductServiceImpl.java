package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.BO.RatingBO;
import com.nacre.onlineShoping.DAO.ViewProductDAO;
import com.nacre.onlineShoping.DAOImpl.ViewProductDaoImpl;
import com.nacre.onlineShopping.DTO.RatingDTO;
import com.nacre.onlineShopping.Servies.ViewProductService;

public class ViewProductServiceImpl implements ViewProductService {
   ViewProductDAO viewProductDao=new ViewProductDaoImpl();
	@Override
	public List<ProductBO> getViewProductDetails() throws SQLException {
	return viewProductDao.getViewProductDetails();
	
	}
public int getRatingDataisService(RatingBO ratingBo) throws SQLException{
	System.out.println("rating Service");
return viewProductDao.getRatingDao(ratingBo);

}
}
