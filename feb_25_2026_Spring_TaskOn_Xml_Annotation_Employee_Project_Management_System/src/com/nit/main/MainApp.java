package com.nit.main;
/*=== Company Structure ===
Company: TechWave Solutions
Department: IT
  Employee: Alice | Project: Web Application (6 Months)
Department: HR
  Employee: Bob | Project: Recruitment System (3 Months)*/

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.Company;
import com.nit.sbeans.Department;
import com.nit.sbeans.Employee;
public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
															"com/nit/config/SpringConfig.xml");
		System.out.println("=== Company Structure ===");
		Company company =  ctx.getBean(Company.class);
		company.showCompanyInfo();	
		
		Department dept = ctx.getBean(Department.class);
		dept.showDepartmentInfo();
		
		Employee emp = ctx.getBean(Employee.class);
		emp.showEmployeeDetails();
	}
}

