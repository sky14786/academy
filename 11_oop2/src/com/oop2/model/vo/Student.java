package com.oop2.model.vo;

public class Student extends Person{

	private double grade;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, String addr, double grade, String major) {
		//super();
		super(name,age,addr);
		//super.addr=addr;
		this.grade = grade;
		this.major = major;
	}
	
	
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	protected int plus(int a, int b) {
		a+=2;
		b+=2;
		return a+b;
	}
	
	
	
//	@Override
//	public String toString() {
//		return "Student [grade=" + grade + ", major=" + major
//				+ "]";
//	}
	
	
	
}
