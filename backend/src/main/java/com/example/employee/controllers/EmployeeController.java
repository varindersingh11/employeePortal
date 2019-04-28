package com.example.employee.controllers;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.employee.models.Employee;
import com.example.employee.services.EmployeeService;


@Path("/api")
@Component
@CrossOrigin("*")
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeService employeeService;
    
	@GET
    @Produces("application/json")
    @Path("/getEmployees" )
    public Response getAllEmployees() {
		List<Employee> empList = employeeService.getAllEmployees();
		empList.sort((Employee e1, Employee e2) -> e1.getFirstName().compareTo(e2.getFirstName()));
		return Response.ok(empList).build() ;
    }

	@POST
    @Consumes("application/json")
	@Produces("application/json")
	@Path("/register")
    public Employee register(@RequestBody Employee employee) {
		System.out.println(employeeService.save(employee));
		return employeeService.save(employee);
    }
}
