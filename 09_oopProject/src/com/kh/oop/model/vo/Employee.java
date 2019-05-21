package com.kh.oop.model.vo;

import java.util.Date;

public class Employee {

	private String name;
	private String department;
	private int salary;
	private String job;
	private int forYears;
	private Date enrollDate;
	
	//기본생성자 생성
	private Employee() {
		System.out.println("생성자 호출!!");
		name="유병승";
		department="자바학부";
		job="강사";
	}
	public static Employee getEmployee()
	{
		return new Employee();
	}
	
	//매개변수가 있는 생성자
	public Employee(String intputName,String department,
			int salary,int forYears, Date enrollDate) {
		name=intputName;
		this.department=department;
		this.salary=salary;
		this.forYears=forYears;
		this.enrollDate=enrollDate;
	}
	
	
	public void printEmployee()
	{
		System.out.println(name+department+salary
				+job+forYears+enrollDate);
	}
}


