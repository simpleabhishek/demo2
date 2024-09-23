package com.kodnest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.entity.Employee;
import com.kodnest.entity.Student;

@RestController
public class CrudController 
{
	@GetMapping(value="/greet")
	public String greet()
	{
		return "Hello Sir!";
	}
	
	@GetMapping(value="/greet1")
	public int greet1()
	{
		return 100;
	}
	
	@GetMapping(value="/greet2")
	public double greet2()
	{
		return 100.99;
	}
	
	@GetMapping(value="/studentdetails")
	public Student displayStudent()
	{
		return new Student("Abhi",99);
	}
	
	@GetMapping(value="/employeedetails")
	public Employee displayEmployee()
	{
		return new Employee(101,"Abhishek",80000.00);
	}
}
