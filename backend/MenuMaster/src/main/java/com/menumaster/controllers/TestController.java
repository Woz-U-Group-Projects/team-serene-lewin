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
		
<<<<<<< HEAD:backend/MenuMaster/src/main/java/com/menumaster/controllers/TestController.java
		model.addAttribute("entree", dessert);
=======
		 Connection con;
	        try {
	            con = DriverManager.getConnection("jdbc:mogodb:./test.db", "", "");

	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM entree");
	            
	            while (rs.next()) {
	            	 Entree newEntree = new Entree();
	            	 newID.setId(rs.getInt("Id"))
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            }
>>>>>>> 6a0318fd8c9e1e4c711a4b89c0bd8ab2fe1baec2:backend/demo/src/main/java/com/example/demo/TestController.java
		
		model.addAttribute("entree", entree);
				 
		return "entree";
		
	}

}
