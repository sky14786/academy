package com.kh.day5.function;

import java.util.Scanner;

public class ConditionTest {
	public void condition() {
		// ���ǹ� if�� ����غ���!
		int num = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("���");
		}
		System.out.println("{}�ۿ� �ִ� ��!");
	}

	public void checkGender() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ������?(��,��) : ");
		char gender = sc.nextLine().charAt(0);

//		if (gender == '��') {
//			System.out.println("���ڴ� ���������� ���ÿ�");
//		} else if (gender == '��') {
//			System.out.println("���ڴ� �������� ���ÿ�");
//		} else {
//			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
//		}
		if (gender == '��') {
			System.out.println("���ڴ� ���������� ���ÿ�");
		}
		if (gender == '��') {
			System.out.println("���ڴ� �������� ���ÿ�:");
		}

	}

	public void ssample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ĺ� , ���� �Է� : ");
		if (sc.nextLine().equals("����")) {
			System.out.println("�����Դϴ�");
		}
	}

	public void ssample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();

		if (age >= 8 && age <= 12) {
			System.out.println("�ʵ��̳׿�");
		}
		if (age >= 13 && age <= 16) {
			System.out.println("�ߵ��̳׿�");
		}
		if (age >= 17 && age <= 19) {
			System.out.println("����̳׿�");
		}
	}

	public void ssample3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("��׿����ڳ׿� ���ν��~");
		}
	}

	public void sample1() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;

		System.out.print("���� ������ �Է��Ͻÿ� : ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		mat = sc.nextInt();

		sum = kor + eng + mat;
		avg = sum / 3;

		if (sum >= 250) {
			System.out.println("������Դϴ�.");
		}

	}

	public void sample2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("A�� ������ �Է��Ͻÿ� : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("A�� ��׿������Դϴ�");
		}
		System.out.print("B�� ������ �Է��Ͻÿ� : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("B�� ��׿������Դϴ�");
		}
		System.out.print("C�� ������ �Է��Ͻÿ� : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("C�� ��׿������Դϴ�.");
		}
	}

	public void sample3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ѱ��� �Է��Ͻÿ� : ");
		if (sc.nextInt() % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
}
