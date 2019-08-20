package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Side;

@Repository
public interface SideRepository extends MongoRepository<Side, String> {
	
	Side findByItemName(String side);
	Side findByItemId (String side);
	List<Side> findAll();
}
