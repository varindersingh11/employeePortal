package com.example.employee.services.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.example.employee.models.Employee;
import com.example.employee.repositories.EmployeeRepository;

public class EmployeeServiceImplTest {
	
	@Mock
    private EmployeeRepository employeeRepository;

    @Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
    
    Employee em;
    
    @Before
    public void setup(){
    	em = new Employee();
    	em.setDateOfBirth(null);
    	em.setFirstName("varinder");
    	em.setLastName("singh");
    	em.setGender("M");
    	em.setDepartment("AWM");
    }
    
    @Test
    public void saveTest(){
    	when(employeeRepository.save(any())).thenReturn(em);
    	assertEquals("AWM",em.getDepartment());
    	
    }
    
    @Test
    public void getAllEmployees(){
    	List<Employee> employeeList = new ArrayList<>();
    	employeeList.add(em);
    	when(employeeRepository.findAll()).thenReturn(employeeList);
    	assertEquals(1, employeeList.size());
    	
    }
    

}
