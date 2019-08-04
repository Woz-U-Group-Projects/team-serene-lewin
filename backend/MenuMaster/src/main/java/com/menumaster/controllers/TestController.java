package com.menumaster.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menumaster.models.Dessert;
import com.menumaster.models.Entree;
import com.menumaster.repositories.MenuRepository;


@RestController

public class TestController {
	
	private static final ResponseEntity<Entree> entree = null;
	@Autowired
	MenuRepository menuRepository;
	
	@GetMapping("/")
	public String index() {
		
		return "YAY";
	}
	
	@GetMapping("/entree")
	public String getEntrees(Model model) {
		List <Dessert> dessert =new ArrayList<Dessert>();
		
		model.addAttribute("entree", dessert);
		
		return "entree";
		
	}

}
