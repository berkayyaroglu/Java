package com.seleniumexpress.employeeapp.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.employeeapp.entity.Employee;
import com.seleniumexpress.employeeapp.repo.EmployeeRepo;
import com.seleniumexpress.employeeapp.response.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo EmployeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public EmployeeResponse getEmployeeById(int id) {
		
		Employee employee = EmployeeRepo.findById(id).get();
		EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
		
		/*
		 * EmployeeResponse employeeResponse = new EmployeeResponse();
		 * employeeResponse.setId(employee.getId());
		 * employeeResponse.setName(employee.getName());
		 * employeeResponse.setEmail(employee.getEmail());
		 * employeeResponse.setBloodgroup(employee.getBloodgroup());
		 */
		
		return employeeResponse;
	}
}
