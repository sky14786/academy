package com.kh.oop.model.vo;

import java.util.Date;

public class Employee {

	private String name;
	private String department;
	private int salary;
	private String job;
	private int forYears;
	private Date enrollDate;
	
	//�⺻������ ����
	private Employee() {
		System.out.println("������ ȣ��!!");
		name="������";
		department="�ڹ��к�";
		job="����";
	}
	public static Employee getEmployee()
	{
		return new Employee();
	}
	
	//�Ű������� �ִ� ������
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


