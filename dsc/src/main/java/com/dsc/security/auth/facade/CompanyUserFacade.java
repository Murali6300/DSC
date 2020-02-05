package com.dsc.security.auth.facade;

import java.sql.SQLException;

import org.springframework.http.ResponseEntity;

import com.dsc.security.auth.request.RegisterCompanyRequest;

public interface CompanyUserFacade {
	public ResponseEntity<Object> setCompanyUser(RegisterCompanyRequest regCompanyReq) throws SQLException;
}
