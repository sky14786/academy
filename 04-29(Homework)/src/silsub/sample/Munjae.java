package silsub.sample;

import java.util.Scanner;

public class Munjae {
	public void example1() {
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

		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("합격입니다.");
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + mat);
			System.out.println("합계 점수는 : " + sum + "점수 평균은 : " + avg);
		} else {
			System.out.println("불합격입니다.");
		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** 초기 메뉴 ***");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호 입력 : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("입력메뉴가 선택되엇습니다");
			break;
		case 2:
			System.out.println("수정메뉴가 선택되었습니다.");
			break;
		case 3:
			System.out.println("조회메뉴가 선택되었습니다.");
			break;
		case 4:
			System.out.println("삭제메뉴가 선택되었습니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다.\n다시 입력하십시오.");
			break;

		}
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나를 입력하시오 : ");
		int num = sc.nextInt();
		if (num >= 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수가 아니다");
		}
	}

	public void test4() {
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하시오 : ");
		num = sc.nextInt();
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		}
	}

	public void inputTest() {
		Scanner sc = new Scanner(System.in);

		String name;
		int age;
		double height;

		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("키를 입력하세요 : ");
		height = sc.nextDouble();

		if (age > 0 && height > 0) {
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("키 : " + height);
			System.out.println(name + "의 나이는 " + age + "세이고, 키는" + height + " 이다.");
		}
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		int num, num2;
		System.out.print("정수 1 입력 : ");
		num = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		num2 = sc.nextInt();

		if (num > 0 && num2 > 0) {
			System.out.println(num + " + " + num2 + " = " + (num + num2));
			System.out.println(num + " - " + num2 + " = " + (num - num2));
			System.out.println(num + " * " + num2 + " = " + (num * num2));
			System.out.println(num + " / " + num2 + " = " + (num / num2));
			System.out.println(num + " % " + num2 + " = " + (num % num2));
		}
	}

	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int score = sc.nextInt();
		char result=' ';
		if(score>0) {
			if(score>=90) {
				result='A';
			}else if(score>=80) {
				result='B';
			}else if(score>=70) {
				result='C';
			}else if(score>=60) {
				result='D';
			}else {
				result='F';
			}
		}else {
			System.out.println("점수를 잘못 입력하셨습니다.");
		}
		System.out.println("점수는 : "+score+" 학점은 : "+result);
	}
}
