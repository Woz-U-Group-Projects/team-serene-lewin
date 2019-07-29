package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="menu")
public class Menu {
	 	@Id
	    private Integer id;
	    private String entree;
	    private String side;
	    
	    public Menu() {}
        
        
	   
	    public String getentree() {
	        return entree;
	    }

	    public void setentree(String entree) {
	        this.entree = entree;
	    }

	    public String getside() {
	        return side;
	    }

	    public void setside(String side) {
	        this.side = side;
	    }
	}


