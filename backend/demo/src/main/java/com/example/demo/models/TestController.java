package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Entree;

@RestController

public class TestController {
	
	private static final ResponseEntity<Menu> entree = null;
	@Autowired
	MenuRepository menuRepository;
	
	@GetMapping("/test")
	public String index() {
		
		return "YAY";
	}
	
	@GetMapping("/entree")
	public String getEntrees(Model model) {
		List <Entree> entree =new ArrayList<Entree>();
		
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
		
		model.addAttribute("entree", entree);
				 
		return "entree";
		
	}

}
