package com.example.demo.controllers;

import com.example.demo.models.Dessert;
import com.example.demo.repositories.DessertRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dessert")
public class DessertController {
    
	private DessertRepository dessertRepository;

    public DessertController(DessertRepository dessertRepository) {
        this.dessertRepository = dessertRepository;
    }

    @GetMapping("/all")
    public List<Dessert> getAll(){
        List<Dessert> desserts = this.dessertRepository.findAll();
        
        return desserts;
    }

    @PutMapping
    public void insert(@RequestBody Dessert dessert){
        this.dessertRepository.insert(dessert);
    }

    @PostMapping
    public void update(@RequestBody Dessert dessert){
        this.dessertRepository.save(dessert);
    }

    @GetMapping("/itemName")
    public Dessert getByItemName(@PathVariable("itemName") String itemName){
        Dessert dessert = this.dessertRepository.findByItemName(itemName);

        return dessert;
    }

}
