package day7.controller;

import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);

	public void calculator() {
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산문자 입력 (*,/,+,-) : ");
		char oper = sc.next().charAt(0);

		switch (oper) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/':
			if (num2 == 0) {
				System.out.println("0으로 나눌수 없습니다.");
				System.out.println(num1 + " / " + num2 + " = " + 0);
			} else {
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			}
			break;

		}
	}

	public void totalCalculator() {
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		int i, sum = 0;

		if (num1 < num2) {
			i = num1;
		} else {
			i = num2;
		}
		for (i = i; i < (num1 > num2 ? num1 : num2); i++) {
			sum += i;
		}
		System.out.println(i + "부터" + (num1 > num2 ? num1 : num2) + "까지 정수들의 합계 : " + sum);

	}

	public void profile() {
		int age;
		String name, gender, personality;

		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("성별 : ");
		gender = sc.nextLine();
		sc.nextLine();
		System.out.print("성격 : ");
		personality = sc.nextLine();

		System.out.println(name + " " + age + " " + gender + " " + personality);
	}

	public void sungjuk() {
		String name;
		int grade, classNumber, no;
		double result;
		char score, gender;

		System.out.print("학생아룸 : ");
		name = sc.nextLine();
		System.out.print("학년 : ");
		grade = sc.nextInt();
		System.out.print("반 : ");
		classNumber = sc.nextInt();
		System.out.print("번호 : ");
		no = sc.nextInt();
		System.out.print("성별 (M/F) : ");
		gender = sc.next().charAt(0);
		System.out.print("점수 : ");
		result = sc.nextDouble();

		if (result >= 90) {
			score = 'A';
		} else if (result >= 80) {
			score = 'B';
		} else if (result >= 70) {
			score = 'C';
		} else if (result >= 60) {
			score = 'D';
		} else {
			score = 'F';
		}

		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %1.f이고, %c 학점입니다.", grade, classNumber, no,
				(gender == 'M' ? "남학생" : "여학생"), name, result, score);

	}

	public void printStarNumber() {
		System.out.print("정수를 하나 입력하시오 : ");
		int input = sc.nextInt();

		if (input > 0) {
			for (int i = 1; i <= input; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}

	public void sumRandomNumber() {
		int random = (int) (Math.random() * 100) + 1;
		int sum = 0;
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + random + "의 합계 : " + sum);
	}

	public void continueGugudan() {
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("단수 : " + num);
			for (int i = 1; i < 10; i++) {
				if (i % num == 0)
					continue;
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}

	}

	public void shutNumber() {
		int random1 = (int) (Math.random() * 6) + 1;
		int random2 = (int) (Math.random() * 6) + 1;
		int result = random1 + random2;
		char conti;
		System.out.print("주사위 두개의 합을 맞춰보시오 (2~12) : ");

		do {
			if (sc.nextInt() == result) {
				System.out.println("맞췄습니다.");
				break;
			} else {
				System.out.println("틀렸습니다.");
			}
			System.out.print("계속하시겠습니까?(y/n");
			conti = sc.next().charAt(0);
		} while (conti == 'n' || conti == 'N');

	}
}
