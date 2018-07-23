package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;

public interface ForgotPwdDAO {
public int getPassword(String email,String pwd) throws SQLException;
public int getPasswordAdmin(String email,String pwd) throws SQLException;
}
