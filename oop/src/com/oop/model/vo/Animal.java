package com.oop.model.vo;

public class Animal {
	private String category;
	private int age;
	private String name;
	private double weight;
	private double height;

	public Animal(String category, int age, double weight, double height) {
		this.category = category;
		this.age = age;
		this.weight = weight;
		this.height = height;

	}

	public Animal() {
		category = "없음";
		name = "없음";
	}

	public Animal(String category, int age, String name, double weight, double height) {
		this.category = category;
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void printAnimal() {
		System.out.println(category + age + name + weight + height);
	}

}
