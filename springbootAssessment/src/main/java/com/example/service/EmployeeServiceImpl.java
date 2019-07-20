package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepo;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired 
	private EmployeeRepo empRepo;
	
	@Override
	public Employee save(Employee emp) {
		
		return empRepo.save(emp);
	}

	@Override
	public List<Employee> findAll() {
		return null;
	}

	@Override
	public Optional<Employee> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}
	

}
