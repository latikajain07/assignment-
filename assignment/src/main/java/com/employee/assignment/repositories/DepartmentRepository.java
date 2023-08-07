package com.employee.assignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.assignment.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
