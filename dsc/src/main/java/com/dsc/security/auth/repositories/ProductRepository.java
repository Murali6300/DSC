package com.dsc.security.auth.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dsc.security.auth.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
