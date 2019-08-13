package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Entree;

@Repository
public interface EntreeRepository extends MongoRepository<Entree, String> {

	public Entree findByItemName(String entree);
}
