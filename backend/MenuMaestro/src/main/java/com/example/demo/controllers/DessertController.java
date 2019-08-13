package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.Dessert;
import com.example.demo.repositories.DessertRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController

public class DessertController {

	private DessertRepository dessertRepository;

    public DessertController(DessertRepository dessertRepository) {
        this.dessertRepository = dessertRepository;
    }
	
	@GetMapping("/dessert")
	public List<Dessert> getDesserts(Dessert dessert) {
		List <Dessert> desserts = new ArrayList<Dessert>();
		
		 dessertRepository.findAll();
		
		 return desserts;
      }
	
	 @GetMapping("/dessert/{id}")
	    public ResponseEntity<Dessert> getDessert(@PathVariable(value="id") String id) {
	        Dessert foundDessert = dessertRepository.findById(id).orElse(null);

	        if(foundDessert == null) {
	            return ResponseEntity.notFound().header("Dessert","Nothing found with that id").build();
	        }
	        return ResponseEntity.ok(foundDessert);
	    }
	

    @PostMapping("/dessert")
    public ResponseEntity<Dessert> postMessage(@RequestBody Dessert dessert) {

       
        Dessert createdDessert = dessertRepository.save(dessert);

        return ResponseEntity.ok(createdDessert);
    }
    
    @DeleteMapping("/Dessert/{id}")
    public ResponseEntity<Dessert> deleteDessert(@PathVariable(value="id") String id) {
        Dessert foundDessert = dessertRepository.findById(id).orElse(null);

        if(foundDessert == null) {
            return ResponseEntity.notFound().header("Dessert","Nothing found with that id").build();
        }else {
        	dessertRepository.delete(foundDessert);
        }
        return ResponseEntity.ok().build();
    }
}
