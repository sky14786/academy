package com.hobby.func;

import java.util.Scanner;

public class Input {
	public void inputTest() {
		Scanner sc = new Scanner(System.in);

		System.out.print("��̸� �Է��Ͻÿ� : ");
		String hobby = sc.nextLine();
		System.out.print("��°��� �Է��Ͻÿ� : ");
		String hometown = sc.nextLine();
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("�����Ը� �Է��Ͻÿ� : ");
		float weight = sc.nextFloat();

		System.out.println("����� ��̴� : " + hobby);
		System.out.println("����� ��°��� : " + hometown);
		System.out.println("����� ���̴� : " + age);
		System.out.println("����� �����Դ� : " + weight);
	}

}
