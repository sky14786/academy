package com.ex.func;

import java.util.Scanner;

public class ExTest {
	public void cal() {

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
