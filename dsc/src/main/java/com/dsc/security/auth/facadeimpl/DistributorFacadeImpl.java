package com.dsc.security.auth.facadeimpl;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dsc.security.auth.facade.DistributorFacade;
import com.dsc.security.auth.model.CompanyUserDetails;
import com.dsc.security.auth.model.DistributorDetails;
import com.dsc.security.auth.repositories.DistributorRepository;
import com.dsc.security.auth.request.RegisterCompanyRequest;
import com.dsc.security.auth.response.RegisterCompanyResponse;

@Service
public class DistributorFacadeImpl implements DistributorFacade{
	
	@Autowired
	private DistributorRepository distributorRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	RegisterCompanyResponse response = new RegisterCompanyResponse();

	@Override
	public ResponseEntity<Object> setDistributor(RegisterCompanyRequest regCompanyReq) throws SQLException {
		if (regCompanyReq.getTransactionType().equalsIgnoreCase("save")) {
			DistributorDetails distributorDetails = regCompanyReq.getDistributorDetails();
			String pwd = passwordEncoder.encode(distributorDetails.getPassword());
			distributorDetails.setPassword(pwd);
			distributorDetails.setFlag(true);
			distributorDetails.setCreatedDate(new Date());
			distributorDetails.setUpdatedDate(new Date());
			DistributorDetails save = distributorRepo.save(distributorDetails);
			
			if (save.getEmail() != null) {
				response.setStatusCode("200");
				response.setMessage("Distributor saved success");
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
		}
		response.setMessage("Distributor not saved ");
		response.setStatusCode("409");
		return new ResponseEntity<>(response, HttpStatus.CONFLICT);
	}

}
