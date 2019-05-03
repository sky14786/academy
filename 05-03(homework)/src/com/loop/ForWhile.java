package com.loop;

import java.util.Scanner;

public class ForWhile {
	public void printStar1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int input = sc.nextInt();
		if (input > 0) {
			for (int i = 1; i <= input; i++) {
				for (int j = 1; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}

	public void printStar2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하시오 : ");
		int input = sc.nextInt();

		if (input > 0) {
			for (int i = 1; i <= input; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else if (input < 0) {
			for (int i = -1; i >= input; i--) {
				for (int j = 0; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("출력 기능이 없습니다.");
		}
	}

	public void countInputCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		sc.nextLine();
		System.out.print("찾을 문자 입력 : ");
		char ch = sc.next().charAt(0);
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' || str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				if (str.charAt(i) == ch) {
					count++;
				}
			} else {
				System.out.println("영문자가 아닙니다.");
				return;
			}
		}
		System.out.println("포함된 갯수 : " + count);
	}

}
