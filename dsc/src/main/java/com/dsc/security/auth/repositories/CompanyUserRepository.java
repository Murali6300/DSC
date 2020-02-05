package com.dsc.security.auth.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsc.security.auth.model.CompanyUserDetails;

public interface CompanyUserRepository extends MongoRepository<CompanyUserDetails, String>{

}
