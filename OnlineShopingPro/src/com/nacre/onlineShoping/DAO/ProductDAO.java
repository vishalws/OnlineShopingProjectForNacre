package com.nacre.onlineShoping.DAO;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShopping.DTO.ProductDTO;

public interface ProductDAO {
public int getProductDetailsFromDao(ProductBO productBo) throws SQLException, FileNotFoundException;
}
