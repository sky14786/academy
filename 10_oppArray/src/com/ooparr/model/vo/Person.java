package com.ooparr.model.vo;

public class Person {
	
	private String name;
	private int age;
	private String address;
	private double height;
	
	public Person() {} 
	
	public Person(String name, int age, String address, double height) {
		this.name=name;
		this.age=age;
		this.address=address;
		this.height=height;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	
	
	
	
}









