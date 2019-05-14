package com.student.model.vo;

public class Student {

	private static int count = 0;
	private int studentNo;
	private String name;
	private int grade;
	private int number;
	private double sungjuk;

	{
		studentNo = 2019 + count++;
	}

	public Student() {
	}

	public Student(String name, int grade, int number, double sungjuk) {
		this.name = name;
		this.grade = grade;
		this.number = number;
		this.sungjuk = sungjuk;
	}

	public String printStudent() {
		String result = "학번ID : " + studentNo + " 이름 : " + name + " 학년 : " + grade + " 번호 : " + number + " 성적 : "
				+ sungjuk;
		return result;
	}

	public static int getCount() {
		return Student.count;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setSungjuk(double sungjuk) {
		this.sungjuk = sungjuk;
	}

	public double getSungjuk() {
		return sungjuk;
	}
}
