package com.oop2.model.vo;

public class Teacher {
	private String name;
	private int age;
	private String addr;
	private String major;
	private int expert;
	private char gender;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Teacher() {
	}

	public String getName() {
		return name;
	}

	public int getExpert() {
		return expert;
	}

	public void setExpert(int expert) {
		this.expert = expert;
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

	public Teacher(String name, int age, String addr, String major, int expert) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.major = major;
		this.expert = expert;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
