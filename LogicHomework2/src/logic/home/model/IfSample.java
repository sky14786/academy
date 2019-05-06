package logic.home.model;

import java.util.Scanner;

public class IfSample {
	Scanner sc = new Scanner(System.in);

	public void maxNumber() {
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();

		System.out.println("큰 수 : " + (num1 > num2 ? num1 : num2));
	}

	public void minNumber() {
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();

		System.out.println("작은 수 : " + (num1 < num2 ? num1 : num2));
	}

	public void threeMaxMin() {
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("정수3 입력 : ");
		int num3 = sc.nextInt();

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("가장 큰 수 : " + num1);
				if (num2 > num3) {
					System.out.println("가장 작은 수 : " + num3);
				} else {
					System.out.println("가장 작은 수 : " + num2);
				}
			} else {
				System.out.println("가장 큰 수 : " + num3);
				System.out.println("가장 작은 수 : " + num2);
			}
		} else {
			if (num2 > num3) {
				System.out.println("가장 큰 수 : " + num2);
				if (num3 > num1) {
					System.out.println("가장 작은 수 : " + num1);
				}
			} else {
				System.out.println("가장 큰 수 : " + num3);
				System.out.println("가장 작은 수 : " + num1);
			}
		}
	}

	public void checkEven() {
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		if (num1 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

	public void isPassFail() {

	}

	public void scoreGrade() {

	}

	public void checkPlusMinusZero() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		if (input > 0) {
			System.out.println("양수!");
		} else if (input < 0) {
			System.out.println("음수!");
		} else {
			System.out.println("0");
		}
	}

	public void whatCharacter() {
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("알파뱃 소문자!");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("알파뱃 대문자!");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println("숫자!");
		} else {
			System.out.println("기타문자!");
		}
	}
}
