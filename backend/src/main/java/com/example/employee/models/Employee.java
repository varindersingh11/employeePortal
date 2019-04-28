package com.example.employee.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "employee")
@Table(name="EMPLOYEE")
@Entity
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="employee_id")
    private Integer id;

	@Column(name="first_name", nullable=false)
    private String firstName;
	
	@Column(name="last_name", nullable=false)
    private String lastName;
	
	@Column(name="date_of_birth", nullable=false)
    private Date dateOfBirth;
	
	@Column(name="gender", nullable=false)
    private String gender;
	
	@Column(name="department", nullable=false)
    private String department;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}