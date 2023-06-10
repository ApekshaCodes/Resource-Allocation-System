package com.resource.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.resource.demo.entity.EmployeeMaster;
import com.resource.demo.service.EmployeeServices;

@RestController
public class EmployeeController {
	
	
	@Autowired
	EmployeeServices empService;
	
	
	@PostMapping("/addEmp")  //add emp
	public String addEmp(@RequestBody EmployeeMaster request) {
		return empService.addEmp(request);		
	}
	
	@GetMapping("listEmps") //show emp
	public List<EmployeeMaster> listEmp() {
		return empService.listEmp();	
	}
	
	

}
