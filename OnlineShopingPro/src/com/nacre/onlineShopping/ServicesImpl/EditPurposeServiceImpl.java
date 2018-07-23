package com.nacre.onlineShopping.ServicesImpl;

import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShoping.DAO.EditPurposeDAO;
import com.nacre.onlineShoping.DAOImpl.EditPurposeDaoImpl;
import com.nacre.onlineShopping.Servies.EditPurposeService;

public class EditPurposeServiceImpl implements EditPurposeService {

	@Override
	public List<ProductBO> getEditPurposeDetaService(int pid) throws SQLException {
		EditPurposeDAO editPurposeDao=new EditPurposeDaoImpl();
		return editPurposeDao.getEditPurposeData(pid);
		
	}

}
