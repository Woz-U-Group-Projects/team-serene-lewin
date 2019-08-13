package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Entree;
import com.example.demo.repositories.EntreeRepository;

@RestController

public class EntreeController {

	private EntreeRepository entreeRepository;

    public EntreeController(EntreeRepository entreeRepository) {
        this.entreeRepository = entreeRepository;
    }
	
	@GetMapping("/entree")
	public List<Entree> getEntrees(Entree entree) {
		List <Entree> entrees = new ArrayList<Entree>();
		
		 entreeRepository.findAll();
		
		 return entrees;
      }
	
	 @GetMapping("/entree/{id}")
	    public ResponseEntity<Entree> getEntree(@PathVariable(value="id") String id) {
	        Entree foundEntree = entreeRepository.findById(id).orElse(null);

	        if(foundEntree == null) {
	            return ResponseEntity.notFound().header("Entree","Nothing found with that id").build();
	        }
	        return ResponseEntity.ok(foundEntree);
	    }
	

    @PostMapping("/entree")
    public ResponseEntity<Entree> postMessage(@RequestBody Entree entree) {

       
        Entree createdEntree = entreeRepository.save(entree);

        return ResponseEntity.ok(createdEntree);
    }
    
    @DeleteMapping("/Entree/{id}")
    public ResponseEntity<Entree> deleteEntree(@PathVariable(value="id") String id) {
        Entree foundEntree = entreeRepository.findById(id).orElse(null);

        if(foundEntree == null) {
            return ResponseEntity.notFound().header("Entree","Nothing found with that id").build();
        }else {
        	entreeRepository.delete(foundEntree);
        }
        return ResponseEntity.ok().build();
    }
}
