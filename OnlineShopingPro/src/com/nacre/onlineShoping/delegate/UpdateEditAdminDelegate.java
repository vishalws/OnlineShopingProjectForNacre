package com.nacre.onlineShoping.delegate;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShopping.DTO.ProductDTO;
import com.nacre.onlineShopping.DTO.RegistrationDTO;
import com.nacre.onlineShopping.ServicesImpl.UpdateEditAdminServiceImpl;
import com.nacre.onlineShopping.Servies.UpdateEditAdminService;

public class UpdateEditAdminDelegate {
	public int getUpdateEditAdminDataDelegate(ProductDTO productDto) throws ClassNotFoundException, SQLException{
UpdateEditAdminService updateEditAdminService=new UpdateEditAdminServiceImpl();
ProductBO productBo=new ProductBO();
productBo.setAdminId(Integer.parseInt(productDto.getAdminId()));
productBo.setProduct_color(productDto.getProduct_color());
productBo.setProduct_date(Date.valueOf(productDto.getProduct_date()));
productBo.setProduct_description(productDto.getProduct_description());
productBo.setProduct_name(productDto.getProduct_name());
productBo.setProduct_price(Integer.parseInt(productDto.getProduct_price()));
productBo.setProduct_quantity(Integer.parseInt(productDto.getProduct_quantity()));
productBo.setProduct_id(Integer.parseInt(productDto.getProduct_id()));
return updateEditAdminService.getUpdateEditDataService(productBo);
}
	
	public List<RegistrationDTO> getViewRegistrationDelegate() throws ClassNotFoundException, SQLException {
		List<RegistrationDTO> lrdto=null;
		UpdateEditAdminService updateEditAdminService=new UpdateEditAdminServiceImpl();
		lrdto=updateEditAdminService.getViewRegistrationService();
		return lrdto;
		
	}
}
