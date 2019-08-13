package com.example.demo.controllers;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    
	private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/all")
    public List<Employee> getAll(){
        List<Employee> employees = this.employeeRepository.findAll();
        
        return employees;
    }

    @PutMapping
    public void insert(@RequestBody Employee employee){
        this.employeeRepository.insert(employee);
    }

    @PostMapping
    public void update(@RequestBody Employee employee){
        this.employeeRepository.save(employee);
    }

    @GetMapping("/employee")
    public Employee getById(@PathVariable("employeeName") String employeeName){
        Employee employee = this.employeeRepository.findByName(employeeName);

        return employee;
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> e71ef7676f5560dcdc86d2c9ec898638fba20f52
