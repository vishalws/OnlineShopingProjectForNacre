package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;

public interface UserDAO {
public int getUserLogin(String email,String password) throws SQLException;
}
