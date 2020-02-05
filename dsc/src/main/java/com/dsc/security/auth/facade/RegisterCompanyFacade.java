package com.dsc.security.auth.facade;

import java.sql.SQLException;

import org.springframework.http.ResponseEntity;

import com.dsc.security.auth.request.RegisterCompanyRequest;

public interface RegisterCompanyFacade {

	public ResponseEntity<Object> setRegCompany(RegisterCompanyRequest regCompanyReq) throws SQLException;
	
	public ResponseEntity<Object> getRegCompany(RegisterCompanyRequest regCompanyReq) throws SQLException;

}
