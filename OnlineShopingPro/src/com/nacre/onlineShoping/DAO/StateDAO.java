package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShopping.BO.StateBO;
import com.nacre.onlineShopping.DTO.StateDetailsDTO;

public interface StateDAO {
public List<StateBO> getStateDetails(int cid) throws ClassNotFoundException, SQLException;

}
