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
	}
}
