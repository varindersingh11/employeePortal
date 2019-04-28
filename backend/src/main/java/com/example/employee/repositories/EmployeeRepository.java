package com.example.employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.employee.models.Employee;

@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// in case custom method need to call

}