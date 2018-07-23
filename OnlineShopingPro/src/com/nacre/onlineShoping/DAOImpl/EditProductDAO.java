package com.nacre.onlineShoping.DAOImpl;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Blob;
import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.DAO.ViewProductDAO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class EditProductDAO implements com.nacre.onlineShoping.DAO.EditProductDAO {

		static java.sql.Connection connection;
		PreparedStatement preparedStatement;
		ResultSet resultSet;

		List<ProductBO> lproductBo=new ArrayList<ProductBO>();
		static{
			try {
				connection=DataBaseConection.getConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//SELECT PRODUCT_ID,PRODUCT_NAME,PRODUCT_PRICE,PRODUCT_IMAGE,PRODUCT_COLOR,PRODUCT_QUANTITY, FROM TABLE_ADD_PRODUCTS
			@Override
			public List<ProductBO> getEditProductDetails() throws SQLException {
				preparedStatement=connection.prepareStatement(QueryUtil.GET_VIEW_PRODUCT_DETAILS);
				resultSet=preparedStatement.executeQuery();
				ProductBO productBo=null;
				
				
				
				while(resultSet.next()){
					/*Blob img= (Blob) resultSet.getBlob(4);
					byte[] imgByte=img.getBytes(1, (int) img.length());
					InputStream binaryStream=resultSet.getBinaryStream(4);
					System.out.println("ViewProduct Image in DAO"+binaryStream);*/
					/*ByteArrayInputStream bis=new ByteArrayInputStream(imgByte);*/
				
					
					
					productBo=new ProductBO();
					productBo.setProduct_id(resultSet.getInt(1));
					productBo.setProduct_name(resultSet.getString(2));
					productBo.setProduct_price(resultSet.getInt(3));
					productBo.setProduct_quantity(resultSet.getInt(6));
					productBo.setProduct_date(resultSet.getDate(7));
					
					productBo.setProduct_description(resultSet.getString(4));
					productBo.setProduct_color(resultSet.getString(5));
				
				
					lproductBo.add(productBo);
					
				}
				System.out.println("productDAo="+lproductBo);
				return lproductBo;
			}

}
