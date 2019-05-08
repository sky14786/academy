package com.kh.forinfor.controller;

import java.util.Scanner;

public class ForInForController {

	public void basicTest() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("=====" + i + "단 =====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

	public void reverseBasicTest() {
		for (int i = 9; i > 1; i--) {
			System.out.println("=====" + i + "단 =====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

	public void overlayForTest1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오 : ");
		int input = sc.nextInt();
		if (input > 0) {

			for (int i = 0; i < input; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(i + 1);
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}

	public void overlayForTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		if (input > 0) {
			for (int i = 1; i <= input; i++) {
				for (int j = 1; j <= input; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}

	public void overlayForTest3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		if (input > 0) {
			for (int i = 0; i < input; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (input < 0) {
			for (int i = input; i < 0; i++) {
				for (int g = input; g < i; g++) {
					System.out.print(" ");
				}
				for (int j = 0; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("출력 기능이 없습니다.");
		}
	}

	// 각 인덱스에 있는값이 배열에 몇개나 중복되는지 확인
	public void overlayTest() {

		int[] intArr = { 1, 1, 2, 3, 4, 5, 5, 6, 6, 6, 6, 6, 3, 2, 1 };
		for (int i = 0; i < intArr.length; i++) {
			int value = intArr[i];
			int count = 0;
			for (int j = 0; j < intArr.length; j++) {
				if (value == intArr[j]) {
					count++;
				}
			}
			System.out.println(value + "와 같은 값 : " + count);
		}
	}

	public void overlayForTest4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < input; i++) {
			for (int g = 0; g < i; g++) {
				System.out.print(" ");
			}
			for (int j = input; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
