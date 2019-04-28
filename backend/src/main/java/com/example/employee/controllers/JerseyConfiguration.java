package com.example.employee.controllers;
 
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
 
@Component
public class JerseyConfiguration extends ResourceConfig
{
    public JerseyConfiguration()
    {
        register(EmployeeController.class);
    }
}