package logic.home.model;

import java.util.Scanner;

public class ForSample {
	Scanner sc = new Scanner(System.in);

	public void sum1To10() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10 �������� �հ� : " + sum);

	}

	public void sumEven1To100() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~100������ ¦������ �հ� : " + sum);
	}

	public void oneGugudan() {
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(input + " X " + i + " = " + (input * i));
		}
	}

	public void sumMinToMax() {
		System.out.print("����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();
		int min, max;
		int sum = 0;

		if (num1 > num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}

		for (; min <= max; min++) {
			sum += min;
		}
		System.out.println("�հ� : " + sum);
	}

	public void printStart() {
		System.out.print("�ټ� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("ĭ�� �Է� : ");
		int num2 = sc.nextInt();

		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void printNumberStar() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void printTriangleStar() {
		System.out.print("�� ���� �Է��Ͻÿ� : ");
		int input = sc.nextInt();

		if (input > 0) {
			for (int i = 0; i < input; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			input = input + (-input * 3);
			for (int i = 0; i < input; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" ");
				}
				for (int k = input; k >= i * 2 + 2; k--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public void guguDan() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("=======" + i + "��=======");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}
}
