package com.student.model.vo;

public class Student {

	private static int count = 0;
	private static int studentsCount = 0;
	private int studentNo;
	private String name;
	private int grade;
	private int number;
	private double sungjuk;

	public Student() {
	}

	public Student(String name, int grade, int number, double sungjuk, boolean isUpdate) {
		if (isUpdate) {
			this.name = name;
			this.grade = grade;
			this.number = number;
			this.sungjuk = sungjuk;
		} else {
			++count;
			this.studentNo = ++studentsCount;
			this.name = name;
			this.grade = grade;
			this.number = number;
			this.sungjuk = sungjuk;
		}
	}

	public void printStudent() {
		String msg = "학번ID : " + studentNo;
		msg += " 이름 : " + name;
		msg += " 학년 : " + grade;
		msg += " 번호 : " + number;
		msg += " 성적 : " + sungjuk;
		System.out.println(msg);
	}

	// 변수에 대한 getter, setter 메소드

	public static int getCount() {
		return Student.count;
	}

	public static void deleteStudnet() {
		Student.count--;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getSungjuk() {
		return sungjuk;
	}

	public void setSungjuk(double sungjuk) {
		this.sungjuk = sungjuk;
	}

}
