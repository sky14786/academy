package kh.java.operator;

import java.util.Scanner;

public class TestOperator {
	public void operatorSample() {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("���ڸ� �̻��� ���ڸ� �Է� �Ͻÿ� : ");
		num = sc.nextInt();

		num /= 100;
		num *= 100;

		System.out.println(num);

	}

	public void operatorSample2() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.print("�� ������ ������ �Է��Ͻÿ� : ");
		num1 = sc.nextInt();
		System.out.print("�Ѱ��� �ٱ��Ͽ� ���� ������ ������ �Է��Ͻÿ� : ");
		num2 = sc.nextInt();

		System.out.println("���� ���� : " + num1);
		System.out.println("�ٱ��� ���� �� : " + num2);
		System.out.println(num1 + "���� ������ �������� " + (num1 % num2 == 0 ? num1 / num2 : (num1 / num2) + 1) + "���� �ʿ��մϴ�.");
		System.out.println("������ �ٱ��Ͽ� ���� ������ ���� : " + (num1 % num2 != 0 ? num1 % num2 : num2));

	}

	public void operatorSample3() {
		Scanner sc = new Scanner(System.in);
		int changer;
		char ch;

		System.out.print("���� �ϳ��� ���ڸ� �Է��Ͻÿ� : ");
		ch = sc.nextLine().charAt(0);

		changer = (int) ch >= 97 ? (int) ch - 32 : (int) ch + 32;
		System.out.println("���� �Է� : " + ch);
		System.out.println(ch + " -> " + (char) changer);
	}

	// ����� �ҽ� 4-3������
	public void changeChar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Ѱ��� �̓��ϼ���(��ҹ��� ���� : ");
		char ch = sc.next().charAt(0);
		// char msg = ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : (char) (ch + 32);
		char msg = ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : (ch >= 'A' && ch <= 'Z' ? (char) (ch + 32) : 'X');
		System.out.println("���氪 : " + msg);
		// System.out.println(ch);
		// �Է¹��� ���ڰ� �ҹ����϶� �빮�ڷ�
		// System.out.println("�Է¹����� : " + ch + " , ���� : " + (ch - 32));
		// �Է¹��� ���ڰ� �빮���϶� �ҹ��ڷ�
		// System.out.println("�Է¹����� : " + ch + " , ���� : " + (ch + 32));
		// System.out.println("���氪 : " + (char) (ch ^ 32));
	}
}
