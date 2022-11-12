package com.seleniumexpress.adressapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.seleniumexpress.adressapp.response.AddressResponse;
import com.seleniumexpress.adressapp.service.AddressService;

@RestController 
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@GetMapping("/address/{employee_id}")
	public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employee_id") int id) {
		
		AddressResponse addressResponse = null;
		
		addressResponse = addressService.findAddressByEmployeeId(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
	}
}
