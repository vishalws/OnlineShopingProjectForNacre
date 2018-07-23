package com.nacre.onlineShoping.delegate;

import java.sql.SQLException;

import com.nacre.onlineShopping.DTO.FeedbackDTO;
import com.nacre.onlineShopping.ServicesImpl.FeedbackServiceImpl;
import com.nacre.onlineShopping.Servies.FeedbackService;

public class FeedbackDelegate {
FeedbackService feedbacService=new FeedbackServiceImpl();
public int getFeedbackDelegate(FeedbackDTO feedbackDto) throws SQLException{
    return	feedbacService.getFedback(feedbackDto);

	
}
}
