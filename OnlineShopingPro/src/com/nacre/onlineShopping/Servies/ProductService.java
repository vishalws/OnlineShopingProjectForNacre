package com.nacre.onlineShopping.Servies;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import com.nacre.onlineShoping.BO.ProductBO;

public interface ProductService {

public int getProductDetailsformService(ProductBO productBo) throws SQLException, FileNotFoundException;
}
