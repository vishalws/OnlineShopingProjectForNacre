package com.nacre.onlineShoping.delegate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.onlineShopping.BO.StateBO;
import com.nacre.onlineShopping.DTO.StateDetailsDTO;
import com.nacre.onlineShopping.ServicesImpl.StateServiceImpl;
import com.nacre.onlineShopping.Servies.StateService;

public class StateDelegate {

	public List<StateDetailsDTO> getStateDetails(String cid) throws ClassNotFoundException, SQLException{
		StateService stateService=new StateServiceImpl();
		List<StateBO> stateBo=null;
		List<StateDetailsDTO> lstateDetailsDto=new ArrayList<StateDetailsDTO>();
		//System.out.println("statedelegate="+cid);
		 int cid1=Integer.parseInt(cid);
		stateBo=stateService.getStateDetails(cid1);
		for(StateBO bo:stateBo){
			StateDetailsDTO stateDetailsDTO=new StateDetailsDTO();
			stateDetailsDTO.setSid(String.valueOf(bo.getSid()));
			stateDetailsDTO.setStateName(bo.getStateName());
			lstateDetailsDto.add(stateDetailsDTO);
		}
		//System.out.println("stateDelegate="+lstateDetailsDto);
		return lstateDetailsDto;
		
		
		
		
	}
}
