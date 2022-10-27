package com.seleniumexpress.employeeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seleniumexpress.employeeapp.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
}
