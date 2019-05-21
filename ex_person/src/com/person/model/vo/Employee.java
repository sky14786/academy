package com.person.model.vo;

public class Employee extends Person{

	private String department;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, char gender, String address, String department, int salary) {
		super(name, age, gender, address);
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.getName()+super.getAge()
		+super.getGender()+super.getAddress()
		+department+salary;
	}
	
	
	
	
	
	
	
	
}
