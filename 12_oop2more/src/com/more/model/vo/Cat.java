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
		System.out.println("�չ� �������� ");
	}

	@Override
	public void bark() {
		System.out.println("�Ͼ߾ƿ�! �Ͼ߾ƿ�!");
		
	}
	
	
	
	
}
