package com.resource.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.resource.demo.entity.EmployeeMaster;

public interface EmployeeRepository extends MongoRepository<EmployeeMaster, String> {

}
