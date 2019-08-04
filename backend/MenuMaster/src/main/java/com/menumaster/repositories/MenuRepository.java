package com.menumaster.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.menumaster.models.Entree;

public interface MenuRepository extends MongoRepository<Entree, String> {

	public Entree findByEntree(String entree);
}
