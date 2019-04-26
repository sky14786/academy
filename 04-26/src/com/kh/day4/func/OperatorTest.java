package com.kh.day4.func;

import java.util.Scanner;

public class OperatorTest {
	public void cal() {
		// 기본적인 사칙연산하기
		int num = 10;
		int num2 = 20;
		int num3 = 30;

		System.out.println(num + num2);
		System.out.println(num2 + num3);
		System.out.println(num + num2 + num3);
	}

	public void compare() {
		int a = 25;
		int b = 20;
		int c = 25;
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a != b);
		System.out.println(a != c);
		System.out.println(a > c);
		System.out.println(a >= c);

		double dnum = 12.34, dnum2 = 34.5;
		System.out.println(dnum == dnum2);
		System.out.println(dnum != dnum2);
		System.out.println(dnum > dnum2);

		char ch = 'a', ch1 = 'b', ch2 = 'a';
		System.out.println(ch < ch1);
	}

	public void complexTest() {
		int a = 10, b = 20, c = 30;
		a += 3;
		System.out.println(a);
		a += b;
		System.out.println(a);
		a -= c;
		System.out.println(a);
	}

	public void sum() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오");
		sum += sc.nextInt();
		sum += sc.nextInt();
		sum += sc.nextInt();

		System.out.println("합은 : " + sum);

	}
}
