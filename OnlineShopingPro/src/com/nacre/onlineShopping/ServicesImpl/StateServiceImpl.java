package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.DAO.StateDAO;
import com.nacre.onlineShoping.DAOImpl.StateDAOImpl;
import com.nacre.onlineShopping.BO.StateBO;
import com.nacre.onlineShopping.DTO.StateDetailsDTO;
import com.nacre.onlineShopping.Servies.StateService;

public class StateServiceImpl implements StateService {

	@Override
	public List<StateBO> getStateDetails(int cid) throws ClassNotFoundException, SQLException {
		StateDAO stateDao=new StateDAOImpl();
		return stateDao.getStateDetails(cid);
	
	}

}
