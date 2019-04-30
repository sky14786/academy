package com.kh.controller;

import java.util.Scanner;

public class ForController {
	public void forTest() {
		for (int i = 5; i < 10; i++) {
			System.out.println("안녕하세요" + (i + 1));
		}
	}

	public void forExample1() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	public void forExample2() {
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public void forExample3() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public void forExample4() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public void forExample5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public void forExample6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오 : ");
		int input = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public void forExample4_2() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("1~100의 홀수 합 : " + sum);
	}
}
