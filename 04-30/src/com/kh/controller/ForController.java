package com.kh.controller;

import java.util.Scanner;

public class ForController {
	public void forTest() {
		for (int i = 5; i < 10; i++) {
			System.out.println("�ȳ��ϼ���" + (i + 1));
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
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public void forExample6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
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
		System.out.println("1~100�� Ȧ�� �� : " + sum);
	}

	public void forProbleom1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0) {
				System.out.print("��");
			} else {
				System.out.print("��");
			}
		}
	}

	public void forProbleom2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		int input = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(input + " X " + i + " = " + (i * input));
		}
	}

	public void forProbleom3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String str = sc.nextLine();
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		int temp = 0;

		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			if (temp >= 97) {
				temp+=num;
				if(temp>122) {
					temp=96+num;
					System.out.print((char)temp+" ");
				}else {
					System.out.print((char)temp+" ");
				}
			} else if(temp >= 65) {
				temp+=num;
				if(temp>96) {
					temp=64+num;	
					System.out.print((char)temp+" ");
				}else {
					System.out.print((char)temp+" ");
				}
			}

		}

	}
}
