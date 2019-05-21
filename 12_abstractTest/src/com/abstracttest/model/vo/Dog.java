package com.abstracttest.model.vo;

public class Dog extends Animal{
	
	private String tuel;
	private double weight;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String category, String tuel, double weight) {
		super(name, category);
		this.tuel = tuel;
		this.weight = weight;
	}

	public String getTuel() {
		return tuel;
	}

	public void setTuel(String tuel) {
		this.tuel = tuel;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
//	@Override
//	public void printAnimal() {
//		System.out.print("°­¾ÆÁö!");
//	}
//	
	
	
	
	
	
	
	

}
