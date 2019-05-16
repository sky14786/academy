package com.kh.model.vo;

public class Student extends Person {
	private int grade;
	private double result;

	public Student() {
	}

	public Student(int grade, double result, String name, String addr, int age, char gender) {
		super(name, addr, age, gender);
		this.grade = grade;
		this.result = result;

	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(grade + result);
	}
}
