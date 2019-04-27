package kh.java.operator;

import java.util.Scanner;

public class TestOperator {
	public void operatorSample() {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("세자리 이상의 숫자를 입력 하시오 : ");
		num = sc.nextInt();

		num /= 100;
		num *= 100;

		System.out.println(num);

	}

	public void operatorSample2() {
		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.print("총 과일의 갯수를 입력하시오 : ");
		num1 = sc.nextInt();
		System.out.print("한개의 바구니에 들어가는 과일의 갯수를 입력하시오 : ");
		num2 = sc.nextInt();

		System.out.println("과읠 갯수 : " + num1);
		System.out.println("바구니 과일 수 : " + num2);
		System.out.println(num1 + "개의 과일을 담으려면 " + (num1 % num2 == 0 ? num1 / num2 : (num1 / num2) + 1) + "개가 필요합니다.");
		System.out.println("마지막 바구니에 들어가는 과일의 수는 : " + (num1 % num2 != 0 ? num1 % num2 : num2));

	}

	public void operatorSample3() {
		Scanner sc = new Scanner(System.in);
		int changer;
		char ch;

		System.out.print("영어 하나의 문자를 입력하시오 : ");
		ch = sc.nextLine().charAt(0);

		changer = (int) ch >= 97 ? (int) ch - 32 : (int) ch + 32;
		System.out.println("문자 입력 : " + ch);
		System.out.println(ch + " -> " + (char) changer);
	}
}
