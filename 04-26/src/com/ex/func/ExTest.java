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

	}
}
