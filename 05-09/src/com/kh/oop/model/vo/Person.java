package com.kh.oop.model.vo;

public class Person {
	private static int pNum;
	private static int tempNumber;
	private static String name;
	private int age;
	private char gender;
	private String[] hobby;
	private double height;
	// 초기화블럭, 멤버 변수에 값을 대입
	{
		pNum = ++tempNumber;
		switch (pNum % 2) {
		case 0:
			gender = '남';
			break;
		case 1:
			gender = '여';
			break;
		}
	}

	static {
		pNum = 19;
		if (tempNumber == 0) {
			name = "안녕";
		} else {
			name = "하이";
		}
	}

	public Person() {
	}

	public void printPerson() {
		System.out.println(name + age + gender + hobby + height);
		System.out.println(pNum);
	}

}
