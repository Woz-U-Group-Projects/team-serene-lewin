package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    
	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")      
    public List<Employee> getEmployees(Employee employee) {
		
    	List <Employee> employees = new ArrayList<Employee>();
		
		employeeRepository.findAll();
		
		return employees;
    }
	
    @GetMapping("/employee/{name}")
    public ResponseEntity<Employee> getEmployeeByName(@PathVariable(value="name") String name) {
        
    	Employee foundEmployee = employeeRepository.findById(name).orElse(null);

    	if(foundEmployee == null) {
            return ResponseEntity.notFound().header("Employee","None found with that name").build();
        }
        
        return ResponseEntity.ok(foundEmployee);
    }
	
	@GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable(value="id") String id) {
        
    	Employee foundEmployee = employeeRepository.findById(id).orElse(null);

    	if(foundEmployee == null) {
            return ResponseEntity.notFound().header("Employee","Nothing found with that id").build();
        }
        
        return ResponseEntity.ok(foundEmployee);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> postMessage(@RequestBody Employee employee) {
       
    	Employee createdEmployee = employeeRepository.save(employee);

    	return ResponseEntity.ok(createdEmployee);	
    }

    @DeleteMapping("/employee/{name}")
    public ResponseEntity<Employee> deleteEmployeeByName(@PathVariable(value="name") String name) {
        
    	Employee foundEmployee = employeeRepository.findByName(name);

        if(foundEmployee == null) {
            return ResponseEntity.notFound().header("Employee","None found with that name").build();
        } else {
        	employeeRepository.delete(foundEmployee);
        }
        
        return ResponseEntity.ok().build();
    }
    
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Employee> deleteEmployeeById(@PathVariable(value="id") String id) {
        
    	Employee foundEmployee = employeeRepository.findById(id).orElse(null);

        if(foundEmployee == null) {
            return ResponseEntity.notFound().header("Employee","None found with that id").build();
        } else {
        	employeeRepository.delete(foundEmployee);
        }
        
        return ResponseEntity.ok().build();
    }

}