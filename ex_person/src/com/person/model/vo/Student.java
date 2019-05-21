package com.person.model.vo;

public class Student extends Person {

	private int grade;
	private int sungjuck;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, char gender, String address, int grade, int sungjuck) {
		super(name, age, gender, address);
		this.grade = grade;
		this.sungjuck = sungjuck;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getSungjuck() {
		return sungjuck;
	}

	public void setSungjuck(int sungjuck) {
		this.sungjuck = sungjuck;
	}
	
	
//	@Override
//	public String toString() {
//		return super.getName()+super.getAge()
//		+super.getGender()+super.getAddress()
//		+grade+sungjuck;
//	}
	
	
	
	
	
	
	
}
