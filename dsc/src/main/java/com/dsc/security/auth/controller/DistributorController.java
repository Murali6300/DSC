package com.dsc.security.auth.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsc.security.auth.facadeimpl.DistributorFacadeImpl;
import com.dsc.security.auth.model.DistributorDetails;
import com.dsc.security.auth.request.RegisterCompanyRequest;
import com.dsc.security.auth.response.ErrorResponse;

@RestController
public class DistributorController {

	@Autowired
	private DistributorFacadeImpl distFacadeImpl;

	@PostMapping("/adddistributor")
	public ResponseEntity<Object> setCompanyUser(@RequestBody RegisterCompanyRequest regComReq,
			HttpServletRequest request, HttpServletResponse response) {
		DistributorDetails distributorDetails = regComReq.getDistributorDetails();

		try {

			if (regComReq.getDistributorDetails() == null || regComReq.getTransactionType().isEmpty()
					|| regComReq.getTransactionType() == null) {
				ErrorResponse error = new ErrorResponse();
				error.setStatusCode("422");
				error.setMessage("Invalid Request");
				return new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
			}

			if ((distributorDetails.getEmail().isEmpty() && distributorDetails.getEmail() == null)
					|| (distributorDetails.getPassword().isEmpty() && distributorDetails.getPassword() == null))
//					|| (company.getCompanyFullName().isEmpty() && company.getCompanyFullName() == null)
//					|| (company.getOwnerFullName().isEmpty() && company.getOwnerFullName() == null)
//					|| company.getOwnerMobileNum() == null) 
			{
				ErrorResponse error = new ErrorResponse();
				error.setStatusCode("422");
				error.setMessage("Invalid Request fields ");
				return new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
			}

			return distFacadeImpl.setDistributor(regComReq);
		} catch (Exception e) {
			ErrorResponse error = new ErrorResponse();
			error.setStatusCode("409");
			error.setMessage("Exception caught Distributor controller !");
			error.setStausMessage(e.getMessage());
			return new ResponseEntity<>(error, HttpStatus.CONFLICT);

		}
	}

}
