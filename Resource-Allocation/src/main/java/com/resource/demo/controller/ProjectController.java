package com.resource.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.resource.demo.entity.ProjectMaster;
import com.resource.demo.service.ProjectServices;

@RestController
public class ProjectController {
	
	
	@Autowired
	ProjectServices projectService;
	
	
	@PostMapping("/addProject")  //add project
	public String addProject(@RequestBody ProjectMaster request) {
		return projectService.addProject(request);		
	}
	
	@GetMapping("listProjects") //show emp
	public List<ProjectMaster> listProjects() {
		return projectService.listProjects();	
	}
	
	

}
