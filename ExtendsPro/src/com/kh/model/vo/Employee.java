package com.kh.model.vo;

public class Employee extends Person {
	private String buseo;
	private int money;

	public Employee() {
	}

	public String getBuseo() {
		return buseo;
	}

	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}

	public int getMoney() {
		return money;
	}

	public Employee(String buseo, int money) {
		super();
		this.buseo = buseo;
		this.money = money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println(buseo + money);
	}
}
