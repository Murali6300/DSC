package com.dsc.security.auth.facadeimpl;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dsc.security.auth.facade.CompanyUserFacade;
import com.dsc.security.auth.model.CompanyUserDetails;
import com.dsc.security.auth.repositories.CompanyUserRepository;
import com.dsc.security.auth.request.RegisterCompanyRequest;
import com.dsc.security.auth.response.RegisterCompanyResponse;

@Service
public class CompanyUserFacadeImpl implements CompanyUserFacade{
	
	@Autowired
	private CompanyUserRepository companyUserRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	RegisterCompanyResponse response = new RegisterCompanyResponse();

	@Override
	public ResponseEntity<Object> setCompanyUser(RegisterCompanyRequest regCompanyReq) throws SQLException {
		
		if (regCompanyReq.getTransactionType().equalsIgnoreCase("save")) {
			CompanyUserDetails companyUserDetails = regCompanyReq.getCompanyUserDetails();
			String pwd = passwordEncoder.encode(companyUserDetails.getPassword());
			companyUserDetails.setPassword(pwd);
			companyUserDetails.setFlag(true);
			companyUserDetails.setCreatedDate(new Date());
			companyUserDetails.setUpdatedDate(new Date());
			CompanyUserDetails save = companyUserRepo.save(companyUserDetails);
			if (save.getEmail() != null) {
				response.setStatusCode("200");
				response.setMessage("Company User saved success");
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
		}
		response.setMessage("Company User not saved ");
		response.setStatusCode("409");
		return new ResponseEntity<>(response, HttpStatus.CONFLICT);
	}

}
