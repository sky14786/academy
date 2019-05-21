package com.kh.oop.model.vo;

public class Person {
	
	private static int tempNumer=0;
	private int pNum;
	private String memberId="p001";
	//������ final, static
	//1. static�������� ��밡���ϰ� ������ �����ϴ� ��
	//  ��������� heap�� �ƴ� static ������ ������
	//  ���α׷��� ���۰� ���ÿ� ��������� ������.
	private static String name;
	//public int age;
	//char gender;//default
	public final int AGE;
	private char gender='��';
	private String[] hobby;
	private double height;
	
	
	//�ʱ�ȭ��, ��������� ���� ����
	{
		AGE=19;
		pNum=++tempNumer;
		switch(pNum%2) {
			case 0 : gender='��';break;
			case 1 : gender='��';break;
		}
	}
	
	static{
		//pNum=19;
		//��������� ���� �ʱ�ȭ�Ұ���
		if(tempNumer==0) {name="�ȳ�";}
		else {name="����";}
	}
	
	
	
	public Person() {}

	//static������ ���� get/set
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
	
	//setter�޼ҵ�!
//	public void setName(String name) {
//		this.name=name;
//	}
//	//getter�޼ҵ�!
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
