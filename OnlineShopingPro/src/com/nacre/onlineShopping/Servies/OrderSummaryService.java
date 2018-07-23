package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShopping.DTO.OrderSummaryDTO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;

public interface OrderSummaryService {
public List<OrderSummaryDTO> getUserDetailsService(int user,String product_id) throws SQLException;
}
