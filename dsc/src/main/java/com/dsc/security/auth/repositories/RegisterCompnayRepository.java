package com.dsc.security.auth.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsc.security.auth.model.RegisterCompany;

public interface RegisterCompnayRepository extends MongoRepository<RegisterCompany, String> {
	
	RegisterCompany findByEmail(String email);

}
