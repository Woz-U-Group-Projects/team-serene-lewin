package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Side;
import com.example.demo.repositories.SideRepository;

@RestController
@RequestMapping("/sides")
public class SideController {

	@Autowired
	private SideRepository sideRepository;
	
	@GetMapping
	public List<Side> getSides() {
		
		List <Side> sides = sideRepository.findAll();
		System.out.println("here");
		System.out.println(sides.size());
		
		return sides;
	}
	
	@GetMapping ("/{ItemId}") 
	public ResponseEntity<Side> getSide(@PathVariable(value="itemId") String itemId) {
		
		Side foundSide = sideRepository.findByItemId(itemId);
				
		if(foundSide == null) {
			return ResponseEntity.notFound().header("Side", "nothing found with that id").build();
		}
		
		return ResponseEntity.ok(foundSide);
	}


	//@PostMapping () 
	//public ResponseEntity<Side> postSide(@PathVariable(value="itemId") String itemId) {
		
		
	//}
	 
		@PutMapping () 
		public ResponseEntity<Side> putSide(@PathVariable(value="itemId") String itemId) {
			
			Side foundSide = sideRepository.findByItemId(itemId);
					
			if(foundSide == null) {
				return ResponseEntity.notFound().header("Side", "nothing found with that id").build();
			}
			
			return ResponseEntity.ok(foundSide);
		}


		@DeleteMapping ("/{ItemId}") 
		public ResponseEntity<Side> deleteSide(@PathVariable(value="itemId") String itemId) {
			
			Side foundSide = sideRepository.findByItemId(itemId);
					
			if(foundSide == null) {
				return ResponseEntity.notFound().header("Side", "nothing found with that id").build();
			}
			
			return ResponseEntity.ok(foundSide);
		}
}