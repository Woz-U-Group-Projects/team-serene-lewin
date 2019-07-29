package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MenuRepository extends MongoRepository<Menu, String> {

	public Menu findByEntree(String entree);
}
