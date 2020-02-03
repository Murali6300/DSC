package com.dsc.security.auth.facade;

import java.sql.SQLException;

import org.springframework.http.ResponseEntity;

import com.dsc.security.auth.request.RegisterCompanyRequest;

public interface ProductFacde {
	
	public ResponseEntity<Object> setProduct(RegisterCompanyRequest regCompanyReq) throws SQLException;

	public ResponseEntity<Object> getProduct(RegisterCompanyRequest regCompanyReq) throws SQLException;

}
