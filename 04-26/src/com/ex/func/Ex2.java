package com.ex.func;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		thirdOper();
	}

	public static void thirdOper() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� �Է� : ");
		int first = sc.nextInt();
		
		System.out.print("�ι�° �� �Է� : ");
		int second = sc.nextInt();
		
		String msg = first > second ? "ù��° ���� Ŀ" : "�ι�° ���� Ŀ";

		System.out.println(msg);

	}
}
