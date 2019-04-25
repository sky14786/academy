package kh.vari.function;

import java.util.Scanner;

public class VariExample {
	public Scanner sc = new Scanner(System.in);

	public void example() {

		System.out.print("정수1번을 입력하시오 : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("정수2번을 입력하시오 : ");
		int b = sc.nextInt();

		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));

	}

	public void example2() {
		System.out.print("둘레와 면적을  구할 사각형의 가로값을 입력 : ");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.print("둘레와 면적을 구할 사각형의 세로값을 입력 : ");
		double b = sc.nextDouble();

		System.out.println("사각형의 둘레 : " + ((a + b) * 2));
		System.out.println("사각형의 넓이 : " + (a * b));
	}

	public void example3() {
		System.out.print("단어를 입력하시오 : ");
		String word = sc.nextLine();

		for (int i = 0; i < word.length(); i++) {
			System.out.println((i+1)+"번째 문자 : "+word.charAt(i));
		}

	}
}
