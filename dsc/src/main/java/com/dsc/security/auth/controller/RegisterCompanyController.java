package com.dsc.security.auth.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsc.security.auth.configs.JwtTokenProvider;
import com.dsc.security.auth.facadeimpl.RegisterCompanyFacadeImpl;
import com.dsc.security.auth.model.Login;
import com.dsc.security.auth.repositories.RegisterCompnayRepository;
import com.dsc.security.auth.request.RegisterCompanyRequest;
import com.dsc.security.auth.response.ErrorResponse;

@RestController
public class RegisterCompanyController {

	@Autowired
	RegisterCompanyFacadeImpl regFacadeImpl;

	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtTokenProvider jwtTokenProvider;
	
	@Autowired
	private RegisterCompnayRepository regComRepo;

	@PostMapping("/login")
	public ResponseEntity<Object> userLogin(@RequestBody Login login) {
		try {
			String email = login.getEmail();
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, login.getPassword()));
			String token = jwtTokenProvider.createToken(email, regComRepo.findByEmail(email).getRoles());
			Map<Object, Object> model = new HashMap<>();
			model.put("Email", email);
			model.put("Token","Bearer " + token);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (AuthenticationException e) {
			throw new BadCredentialsException("Invalid email/password !");
		}

	}

	@PostMapping("/registerCompany")
	public ResponseEntity<Object> setRegisterCompany(@RequestBody RegisterCompanyRequest regComReq,
			HttpServletRequest request, HttpServletResponse response) {

		try {

			if (regComReq.getRegisterCompany() == null || regComReq.getTransactionType().isEmpty()
					|| regComReq.getTransactionType() == null) {
				ErrorResponse error = new ErrorResponse();
				error.setStatusCode("422");
				error.setMessage("Invalid Request");
				return new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
			}

			return regFacadeImpl.setRegCompany(regComReq);
		} catch (Exception e) {
			ErrorResponse error = new ErrorResponse();
			error.setStatusCode("409");
			error.setMessage("Exception caught!");
			error.setStausMessage(e.getMessage());
			return new ResponseEntity<>(error, HttpStatus.CONFLICT);

		}
	}

}
