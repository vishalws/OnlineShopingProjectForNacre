package com.nacre.onlineShoping.delegate;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nacre.onlineShoping.BO.ProductBO;
import com.nacre.onlineShopping.DTO.ProductDTO;
import com.nacre.onlineShopping.ServicesImpl.EditProductServiceImlp;
import com.nacre.onlineShopping.ServicesImpl.EditPurposeServiceImpl;
import com.nacre.onlineShopping.Servies.EditProductService;
import com.nacre.onlineShopping.Servies.EditPurposeService;

public class EditPurposeDelegate {
public List<ProductDTO> getEditPurposeDataDelegate(String pid) throws SQLException{
	EditPurposeService editPurposeSrvice=new EditPurposeServiceImpl();
	List<ProductBO> lproductBo=null;
	List<ProductDTO> ldto=new ArrayList<ProductDTO>();
	//create productBO object
	//ProductBO bo=new ProductBO();
	int pid1=Integer.parseInt(pid);
	lproductBo= editPurposeSrvice.getEditPurposeDetaService(pid1);
	for(ProductBO bo:lproductBo){
		ProductDTO dto=new ProductDTO();
		dto.setProduct_color(bo.getProduct_color());
		dto.setProduct_date(String.valueOf(bo.getProduct_date()));
		dto.setProduct_description(bo.getProduct_description());
		dto.setProduct_id(String.valueOf(bo.getProduct_id()));
		dto.setProduct_name(bo.getProduct_name());
		dto.setProduct_price(String.valueOf(bo.getProduct_price()));
		dto.setProduct_quantity(String.valueOf(bo.getProduct_quantity()));
		ldto.add(dto);
	}
	return ldto;
	
}
}
