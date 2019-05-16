package com.student.model.vo;

public class Student {

	private static int count=0;
	private int studentNo;
	private String name;
	private int grade;
	private int number;
	private double sungjuk;
	
	{
		studentNo=count++;
	}
	
	public Student() {}
	
	public Student(String name, int grade, 
			int number, double sungjuk) {
		this.name=name;
		this.grade=grade;
		this.number=number;
		this.sungjuk=sungjuk;		
	}
	public static int getCount()
	{
		return Student.count;
	}
	
	public static void deleteCount() {
		Student.count--;
	}
	
	
	public int getStudentNo(){
		return studentNo;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setGrade(int grade) {
		 this.grade=grade;
	}
	public int getGrade() {
		return grade;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public double getSungjuk() {
		return sungjuk;
	}
	public void setSungjuk(double sungjuk) {
		this.sungjuk=sungjuk;
	}

	public void printStudent()
	{
		String msg="�й�ID : "+studentNo;
		msg+=" �̸� : "+name;
		msg+=" �г� : "+grade;
		msg+=" ��ȣ : "+number;
		msg+=" ���� : "+sungjuk;
		System.out.println(msg);
	}
	
	
}







