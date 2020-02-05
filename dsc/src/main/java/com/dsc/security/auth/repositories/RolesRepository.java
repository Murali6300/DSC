package com.dsc.security.auth.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsc.security.auth.model.Role;

public interface RolesRepository extends MongoRepository<Role, String> {

	Role findByRole(String role);

//	Role findAll(String role);

}
