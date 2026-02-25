package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	int employeeId;
	String employeeName;
	Project project;

	public Employee(int employeeId, String employeeName) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	@Autowired
	public void setProject(Project project) {
		this.project = project;
	}

	public void showEmployeeDetails() {
		System.out.println("Employee: "+this.employeeName+" | Project: "+project.projectName+" ("+project.duration+" Months)");
	}
	
	

}
