package com.nacre.onlineShoping.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.DAO.EditPurposeDAO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class EditPurposeDaoImpl implements EditPurposeDAO {
static java.sql.Connection connection=null;
PreparedStatement preparedStatement=null;
ResultSet resultSet=null;
List<ProductBO> lProductBo=new ArrayList<ProductBO>();
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
	

	@Override
	public List<ProductBO> getEditPurposeData(int pid) throws SQLException {
		preparedStatement=connection.prepareStatement(QueryUtil.GET_EDIT_PURPOSE_PRODUCT_DETAILS);
		preparedStatement.setInt(1, pid);
		if(preparedStatement !=null){
			resultSet=preparedStatement.executeQuery();
			
		}//if
		if(resultSet !=null){
			
			while(resultSet.next()){
				//create onject ProductBO
			ProductBO productBo=new ProductBO();
			productBo.setProduct_id(resultSet.getInt(1));
			productBo.setProduct_name(resultSet.getString(2));
			productBo.setProduct_price(resultSet.getInt(3));
			productBo.setProduct_description(resultSet.getString(4));
			productBo.setProduct_date(resultSet.getDate(5));
			productBo.setProduct_color(resultSet.getString(6));
			productBo.setProduct_quantity(resultSet.getInt(7));
			lProductBo.add(productBo);
			}//while
		}//if
		return lProductBo;
	}

}
