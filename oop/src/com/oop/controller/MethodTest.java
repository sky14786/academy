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
			System.out.println("������ �߸��Է�");
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
			System.out.println("������ �߸��Է�");
			break;

		}
		return result;
	}

	// ���ڿ� �ΰ��� �Է¹޾� ��ģ �� �������ִ� �޼ҵ�
	public String combine(String msg, String msg2) {
		return msg + msg2;
	}

	public int[] arrayReutrn() {
		int[] arrInt = new int[5];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i * 10;
		}
		return arrInt;
	}

	public void intputArr(int[] copy) {
		for (int i = 0; i < copy.length; i++) {
			copy[i] = i * 20;
		}
	}
}
