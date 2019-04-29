package com.kh.day5.function;

import java.util.Scanner;

public class ConditionTest {
	public void condition() {
		// 조건문 if를 사용해보자!
		int num = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 하나를 입력하세요 : ");
		num = sc.nextInt();

		if (num > 0) {
			System.out.println("출력");
		}
		System.out.println("{}밖에 있는 것!");
	}

	public void checkGender() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 성별은?(남,여) : ");
		char gender = sc.nextLine().charAt(0);

//		if (gender == '남') {
//			System.out.println("남자는 오른쪽으로 가시오");
//		} else if (gender == '여') {
//			System.out.println("여자는 왼쪽으로 가시오");
//		} else {
//			System.out.println("성별을 잘못 입력하셨습니다.");
//		}
		if (gender == '남') {
			System.out.println("남자는 오른쪽으로 가시오");
		}
		if (gender == '여') {
			System.out.println("여자는 왼쪽으로 가시오:");
		}

	}

	public void ssample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("식물 , 동물 입력 : ");
		if (sc.nextLine().equals("동물")) {
			System.out.println("동물입니다");
		}
	}

	public void ssample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();

		if (age >= 8 && age <= 12) {
			System.out.println("초딩이네요");
		}
		if (age >= 13 && age <= 16) {
			System.out.println("중딩이네요");
		}
		if (age >= 17 && age <= 19) {
			System.out.println("고딩이네요");
		}
	}

	public void ssample3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연봉을 입력하세오 : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("고액연봉자네요 한턱쏘세요~");
		}
	}

	public void sample1() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;

		System.out.print("국어 점수를 입력하시오 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하시오 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하시오 : ");
		mat = sc.nextInt();

		sum = kor + eng + mat;
		avg = sum / 3;

		if (sum >= 250) {
			System.out.println("우수생입니다.");
		}

	}

	public void sample2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("A의 연봉을 입력하시오 : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("A는 고액연봉자입니다");
		}
		System.out.print("B의 연봉을 입력하시오 : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("B는 고액연봉자입니다");
		}
		System.out.print("C의 연봉을 입력하시오 : ");
		if (sc.nextInt() >= 5000) {
			System.out.println("C는 고액연봉자입니다.");
		}
	}

	public void sample3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개를 입력하시오 : ");
		if (sc.nextInt() % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}
}
