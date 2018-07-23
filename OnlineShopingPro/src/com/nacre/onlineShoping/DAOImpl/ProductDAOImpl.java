package com.nacre.onlineShoping.DAOImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.DAO.ProductDAO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class ProductDAOImpl implements ProductDAO {
static java.sql.Connection connection;
PreparedStatement preparedStatement;
ResultSet resultSet;
       static{
    	   try {
			connection = DataBaseConection.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       }
	@Override
	public int getProductDetailsFromDao(ProductBO productBo) throws SQLException, FileNotFoundException {
		int count=0;
		Timestamp time=new Timestamp(System.currentTimeMillis());
		preparedStatement=connection.prepareStatement(QueryUtil.INSERT_PRODUCT_DETAILS_TABLE_PRODUCT);
		preparedStatement.setString(1, productBo.getProduct_name());
		preparedStatement.setInt(2, productBo.getProduct_price());
		preparedStatement.setString(3, productBo.getProduct_description());
		preparedStatement.setString(4, productBo.getProduct_images());//(4, (InputStream)is,(int)file.length());
		preparedStatement.setDate(5, productBo.getProduct_date());
		preparedStatement.setTimestamp(6, time);
		preparedStatement.setInt(7, productBo.getProduct_quantity());
		preparedStatement.setString(8, productBo.getProduct_color());
		preparedStatement.setInt(9, 3);//productBo.getAddId());
	
	     count=preparedStatement.executeUpdate();
		if(count==0){
			System.out.println("product is not inserted");
		}
		else {
			System.out.println("product is inserted");
		}
		
		return count;
	}

}
