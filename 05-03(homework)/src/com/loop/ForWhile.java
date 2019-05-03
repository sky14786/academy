package com.loop;

import java.util.Scanner;

public class ForWhile {
	public void printStar1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int input = sc.nextInt();
		if (input > 0) {
			for (int i = 1; i <= input; i++) {
				for (int j = 1; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}

	public void printStar2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
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
			System.out.println("��� ����� �����ϴ�.");
		}
	}

	public void countInputCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		sc.nextLine();
		System.out.print("ã�� ���� �Է� : ");
		char ch = sc.next().charAt(0);
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' || str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
				if (str.charAt(i) == ch) {
					count++;
				}
			} else {
				System.out.println("�����ڰ� �ƴմϴ�.");
				return;
			}
		}
		System.out.println("���Ե� ���� : " + count);
	}

}
