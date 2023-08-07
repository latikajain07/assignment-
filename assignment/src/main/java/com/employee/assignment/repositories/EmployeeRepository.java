package com.employee.assignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.employee.assignment.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
