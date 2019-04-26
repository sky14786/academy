package com.kh.day4.func;

import java.util.Scanner;

public class OperatorTest {
	public void cal() {
		// 기본적인 사칙연산하기
//		int num = 10;
//		int num2 = 20;
//		int num3 = 30;
//
//		System.out.println(num + num2);
//		System.out.println(num2 + num3);
//		System.out.println(num + num2 + num3);

		Scanner sc = new Scanner(System.in);

		System.out.println("정수1번 입력하시오");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("정수2번 입력하시오");
		int num2 = sc.nextInt();

		System.out.println(num + "+" + num2 + "=" + (num + num2));
		System.out.println(num + "-" + num2 + "=" + (num - num2));
		System.out.println(num + "*" + num2 + "=" + (num * num2));
		System.out.println(num + "/" + num2 + "=" + (num / num2));

	}
}
