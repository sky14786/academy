package com.kh.oop.model.vo;

public class Person {
	private static int pNum;
	private static int tempNumber;
	private static String name;
	private int age;
	private char gender;
	private String[] hobby;
	private double height;
	// �ʱ�ȭ��, ��� ������ ���� ����
	{
		pNum = ++tempNumber;
		switch (pNum % 2) {
		case 0:
			gender = '��';
			break;
		case 1:
			gender = '��';
			break;
		}
	}

	static {
		pNum = 19;
		if (tempNumber == 0) {
			name = "�ȳ�";
		} else {
			name = "����";
		}
	}

	public Person() {
	}

	public void printPerson() {
		System.out.println(name + age + gender + hobby + height);
		System.out.println(pNum);
	}

}
