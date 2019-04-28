package com.example.controller.test;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import com.example.employee.models.Employee;
import com.example.employee.services.EmployeeService;

public class EmployeeControllerTest {

@Mock
private EmployeeService employeeService;

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
public void registerTest(){
	when(employeeService.save(any())).thenReturn(em);
	assertEquals("AWM",em.getDepartment());
}

@Test
public void getAllEmployeesTest(){
	List<Employee> employeeList = new ArrayList<>();
	when(employeeService.getAllEmployees()).thenReturn(employeeList);
	assertEquals("AWM",em.getDepartment());
}


}
