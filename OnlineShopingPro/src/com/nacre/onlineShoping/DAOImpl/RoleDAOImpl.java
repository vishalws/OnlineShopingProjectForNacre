package com.nacre.onlineShoping.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.nacre.onlineShoping.BO.RoleBO;
import com.nacre.onlineShoping.DAO.RoleDAO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class RoleDAOImpl implements RoleDAO {
static java.sql.Connection connection;
PreparedStatement preparedStatement;
ResultSet resultSet;
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
	public List<RoleBO> getRoleDetails() throws SQLException {
		List<RoleBO> lroleBo=null;
		preparedStatement=connection.prepareStatement(QueryUtil.GET_ROLE_FROM_TABLE_ROLE);
		resultSet=preparedStatement.executeQuery();
		lroleBo=new ArrayList<RoleBO>();
		while(resultSet.next()){
			RoleBO roleBo=new RoleBO();
			roleBo.setRoleid(resultSet.getInt(1));
			roleBo.setRoleName(resultSet.getString(2));
			lroleBo.add(roleBo);
		}
		return lroleBo;
	}

}
