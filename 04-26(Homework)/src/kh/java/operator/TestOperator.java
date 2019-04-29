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

	// 강사님 소스 4-3번문제
	public void changeChar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 한개를 이볅하세요(대소문자 구분 : ");
		char ch = sc.next().charAt(0);
		// char msg = ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : (char) (ch + 32);
		char msg = ch >= 'a' && ch <= 'z' ? (char) (ch - 32) : (ch >= 'A' && ch <= 'Z' ? (char) (ch + 32) : 'X');
		System.out.println("변경값 : " + msg);
		// System.out.println(ch);
		// 입력받은 글자가 소문자일때 대문자로
		// System.out.println("입력받은값 : " + ch + " , 변경 : " + (ch - 32));
		// 입력받은 글자가 대문자일때 소문자로
		// System.out.println("입력받은값 : " + ch + " , 변경 : " + (ch + 32));
		// System.out.println("변경값 : " + (char) (ch ^ 32));
	}
}
