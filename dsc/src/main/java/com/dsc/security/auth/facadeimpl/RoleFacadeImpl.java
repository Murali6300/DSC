package com.dsc.security.auth.facadeimpl;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dsc.security.auth.facade.RoleFacade;
import com.dsc.security.auth.model.Role;
import com.dsc.security.auth.repositories.RolesRepository;
import com.dsc.security.auth.request.RegisterCompanyRequest;
import com.dsc.security.auth.response.RegisterCompanyResponse;

@Service
public class RoleFacadeImpl implements RoleFacade {

	@Autowired
	RolesRepository roleRepo;

	RegisterCompanyResponse response = new RegisterCompanyResponse();

	@Override
	public ResponseEntity<Object> setRole(RegisterCompanyRequest regCompanyReq) throws SQLException {

		if (regCompanyReq.getTransactionType().equalsIgnoreCase("save")) {

			Role role = regCompanyReq.getRole();
			Role save = roleRepo.save(role);
			if (save.getRole() != null) {
				response.setStatusCode("200");
				response.setMessage("Role saved success!");
				return new ResponseEntity<>(response, HttpStatus.OK);
			}
		}

		response.setMessage("Role not saved!");
		response.setStatusCode("409");
		return new ResponseEntity<>(response, HttpStatus.CONFLICT);
	}

}
