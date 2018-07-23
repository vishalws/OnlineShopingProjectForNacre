package com.nacre.onlineShoping.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.onlineShoping.DAO.StateDAO;
import com.nacre.onlineShopping.BO.StateBO;
import com.nacre.onlineShopping.DTO.CountryDetailsDTO;
import com.nacre.onlineShopping.DTO.StateDetailsDTO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class StateDAOImpl implements StateDAO {
Connection connection;
PreparedStatement preparedStatement;
ResultSet resultSet;
CountryDetailsDTO countryDatailsDto=new CountryDetailsDTO();
List<StateBO> slist=new ArrayList<StateBO>();
StateDetailsDTO stateDetails=new StateDetailsDTO();
	@Override
	public List<StateBO> getStateDetails(int cid) throws ClassNotFoundException, SQLException {
		connection=DataBaseConection.getConnection();
		preparedStatement=connection.prepareStatement(QueryUtil.STATESELECT);
		preparedStatement.setInt(1,cid);
		resultSet=preparedStatement.executeQuery();
		while(resultSet.next()){
			StateBO stateBo=new StateBO();
			stateBo.setSid(resultSet.getInt(1));
			stateBo.setStateName(resultSet.getString(2));
			
			slist.add(stateBo);
		//	System.out.println("inside while bo="+stateBo);
		}
		//System.out.println("list BO="+slist);
		return slist;
	}

}
