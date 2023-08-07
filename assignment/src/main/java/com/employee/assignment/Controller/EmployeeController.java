package com.employee.assignment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.assignment.Employee;
import com.employee.assignment.repositories.EmployeeRepository;

@RestController
@RequestMapping("/employees")

public class EmployeeController {
	

	    @Autowired
	    private EmployeeRepository employeeRepository;

	    @PostMapping
	    public Employee addEmployee(@RequestBody Employee employee) {
	        return employeeRepository.save(employee);
	    }
	}


