package com.kh.day3.fucntion;

import java.util.Scanner;

public class ScannerTeset {
	public void inputTest() {
		// Scanner��ü�� �������
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���� �Է� : ");
		int age = sc.nextInt();
		sc.nextLine();
		//
		System.out.print("\n����� �̸� �Է� : ");
		// sc.next(); �� ���� ����
		// sc.nextLine()�� ����Ҷ��� �� �ڵ忡�� sc.next() / sc.nextInt()
		// sc.nextFFloat() / sc.nextDouble()�� �ִ��� Ȯ���ϰ� ������ �ݵ�� sc.nextLine()�� ����Ͽ�
		// buffer �� ����־�� �Ѵ�.

		String name = sc.nextLine(); // ���͸� �������� ���� ����

		System.out.print("����� Ű�� : ");
		float height = sc.nextFloat();
		System.out.println("����� ���̴� : " + age);
		System.out.println("����� �̸��� : " + name);
		System.out.println("����� Ű�� : " + height);

	}

}
