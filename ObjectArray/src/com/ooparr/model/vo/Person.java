package com.ooparr.model.vo;

public class Person {
	private String name;
	private int age;
	private String address;
	private double height;

	public Person() {
	}

	public Person(String name, int age, String address, double height) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.height = height;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
