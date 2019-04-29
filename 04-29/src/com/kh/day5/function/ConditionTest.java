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

		// if (gender == '남') {
		// System.out.println("남자는 오른쪽으로 가시오");
		// } else if (gender == '여') {
		// System.out.println("여자는 왼쪽으로 가시오");
		// } else {
		// System.out.println("성별을 잘못 입력하셨습니다.");
		// }
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
		if (avg >= 90 && avg <= 100) {
			System.out.println("A입니다.");
		}
		if (avg >= 80 && avg < 90) {
			System.out.println("B입니다.");
		}
		if (avg >= 70 && avg < 80) {
			System.out.println("C입니다");
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

	public void teacherSample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		int sum = kor + eng + math;
		double avg = sum / 3.0;

		if (sum > 250) {
			System.out.println("우수생입니다.");
		}
		if (avg >= 90) {
			System.out.println("A");
		}
		if (avg < 90 && avg >= 80) {
			System.out.println("B");
		}
		if (avg < 80 && avg >= 70) {
			System.out.println("C");
		}
	}

	public void ifElseTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 나이는 : ");
		int age = sc.nextInt();

		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
	}

	public void ifElseSample() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;

		System.out.print("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();

		sum = kor + mat + eng;
		avg = sum / 3;

		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void ifElseSample2() {
		Scanner sc = new Scanner(System.in);
		String name;
		char gender;
		int classNumber, grade, no;
		double result;

		System.out.print("이름을 입력하시오 : ");
		name = sc.nextLine();
		System.out.print("학년을 입력하시오 : ");
		grade = sc.nextInt();
		System.out.print("반을 입력하시오 : ");
		classNumber = sc.nextInt();
		System.out.print("번호를 입력하시오 : ");
		no = sc.nextInt();
		System.out.print("성별을 입력하시오 ex. M,F : ");
		sc.nextLine();
		if (sc.nextLine().charAt(0) == 'M') {
			gender = '남';
		} else {
			gender = '여';
		}
		System.out.print("성적을 입려가시오 : ");
		result = sc.nextDouble();

		System.out.printf("%d학년 %d반 %d번 %c학생 %s은 성적이 %.2f이다.", grade, classNumber, no, gender, name, result);
	}

	public void iElseIfTest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		if (age > 19) {
			System.out.println("당신은 성인이네요 한잔?!");
		} else if (age > 17) {
			System.out.println("당신은 고등학생!");
		} else if (age > 14) {
			System.out.println("당신은 중학생!");
		}
	}

	public void calTest() {
		Scanner sc = new Scanner(System.in);
		int num, num2;
		char oper;

		System.out.print("정수1 입력 : ");
		num = sc.nextInt();
		System.out.print("정수2 입력 : ");
		num2 = sc.nextInt();
		System.out.print("기호입력 [+,-,/,*] : ");
		oper = sc.next().charAt(0);

		if ((num < 0 || num2 < 0) || (oper != '+' && oper != '-' && oper != '*' && oper != '/')) {
			System.out.println("정수를 잘못입력하셨습니다.");
		} else {
			if (oper == '+') {
				System.out.println(num + "+" + num2 + "=" + (num + num2));
			} else if (oper == '-') {
				System.out.println(num + "-" + num2 + "=" + (num - num2));
			} else if (oper == '*') {
				System.out.println(num + "*" + num2 + "=" + (num * num2));
			} else if (oper == '/') {
				System.out.println(num + "/" + num2 + "=" + (double) ((num / num2)));
			}
		}

//		if (num < 0 || num2 < 0) {
//			System.out.println("숫자잘못입력");
//		} else if (oper != '+' && oper != '-' && oper != '*' && oper != '/') {
//			System.out.println("부호잘못입력");
//		}

	}

	public void ifSample() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오 : ");
		int num = sc.nextInt();
		if (num <= 10 && num >= 1) {
			if (num % 2 == 0) {
				System.out.println("짝수입니다");
			} else {
				System.out.println("홀수입니다.");
			}
		}

	}

	public void ifSample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하시오 : ");
		double height = sc.nextDouble() * 0.01;
		System.out.print("몸무게를 입력하시오 : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);

		String str = "";

		if (bmi >= 30) {
			str = "비만입니다";
		} else {
			if (bmi >= 25) {
				str = "과체중입니다";
			} else {
				if (bmi >= 20) {
					str = "정상체중입니다.";
				} else {
					if (bmi <= 15) {
						str = "저체중입니다.";
					}
				}
			}
		}

		System.out.println(str);
	}

}
