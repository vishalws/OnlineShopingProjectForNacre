package com.nacre.onlineShoping.DAOImpl;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Blob;
import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.BO.RatingBO;
import com.nacre.onlineShoping.DAO.ViewProductDAO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class ViewProductDaoImpl implements ViewProductDAO {
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
	public List<ProductBO> getViewProductDetails() throws SQLException {
		preparedStatement=connection.prepareStatement(QueryUtil.GET_VIEW_PRODUCT_DETAILS_FOR_USER);
		resultSet=preparedStatement.executeQuery();
		ProductBO productBo=null;
		
		
		
		while(resultSet.next()){
			/*Blob img= (Blob) resultSet.getBlob(4);
			byte[] imgByte=img.getBytes(1, (int) img.length());
			InputStream binaryStream=resultSet.getBinaryStream(4);
			System.out.println("ViewProduct Image in DAO"+binaryStream);*/
			/*ByteArrayInputStream bis=new ByteArrayInputStream(imgByte);*/
		/*System.out.println("productid="+resultSet.getInt(1));
		System.out.println("productName="+resultSet.getString(2));
		System.out.println("productprice="+resultSet.getInt(3));
		//System.out.println("productimagee="+binaryStream);
		System.out.println("productcolor="+resultSet.getString(5));
		System.out.println("productquantity="+resultSet.getInt(6));
		Blob blob=(Blob)resultSet.getBlob(4);
		System.out.println(blob);
		InputStream in=blob.getBinaryStream();
		System.out.println(in);
		java.sql.Blob imageBlob =  resultSet.getBlob(4);
		InputStream binaryStream = imageBlob.getBinaryStream(1, imageBlob.length());
		System.out.println("binary="+binaryStream);
		byte[] imgage=resultSet.getBytes(4);
		System.out.println(imgage);*/
			productBo=new ProductBO();
			productBo.setProduct_id(resultSet.getInt(1));
			productBo.setProduct_name(resultSet.getString(2));
			productBo.setProduct_price(resultSet.getInt(3));
			productBo.setProduct_images(String.valueOf(resultSet.getString(4)));
			productBo.setProduct_color(resultSet.getString(5));
			productBo.setProduct_quantity(resultSet.getInt(6));
		
			lproductBo.add(productBo);
			
		}
		System.out.println("productDAo="+lproductBo);
		return lproductBo;
	}
	
	public int getRatingDao(RatingBO ratinBo) throws SQLException
	{
		System.out.println("rating dao");
		int result=0;
		preparedStatement=connection.prepareStatement(QueryUtil.INSERT_RATING_RATING_TABLR);
		preparedStatement.setInt(1, ratinBo.getRating());
		preparedStatement.setInt(2, ratinBo.getProduct_id());
		preparedStatement.setInt(3, ratinBo.getUser_id());
		result=preparedStatement.executeUpdate();
		if(result !=0){
			System.out.println("rating is inserted");
		}
		else{
			System.out.println("rating is not inserted");
		}
		return result;
		
	}
}
