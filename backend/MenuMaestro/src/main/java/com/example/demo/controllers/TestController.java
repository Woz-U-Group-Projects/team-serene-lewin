package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Entree;
import com.example.demo.repositories.EntreeRepository;


@RestController

public class TestController {
	
	private static final ResponseEntity<Entree> entree = null;
	@Autowired
	EntreeRepository menuRepository;
	
	@GetMapping("/")
	public String index() {
		
		return "YAY";
	}
	
	@GetMapping("/entree")
	public String getEntrees(Model model) {
		List <Entree> entree =new ArrayList<Entree>();
		
		
		model.addAttribute("entree", entree);
				 
		return "entree";
		
	}

}
