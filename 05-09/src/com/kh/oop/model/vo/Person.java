package com.kh.oop.model.vo;

public class Person {
	private String name;
	private int age;
	private char gender;
	private String[] hobby;
	private double height;

	public Person() {
	}

	public void printPerson() {
		System.out.println(name + age + gender + hobby + height);
	}

}
