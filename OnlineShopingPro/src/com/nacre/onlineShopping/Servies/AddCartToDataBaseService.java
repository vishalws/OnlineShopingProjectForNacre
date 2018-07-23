package com.nacre.onlineShopping.Servies;

import com.nacre.onlineShopping.DTO.OrderSummaryDTO;

public interface AddCartToDataBaseService {
public int getAddCartToDataBaseService(OrderSummaryDTO orderSummaryDTO,int userid) throws Exception;
}
