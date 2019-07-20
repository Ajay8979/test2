package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Employee;

public interface EmployeeService {
	 public Employee save(Employee emp);
	public List<Employee> findAll();
    public Optional<Employee> findById(Integer id);
    public void deleteById(Integer id);
      

}
