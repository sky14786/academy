package com.more.model.vo;

public class Dog extends Animal{

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String category, String name) {
		super(category, name);
		// TODO Auto-generated constructor stub
	}




	public void action() {
		System.out.println("�������� ������");
	}

	@Override
	public void bark() {
		System.out.println("�۸۸�!! �п�!! ����!");
	}
	
	
	

}
