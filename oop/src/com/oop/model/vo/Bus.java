package com.oop.model.vo;

public class Bus {
	private String busName, company;
	private int onPeople, cc;
	private double fuel, totalMove;

	public Bus() {
		busName = "타요";
		company = "타요주식회사";
		onPeople = 20;
		cc = 0;
		fuel = 0;
		totalMove = 0;
	}

	public Bus(String busName, String company, int onPeople, int cc, double fuel, double totalMove) {
		super();
		this.busName = busName;
		this.company = company;
		this.onPeople = onPeople;
		this.cc = cc;
		this.fuel = fuel;
		this.totalMove = totalMove;
	}

	public void printBus() {
		System.out.println("차량이름 : " + busName);
		System.out.println("회사명 : " + company);
		System.out.println("탑승인원 : " + onPeople);
		System.out.println("배기량 : " + cc);
		System.out.println("연료 : " + fuel);
		System.out.println("주행거리 : " + totalMove);
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getOnPeople() {
		return onPeople;
	}

	public void setOnPeople(int onPeople) {
		this.onPeople = onPeople;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getTotalMove() {
		return totalMove;
	}

	public void setTotalMove(double totalMove) {
		this.totalMove = totalMove;
	}
}
