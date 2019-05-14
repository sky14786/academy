package com.oop.controller;

public class MethodTest {

	public void calculator(int su, int su1, char op) {
		switch (op) {
		case '+':
			System.out.println(su + su1);
			break;
		case '-':
			System.out.println(su - su1);
			break;
		case '*':
			System.out.println(su * su1);
			break;
		case '/':
			System.out.println((double) (su / su1));
			break;
		case '%':
			System.out.println(su % su1);
			break;
		default:
			System.out.println("연산자 잘못입력");
			break;

		}
	}

	public double calculator1(int su, int su1, char op) {
		double result = 0;
		switch (op) {
		case '+':
			result = su + su1;
			break;
		case '-':
			result = su - su1;
			break;
		case '*':
			result = su * su1;
			break;
		case '/':
			result = (double) su / su1;
			break;
		case '%':
			result = su % su1;
			break;
		default:
			System.out.println("연산자 잘못입력");
			break;

		}
		return result;
	}

	// 문자열 두개를 입력받아 합친 후 리턴해주는 메소드
	public String combine(String msg, String msg2) {
		return msg + msg2;
	}
}
