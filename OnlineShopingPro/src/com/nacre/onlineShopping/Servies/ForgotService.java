package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;

public interface ForgotService {
public int getFordotPassword(String email,String pwd) throws SQLException;
public int getFordotPasswordAdmin(String email,String pwd) throws SQLException;
}
