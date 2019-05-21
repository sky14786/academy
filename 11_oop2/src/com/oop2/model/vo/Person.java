package com.oop2.model.vo;

public class Person {

	private String name;
	private int age;
	protected String addr;
	private char gender;
	private int pNum;
	
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public Person(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}	
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}	

	public int getpNum() {
		return pNum;
	}

	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	
	int plus(int a, int b) {
		return a+b;
	}
	
	
	
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
//	}
	





	



	
	
	
	
	
	
}
