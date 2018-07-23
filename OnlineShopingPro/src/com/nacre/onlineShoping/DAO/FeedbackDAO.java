package com.nacre.onlineShoping.DAO;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShopping.DTO.FeedbackDTO;

public interface FeedbackDAO {
public 

int getFeedback(FeedbackDTO feedbackDto) throws SQLException;
}
