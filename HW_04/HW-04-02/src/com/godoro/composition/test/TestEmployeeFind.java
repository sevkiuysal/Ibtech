package com.godoro.composition.test;

import com.godoro.composition.entity.Employee;
import com.godoro.composition.manager.EmployeeManager;

public class TestEmployeeFind {

	public static void main(String[] args) throws Exception {
		
		long employeeId=5;
		
		EmployeeManager employeeManager=new EmployeeManager();
		Employee employee=employeeManager.find(employeeId);
		
		System.out.println(employee.getEmployeeId()+" "+employee.getEmployeeName()+" "
		+employee.getMonthlySalary()); 
	}
}
