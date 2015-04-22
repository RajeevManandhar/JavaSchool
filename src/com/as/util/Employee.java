package com.as.util;

public class Employee {

	private int empNo;
	private String empName;
	private String address;
	private String state;
	private int zipCode;
	private String phone;
	private String designation;
	private double experienceinYears;
	private String emailAddress;
	private double basic;
	private double hra;
	private double bonus;
	
	public Employee(int empNo, String empName, String address, String State, int zipCode, String phone, String designation, double experienceinYears, String emailAddress, double basic,double hra, double bonus){
		this.empNo=empNo;
		this.empName=empName;
		this.address=address;
		this.state=state;
		this.zipCode=zipCode;
		this.phone=phone;
		this.designation=designation;
		this.experienceinYears=experienceinYears;
		this.emailAddress=emailAddress;
		this.basic=basic;
		this.hra=hra;
		this.bonus=bonus;
		
	}
	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getExperienceinYears() {
		return experienceinYears;
	}

	public void setExperienceinYears(double experienceinYears) {
		this.experienceinYears = experienceinYears;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double totalSalary(){
		return basic+hra+(bonus/100)*basic;
	}

}
