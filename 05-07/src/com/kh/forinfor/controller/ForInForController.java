package com.kh.forinfor.controller;

import java.util.Scanner;

public class ForInForController {

	public void basicTest() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("=====" + i + "�� =====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

	public void reverseBasicTest() {
		for (int i = 9; i > 1; i--) {
			System.out.println("=====" + i + "�� =====");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

	public void overlayForTest1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		int input = sc.nextInt();
		if (input > 0) {

			for (int i = 0; i < input; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(i + 1);
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}

	public void overlayForTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();

		if (input > 0) {
			for (int i = 1; i <= input; i++) {
				for (int j = 1; j <= input; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}

	public void overlayForTest3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
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
			System.out.println("��� ����� �����ϴ�.");
		}
	}

	// �� �ε����� �ִ°��� �迭�� ��� �ߺ��Ǵ��� Ȯ��
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
			System.out.println(value + "�� ���� �� : " + count);
		}
	}

	public void overlayForTest4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
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
