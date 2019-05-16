package com.kh.model.vo;

public class Teacher extends Person {
	private String gwamok;
	private int expert;

	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String gwamok, int expert) {
		super();
		this.gwamok = gwamok;
		this.expert = expert;
	}

	public String getGwamok() {
		return gwamok;
	}

	public void setGwamok(String gwamok) {
		this.gwamok = gwamok;
	}

	public int getExpert() {
		return expert;
	}

	public void setExpert(int expert) {
		this.expert = expert;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(gwamok + expert);
	}

}
