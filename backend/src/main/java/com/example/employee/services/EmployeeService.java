package com.example.employee.services;

import java.util.List;

import com.example.employee.models.Employee;


public interface EmployeeService {

	Employee save(Employee employee);
	
	List<Employee> getAllEmployees();
}
