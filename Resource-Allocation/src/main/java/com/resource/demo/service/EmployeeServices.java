package com.resource.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.resource.demo.entity.EmployeeMaster;
import com.resource.demo.repository.EmployeeRepository;

@Component
public class EmployeeServices {
	
	LocalDateTime now = LocalDateTime.now();
	
	
	@Autowired
	EmployeeRepository empRepo;

	public String addEmp(EmployeeMaster request) {
		request.setCreatedDate(now);
		empRepo.save(request);	
		return "Employee Added Successfully";
	}

	public List<EmployeeMaster> listEmp() {
		List<EmployeeMaster> empList = empRepo.findAll();
		return empList;
	}
	
	
	

}
