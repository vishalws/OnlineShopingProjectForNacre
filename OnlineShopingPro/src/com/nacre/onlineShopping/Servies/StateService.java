package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShopping.BO.StateBO;
import com.nacre.onlineShopping.DTO.StateDetailsDTO;

public interface StateService {
	public List<StateBO> getStateDetails(int cid) throws ClassNotFoundException, SQLException;
	

}
