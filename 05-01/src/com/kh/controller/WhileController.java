package com.kh.controller;

import java.util.Scanner;

public class WhileController {
	public void whileStudy() {
		int i = 0;
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}
	}

	public void doWhileStudy() {
		int num3 = 10;
		while (num3 < 10) {
			System.out.println("이거 실행되니?");
		}
		do {
			System.out.println("이거 실행되니?");
			num3++;
		} while (num3 < 20);

	}

	public void whileExample1() {
		int i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
	}

	public void whileExample2() {
		int i = 100;
		while (i >= 100) {
			System.out.println(i);
			i--;
		}
	}

	public void whileExample3() {
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public void whileExample4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		int i = 1;
		while (i <= num) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public void whileExample5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		int i = 1, sum = 0;
		while (i <= num) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public void example1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.print("문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		int sum = 0;
		int temp;
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			if ((temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122)) {
				if (temp == ch) {
					sum++;
				}
			} else {
				answer = "Error";
			}
		}

		if (answer.equals("Error")) {
			System.out.println(answer);
		} else {
			System.out.println("포함된 갯수 : " + sum);
		}

	}
}