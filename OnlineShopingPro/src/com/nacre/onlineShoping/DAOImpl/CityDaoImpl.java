package com.nacre.onlineShoping.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.nacre.onlineShoping.DAO.CityDAO;
import com.nacre.onlineShopping.BO.CityBO;
import com.nacre.onlineShopping.dbutl.DataBaseConection;
import com.nacre.onlineShopping.dbutl.QueryUtil;

public class CityDaoImpl implements CityDAO {

	java.sql.Connection connection;
	PreparedStatement preparedSatement;
	ResultSet resultSet;
	List<CityBO> lcityBo=new ArrayList<CityBO>();
	@Override
	public List<CityBO> getCityDetails(int sid) throws ClassNotFoundException, SQLException {
		connection=DataBaseConection.getConnection();
	preparedSatement=connection.prepareStatement(QueryUtil.CITYGET);
	preparedSatement.setInt(1, sid);
		resultSet=preparedSatement.executeQuery();
		while(resultSet.next()){
			CityBO cityBo=new CityBO();
			cityBo.setCtid(resultSet.getInt(1));
			cityBo.setCityName(resultSet.getString(2));
			lcityBo.add(cityBo);
			
		}
		//System.out.println("in cityDao ="+lcityBo);
		return lcityBo;
	}

}
