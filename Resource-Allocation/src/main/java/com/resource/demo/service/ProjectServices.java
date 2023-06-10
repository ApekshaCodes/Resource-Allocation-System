package com.resource.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.resource.demo.entity.ProjectMaster;
import com.resource.demo.repository.ProjectRepository;

@Component
public class ProjectServices {

	LocalDateTime now = LocalDateTime.now();

	@Autowired
	ProjectRepository projectRepo;

	public String addProject(ProjectMaster request) {
		request.setCreatedDate(now);
		projectRepo.save(request);
		return "Project Added Successfully";
	}

	public List<ProjectMaster> listProjects() {
		List<ProjectMaster> empList = projectRepo.findAll();
		return empList;
	}

}
