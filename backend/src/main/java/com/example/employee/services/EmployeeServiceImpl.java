package com.example.employee.services;


import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.example.employee.controllers.EmployeeController;
import com.example.employee.models.Employee;
import com.example.employee.repositories.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee save(Employee employee){
		try{
		return employeeRepository.save(employee);
		} catch(DataAccessException e){
			logger.error("Exception raised while registering an employee");
			return null;
		}
	}
	
	@Override
	public List<Employee> getAllEmployees(){
		try{
		return employeeRepository.findAll();
		} catch(DataAccessException e){
			logger.error("Exception raised while fetching employee(s) list");
			return null;
		}
	}
	
	
	

}
