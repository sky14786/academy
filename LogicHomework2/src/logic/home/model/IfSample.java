package logic.home.model;

import java.util.Scanner;

public class IfSample {
	Scanner sc = new Scanner(System.in);

	public void maxNumber() {
		System.out.print("����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();

		System.out.println("ū �� : " + (num1 > num2 ? num1 : num2));
	}

	public void minNumber() {
		System.out.print("����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();

		System.out.println("���� �� : " + (num1 < num2 ? num1 : num2));
	}

	public void threeMaxMin() {
		System.out.print("����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("����3 �Է� : ");
		int num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("���� ū �� : " + num1);
				if (num2 > num3) {
					System.out.println("���� ���� �� : " + num3);
				} else {
					System.out.println("���� ���� �� : " + num2);
				}
			} else {
				System.out.println("���� ū �� : " + num3);
				System.out.println("���� ���� �� : " + num2);
			}
		} else {
			if (num2 > num3) {
				System.out.println("���� ū �� : " + num2);
				if (num3 > num1) {
					System.out.println("���� ���� �� : " + num1);
				}
			} else {
				System.out.println("���� ū �� : " + num3);
				System.out.println("���� ���� �� : " + num1);
			}
		}
	}

	public void checkEven() {
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

	public void isPassFail() {

	}

	public void scoreGrade() {

	}

	public void checkPlusMinusZero() {
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		if (input > 0) {
			System.out.println("���!");
		} else if (input < 0) {
			System.out.println("����!");
		} else {
			System.out.println("0");
		}
	}

	public void whatCharacter() {
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.next().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("���Ĺ� �ҹ���!");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("���Ĺ� �빮��!");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("����!");
		} else {
			System.out.println("��Ÿ����!");
		}
	}
}
