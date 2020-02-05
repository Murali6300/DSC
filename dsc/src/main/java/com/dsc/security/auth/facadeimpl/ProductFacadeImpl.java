package com.dsc.security.auth.facadeimpl;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dsc.security.auth.facade.ProductFacde;
import com.dsc.security.auth.model.Product;
import com.dsc.security.auth.repositories.ProductRepository;
import com.dsc.security.auth.request.RegisterCompanyRequest;
import com.dsc.security.auth.response.RegisterCompanyResponse;

@Service
public class ProductFacadeImpl implements ProductFacde {

	@Autowired
	private ProductRepository productRepo;

	RegisterCompanyResponse response = new RegisterCompanyResponse();

	@Override
	public ResponseEntity<Object> setProduct(RegisterCompanyRequest regCompanyReq) throws SQLException {

		if (regCompanyReq.getTransactionType().equalsIgnoreCase("save")
//				&& regCompanyReq.getRole().getRole().equalsIgnoreCase("COMPANY_ADMIN")
//				|| regCompanyReq.getRole().getRole().equalsIgnoreCase("COMPANY_USER")
				
				) {
			Product product = regCompanyReq.getProduct();
			product.setFlag(true);
			product.setCreatedDate(new Date());
			product.setUpdatedDate(new Date());
			Product save = productRepo.save(product);
			if (save.getProductName() != null) {
				response.setStatusCode("200");
				response.setMessage("Product saved success!");
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
		}
		response.setMessage("Product not saved!");
		response.setStatusCode("409");
		return new ResponseEntity<>(response, HttpStatus.CONFLICT);
	}

	@Override
	public ResponseEntity<Object> getProduct(RegisterCompanyRequest regCompanyReq) throws SQLException {
		return null;
	}

}
