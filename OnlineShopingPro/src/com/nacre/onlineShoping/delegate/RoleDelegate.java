package com.nacre.onlineShoping.delegate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.onlineShoping.BO.RoleBO;
import com.nacre.onlineShopping.DTO.RoleDTO;
import com.nacre.onlineShopping.ServicesImpl.RoleServiceImpl;
import com.nacre.onlineShopping.Servies.RoleService;

public class RoleDelegate {
	public List<RoleDTO> getRoleDetailsFromDelegate() throws SQLException{
		List<RoleDTO> lroleDto=new ArrayList<RoleDTO>();
		List<RoleBO> lroleBo=null;
		RoleService roleService=new RoleServiceImpl();
		lroleBo= roleService.getRoleDetailsFromService();
		for(RoleBO bo:lroleBo){
			RoleDTO roleDto=new RoleDTO();
			roleDto.setRoleid(String.valueOf(bo.getRoleid()));
			roleDto.setRoleName(bo.getRoleName());
			lroleDto.add(roleDto);
		}
		return lroleDto;
		
		
	}

}
