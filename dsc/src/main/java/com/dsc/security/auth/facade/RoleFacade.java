package com.dsc.security.auth.facade;

import java.sql.SQLException;

import org.springframework.http.ResponseEntity;

import com.dsc.security.auth.request.RegisterCompanyRequest;

public interface RoleFacade {
	
	public ResponseEntity<Object> setRole(RegisterCompanyRequest regCompanyReq) throws SQLException;

}
