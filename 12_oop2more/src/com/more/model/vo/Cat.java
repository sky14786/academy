package com.more.model.vo;

public class Cat extends Animal {

	public Cat() {
		// TODO Auto-generated constructor stub
	}
		
	public Cat(String category, String name) {
		super(category, name);
		// TODO Auto-generated constructor stub
	}

	public void clean() {
		System.out.println("앞발 낼름낼름 ");
	}

	@Override
	public void bark() {
		System.out.println("니야아옹! 니야아옹!");
		
	}
	
	
	
	
}
