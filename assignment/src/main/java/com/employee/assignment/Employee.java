package com.employee.assignment;

import java.time.LocalDate;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.PackagePrivate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;

	private String name;

	@Column(name= "join_date")
	private LocalDate date;
	
	@OneToMany(targetEntity = Department.class, cascade = CascadeType.ALL)
	@JoinColumn(name="EmpDepartment")
	private ArrayList<Department> emp_department = new ArrayList<>();
	
	private String currency ;
	
	private double salary;

	public LocalDate getJoinDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
