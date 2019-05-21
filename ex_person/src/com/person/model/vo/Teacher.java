package com.person.model.vo;

public class Teacher extends Person{

	private String guamook;
	private int exp;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, char gender, String address, String guamook, int exp) {
		super(name, age, gender, address);
		this.guamook = guamook;
		this.exp = exp;
	}

	public String getGuamook() {
		return guamook;
	}

	public void setGuamook(String guamook) {
		this.guamook = guamook;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		return super.getName()+super.getAge()
		+super.getGender()+super.getAddress()
		+guamook+exp;
	}
	
	
	
	
	
	
	
}
