package com.as.client;

import com.as.util.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee employee1= new Employee(1, "Rajeev", "50 Turk St.", "California", 94102, "8016916175", "Software Engineer", 2.5, "manandhar32@gmail.com", 68000, 13000.35,15.9);
		double total_salary = employee1.totalSalary();
		System.out.println("Total salary for "+employee1.getEmpName()+" is "+total_salary);
	}
}
