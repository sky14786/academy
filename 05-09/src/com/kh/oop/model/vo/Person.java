package com.kh.oop.model.vo;

public class Person {
	private int pNumber = 0;
	private String name;
	private int age;
	private char gender;
	private String[] hobby;
	private double height;
	// �ʱ�ȭ��, ��� ������ ���� ����
	{
		++pNumber;

	}

	public Person() {
	}

	public void printPerson() {
		System.out.println(name + age + gender + hobby + height);
		System.out.println(pNumber);
	}

}
