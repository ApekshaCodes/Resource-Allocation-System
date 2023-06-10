package com.resource.demo.entity;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "EmployeeDB")
public class EmployeeMaster {

	@Indexed(unique = true)
	private int empCode;

	private String empName;

	private String empEmail;

	private String empNo;

	private String reportingManagerName;

	private Float totalExperience;

	private String billable;

	private String reportingBranch;

	private String currentLocation;

	private LocalDateTime createdDate;

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getReportingManagerName() {
		return reportingManagerName;
	}

	public void setReportingManagerName(String reportingManagerName) {
		this.reportingManagerName = reportingManagerName;
	}

	public Float getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(Float totalExperience) {
		this.totalExperience = totalExperience;
	}

	public String getBillable() {
		return billable;
	}

	public void setBillable(String billable) {
		this.billable = billable;
	}

	public String getReportingBranch() {
		return reportingBranch;
	}

	public void setReportingBranch(String reportingBranch) {
		this.reportingBranch = reportingBranch;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}


	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

}
