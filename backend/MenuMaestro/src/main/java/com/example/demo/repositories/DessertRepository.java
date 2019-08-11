package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Dessert;

@Repository
public interface DessertRepository extends MongoRepository<Dessert, String> {

	Dessert findByItemName(String dessert);
}
