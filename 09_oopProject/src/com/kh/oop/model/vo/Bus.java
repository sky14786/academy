package com.kh.oop.model.vo;

public class Bus {

	private String carName;
	private String companyName;
	private int persons;
	private int beagi;
	private int fuel;
	private int distance;
	
	public Bus() {
		this("�Ƿη�","�Ƿηι���",20,10,10,10); 
//		new Bus("�Ƿη�","�Ƿηι���",20,10,10,10);
		carName="Ÿ��";
		companyName="Ÿ���ֽ�ȸ��";
//		persons=20;
//		this("����","Ÿ���ֽ�ȸ��");
		
	}
	public Bus(String car, String com) {
		carName=car;
		companyName=com;
	}
	public Bus(String car, String com, int per,
			int bea,int fue, int dis)
	{
		this.persons=per;
		this.carName=car;
		this.companyName=com;
		this.beagi=bea;
		this.fuel=fue;
		this.distance=dis;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getPersons() {
		return persons;
	}
	public void setPersons(int persons) {
		this.persons = persons;
	}
	public int getBeagi() {
		return beagi;
	}
	public void setBeagi(int beagi) {
		this.beagi = beagi;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public void printBus() {
		System.out.println(carName+companyName+persons+beagi+distance+fuel);
	}
	
	
	
	
}
