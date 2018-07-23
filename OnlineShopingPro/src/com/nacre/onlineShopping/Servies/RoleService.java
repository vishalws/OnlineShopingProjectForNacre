package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.RoleBO;

public interface RoleService {
public List<RoleBO> getRoleDetailsFromService() throws SQLException;
}
