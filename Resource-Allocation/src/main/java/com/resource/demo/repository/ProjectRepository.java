package com.resource.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.resource.demo.entity.ProjectMaster;

public interface ProjectRepository extends MongoRepository<ProjectMaster, String> {

}
