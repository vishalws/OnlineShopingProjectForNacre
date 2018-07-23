package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;

import com.nacre.onlineShoping.DAO.FeedbackDAO;
import com.nacre.onlineShoping.DAOImpl.FeedbackDAOImpl;
import com.nacre.onlineShopping.DTO.FeedbackDTO;
import com.nacre.onlineShopping.Servies.FeedbackService;

public class FeedbackServiceImpl implements FeedbackService {

	@Override
	public int getFedback(FeedbackDTO feedbackDto) throws SQLException {
		FeedbackDAO feedbacDao=new FeedbackDAOImpl();
	return feedbacDao.getFeedback(feedbackDto);
	
	}

}
