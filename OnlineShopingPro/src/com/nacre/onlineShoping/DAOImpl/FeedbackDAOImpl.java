package com.nacre.onlineShoping.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.nacre.onlineShoping.DAO.FeedbackDAO;
import com.nacre.onlineShopping.DTO.FeedbackDTO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class FeedbackDAOImpl implements FeedbackDAO {
static java.sql.Connection connection;
PreparedStatement preparedStatement;
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
	public int getFeedback(FeedbackDTO dto) throws SQLException {
		int count=0;
		preparedStatement=connection.prepareStatement(QueryUtil.INSERT_FEEDBACK_TABLE);
		preparedStatement.setString(1, dto.getFeedback());
		preparedStatement.setInt(2, dto.getProductid());
		preparedStatement.setInt(3, dto.getUserid());
		count=preparedStatement.executeUpdate();
		if(count==0){
			System.out.println("feddback is not inserted");
		}
		else {
			System.out.println("feddback is  inserted");
		}
		return count;
	}

}
