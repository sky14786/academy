package com.more.model.vo;

public class Tiger extends Animal {

	public Tiger() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Tiger(String category, String name) {
		super(category, name);
	}



	public void attack() {
		System.out.print("공격!!! 앞발 할퀴기!");
	}



	@Override
	public void bark() {

		System.out.println("어흥~ 이빨 빠졌다!");
	
	}
	
	
	
	
}









