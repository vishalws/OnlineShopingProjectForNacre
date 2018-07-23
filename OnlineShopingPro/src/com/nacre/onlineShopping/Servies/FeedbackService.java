package com.nacre.onlineShopping.Servies;

import java.sql.SQLException;

import com.nacre.onlineShopping.DTO.FeedbackDTO;

public interface FeedbackService {
public int getFedback(FeedbackDTO dto) throws SQLException;
}
