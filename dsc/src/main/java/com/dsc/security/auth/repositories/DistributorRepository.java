package com.dsc.security.auth.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsc.security.auth.model.DistributorDetails;

public interface DistributorRepository extends MongoRepository<DistributorDetails, String>{

	

}
