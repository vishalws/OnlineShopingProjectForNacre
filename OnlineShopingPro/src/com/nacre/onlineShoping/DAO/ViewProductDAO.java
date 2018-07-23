package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.BO.RatingBO;
import com.nacre.onlineShopping.DTO.ProductDTO;

public interface ViewProductDAO {
public List<ProductBO> getViewProductDetails() throws SQLException;
public int getRatingDao(RatingBO ratinBo) throws SQLException;
}
