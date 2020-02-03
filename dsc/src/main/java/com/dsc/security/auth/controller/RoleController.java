package com.dsc.security.auth.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsc.security.auth.facadeimpl.RoleFacadeImpl;
import com.dsc.security.auth.request.RegisterCompanyRequest;
import com.dsc.security.auth.response.ErrorResponse;

@RestController
public class RoleController {

	@Autowired
	private RoleFacadeImpl roleFacade;

	@PostMapping("/role")
	public ResponseEntity<Object> setRegisterCompany(@RequestBody RegisterCompanyRequest regComReq,
			HttpServletRequest request, HttpServletResponse response) {

		try {
 
			if (regComReq.getRole() == null || regComReq.getTransactionType().isEmpty()
					|| regComReq.getTransactionType() == null) {
				ErrorResponse error = new ErrorResponse();
				error.setStatusCode("422");
				error.setMessage("Invalid Request");
				return new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
			}

			return roleFacade.setRole(regComReq);
		} catch (Exception e) {
			ErrorResponse error = new ErrorResponse();
			error.setStatusCode("409");
			error.setMessage("Exception caught!");
			error.setStausMessage(e.getMessage());
			return new ResponseEntity<>(error, HttpStatus.CONFLICT);

		}

	}
}
