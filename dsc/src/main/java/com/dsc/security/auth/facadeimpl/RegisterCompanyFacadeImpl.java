package com.dsc.security.auth.facadeimpl;

import static com.dsc.security.auth.constants.CompanyConstants.FAILED;
import static com.dsc.security.auth.constants.CompanyConstants.SUCCESS;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dsc.security.auth.facade.RegisterCompanyFacade;
import com.dsc.security.auth.model.RegisterCompany;
import com.dsc.security.auth.model.Role;
import com.dsc.security.auth.repositories.RegisterCompnayRepository;
import com.dsc.security.auth.repositories.RolesRepository;
import com.dsc.security.auth.request.RegisterCompanyRequest;
import com.dsc.security.auth.response.RegisterCompanyResponse;

@Service
public class RegisterCompanyFacadeImpl implements RegisterCompanyFacade {
	@Autowired
	private RegisterCompnayRepository regComRepo;

	@Autowired
	private RolesRepository roleRepo;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	RegisterCompanyResponse response = new RegisterCompanyResponse();

	@Override
	public ResponseEntity<Object> setRegCompany(RegisterCompanyRequest regCompanyReq) throws SQLException {

		if (regCompanyReq.getTransactionType().equalsIgnoreCase("save")) {
			RegisterCompany registerCompany = regCompanyReq.getRegisterCompany();
			Role findByRole = roleRepo.findByRole("SUPERADMIN");
			String pwd = passwordEncoder.encode(registerCompany.getPassword());
			registerCompany.setRoles(new HashSet<>(Arrays.asList(findByRole)));
			registerCompany.setPassword(pwd);
			registerCompany.setFlag(true);
			registerCompany.setCreatedDate(new Date());
			registerCompany.setUpdatedDate(new Date());
			RegisterCompany save = regComRepo.save(registerCompany);
			if (save.getEmail() != null) {
				response.setStatusCode("200");
				response.setMessage(SUCCESS);
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
		}
		response.setMessage(FAILED);
		response.setStatusCode("409");
		return new ResponseEntity<>(response, HttpStatus.CONFLICT);
	}

	@Override
	public ResponseEntity<Object> getRegCompany(RegisterCompanyRequest regCompanyReq) throws SQLException {
		return null;
	}

}
