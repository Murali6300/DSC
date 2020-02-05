package com.dsc.security.auth.facade;

import java.sql.SQLException;

import org.springframework.http.ResponseEntity;

import com.dsc.security.auth.request.RegisterCompanyRequest;

public interface DistributorFacade {
	public ResponseEntity<Object> setDistributor(RegisterCompanyRequest regCompanyReq) throws SQLException;

}
