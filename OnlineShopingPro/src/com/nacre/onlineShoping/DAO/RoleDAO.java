package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.RoleBO;

public interface RoleDAO {

	public List<RoleBO> getRoleDetails() throws SQLException;
}
