package com.more.model.vo;

public class Tiger extends Animal {

	public Tiger() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Tiger(String category, String name) {
		super(category, name);
	}



	public void attack() {
		System.out.print("����!!! �չ� ������!");
	}



	@Override
	public void bark() {

		System.out.println("����~ �̻� ������!");
	
	}
	
	
	
	
}









