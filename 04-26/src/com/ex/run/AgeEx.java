package com.ex.run;

import java.util.Scanner;

public class AgeEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		System.out.println(sc.nextInt() < 19 ? "�̼����� �Դϴ�." : "�����Դϴ� ��������");

		System.out.print("������ �Է��ϼ��� (ex. ���� ����)");
		System.out.println(sc.nextLine().equals("����") ? "�������� ������" : "���������� ������");

	}

}
