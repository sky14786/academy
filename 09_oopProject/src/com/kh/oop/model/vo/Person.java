package com.kh.oop.model.vo;

public class Person {
	
	private static int tempNumer=0;
	private int pNum;
	private String memberId="p001";
	//예약어설정 final, static
	//1. static공용으로 사용가능하게 변수를 공개하는 것
	//  저장공간이 heap이 아닌 static 영역에 설정됨
	//  프로그램의 시작과 동시에 저장공간이 생성됨.
	private static String name;
	//public int age;
	//char gender;//default
	public final int AGE;
	private char gender='중';
	private String[] hobby;
	private double height;
	
	
	//초기화블럭, 멤버변수에 값을 대입
	{
		AGE=19;
		pNum=++tempNumer;
		switch(pNum%2) {
			case 0 : gender='남';break;
			case 1 : gender='여';break;
		}
	}
	
	static{
		//pNum=19;
		//멤버변수에 대한 초기화불가능
		if(tempNumer==0) {name="안녕";}
		else {name="하이";}
	}
	
	
	
	public Person() {}

	//static변수에 대한 get/set
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Person.name=name;
	}
	/*
	 * public void setAge(int age) { this.age=age; }
	 */
	public int getAge() {
		return AGE;
	}
	
	//setter메소드!
//	public void setName(String name) {
//		this.name=name;
//	}
//	//getter메소드!
//	public String getName() {
//		return name;
//	}
	public String getMemberId() {
		return memberId;
	}
	
	
	public void printPerson() {
		System.out.println(pNum+name+AGE+gender+hobby+height);
		
	}
	
	
	
	
	
	
	
	
	
}
