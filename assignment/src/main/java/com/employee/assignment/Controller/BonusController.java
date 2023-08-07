package com.employee.assignment.Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.assignment.Employee;
import com.employee.assignment.repositories.EmployeeRepository;

@RestController
public class BonusController {

	

	    @Autowired
	    private EmployeeRepository employeeRepository;

	    @GetMapping("/eligible-employees")
	    public List<Employee> getEligibleEmployees(@RequestParam(value = "dateParam", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
	        
	    	 System.out.println(date);
	    	return employeeRepository.findAll()
	                .stream()
	                .filter(emp -> emp.getJoinDate().isBefore(date))
	                .collect(Collectors.toList());
	       
	        
	    }
	    
	}



