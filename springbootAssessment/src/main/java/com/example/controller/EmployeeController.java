package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping(name="/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	 @PostMapping(value="/save")
	    public ResponseEntity create(@Valid @RequestBody Employee employee) {
	        return ResponseEntity.ok(employeeService.save(employee));
	    }
	
	
	   @RequestMapping("/")
	    public ResponseEntity<List<Employee>> findAll() {
	        return ResponseEntity.ok(employeeService.findAll());
	    }

	    
	   

	    @GetMapping("/{id}")
	    public ResponseEntity<Employee> findById(@PathVariable Integer id) {
	        Optional<Employee> stock = employeeService.findById(id);
	        //if (!stock.isPresent()) {
	           // log.error("Id " + id + " is not existed");
	            ResponseEntity.badRequest().build();
	        

	        return ResponseEntity.ok(stock.get());
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Employee> update(@PathVariable Integer id, @Valid @RequestBody Employee employee) {
	        if (!employeeService.findById(id).isPresent()) {
	           // log.error("Id " + id + " is not existed");
	            ResponseEntity.badRequest().build();
	        }

	        return ResponseEntity.ok(employeeService.save(employee));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity delete(@PathVariable Integer id) {
	        if (!employeeService.findById(id).isPresent()) {
	            //log.error("Id " + id + " is not existed");
	            ResponseEntity.badRequest().build();
	        }

	        employeeService.deleteById(id);

	        return ResponseEntity.ok().build();
	    }
	
	
}
