package com.ex.func;

import java.util.Scanner;

public class ExTest {
	public void cal() {

		Scanner sc = new Scanner(System.in);

		System.out.println("����1�� �Է��Ͻÿ�");
		int num = sc.nextInt();

		sc.nextLine();

		System.out.println("����2�� �Է��Ͻÿ�");
		int num2 = sc.nextInt();

		System.out.println(num + "+" + num2 + "=" + (num + num2));
		System.out.println(num + "-" + num2 + "=" + (num - num2));
		System.out.println(num + "*" + num2 + "=" + (num * num2));
		System.out.println(num + "/" + num2 + "=" + (num / num2));
		System.out.println(num + "%" + num2 + "=" + (num % num2));

	}

	public void cal2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("10�� �Է��Ͻÿ�:");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("20�� �Է��Ͻÿ� :");
		int num2 = sc.nextInt();

		System.out.println(num + " < " + num2 + "�� " + (num < num2) + "�̴�.");
		System.out.println(num + " > " + num2 + "�� " + (num2 > num) + "�̴�.");
		System.out.println(num + " > " + num2 + "�� " + (num > num2) + "�̴�.");
		System.out.println(num + " < " + num2 + "�� " + (num2 < num) + "�̴�.");
	}

	public void cal3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("���� �ϳ� �Է��Ͻÿ� : ");
		int b = sc.nextInt();

		System.out.println((a % 2 == 0) ? a : "2�� ����� �ƴմϴ�.");
		System.out.println((b % 3 == 0) ? b : "3�� ����� �ƴմϴ�.");

	}

	public void cal4() {
		// �Ϲݳ�������
		// �񱳿�����(����)�� �ΰ��̻� �����ϴ� ���!
		boolean flagC = true, flagD = false;
		System.out.println(flagC && flagD);
		System.out.println(flagC || flagD);

		int age = 19;
		char gender = '��';
		boolean flagMili = true;
		System.out.println(age > 19 && gender == '��' && flagMili == true);
		

	}
}
