package com.kh.model.vo;

public class Person {
	private String name, addr;
	private int age;
	private char gender;

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Person(String name, String addr, int age, char gender) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void print() {
		System.out.print(name + addr + age + gender+"   ");
	}

}
