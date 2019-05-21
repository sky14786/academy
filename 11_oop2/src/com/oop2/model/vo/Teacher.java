package com.oop2.model.vo;

public class Teacher {

	private String major;
	private int expert;

	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, int age, String addr, String major, int expert) {
		super();
		new Person().addr=addr;
		
		this.major = major;
		this.expert = expert;
	}



	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getExpert() {
		return expert;
	}

	public void setExpert(int expert) {
		this.expert = expert;
	}	
	

	@Override
	public String toString() {
		return "Teacher [ major=" + major + ", expert=" + expert
				+ "]";
	}
	
	
	
	
}
