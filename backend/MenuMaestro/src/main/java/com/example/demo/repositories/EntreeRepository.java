package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Entree;

public interface EntreeRepository extends MongoRepository<Entree, String> {

	public Entree findByItemName(String entree);
}
