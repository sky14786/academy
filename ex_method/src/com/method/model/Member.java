package com.method.model;

public class Member {
	
	private String name;
	private String email;
	private int age;
	private double height;
	private double weight;
	
	public Member() {}
	
	
	public Member(String name, String email, 
			int age, double height, double weight)
	{
		this.name=name;
		this.email=email;
		this.height=height;
		this.weight=weight;
		this.age=age;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void printMember()
	{
		System.out.println(name+email+age+height+weight);
	}
	
	
}
