package com.kh.controller;

import java.util.Scanner;

public class SwitchController {
	public void switchTest() {
		Scanner sc = new Scanner(System.in);

		System.out.println("===����� ��̴�===");
		System.out.print("��̸� ������(1.�ڵ�,2.����,3.����,4.��Ʃ��) : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1: System.out.println("������!");
			break;
		case 2: System.out.println("�α⼭�� ����....");
			break;
		case 3:System.out.println("�α���� ����....");
			break;
		case 4:System.out.println("�α⵿����....");
			break;
		default:System.out.println("�߸��Է��ϼ̽��ϴ�.");
			break;
		}
	}
}
