package com.kh.controller;

import java.util.Scanner;

public class SwitchController {
	public void switchTest() {
		Scanner sc = new Scanner(System.in);

		System.out.println("===당신의 취미는===");
		System.out.print("취미를 고르세요(1.코딩,2.독서,3.게임,4.유튜브) : ");
//		int choice = sc.nextInt();
//		char choice  = sc.next().charAt(0);
		String choice = sc.nextLine();

//		switch (choice) {
//		case 1: System.out.println("거짓말!");
//			break;
//		case 2: System.out.println("인기서적 순위....");
//			break;
//		case 3:System.out.println("인기게임 순위....");
//			break;
//		case 4:System.out.println("인기동영상....");
//			break;
//		default:System.out.println("잘못입력하셨습니다.");
//			break;

//		switch (choice) {
//		case '가': System.out.println("거짓말!");
//			break;
//		case '나': System.out.println("인기서적 순위....");
//			break;
//		case '다':System.out.println("인기게임 순위....");
//			break;
//		case '라':System.out.println("인기동영상....");
//			break;
//		default:System.out.println("잘못입력하셨습니다.");
//			break;
//		}

		switch (choice) {
		case "코딩":
			System.out.println("거짓말!");
			break;
		case "독서":
			System.out.println("인기서적 순위....");
			break;
		case "게임":
			System.out.println("인기게임 순위....");
			break;
		case "유튜브":
			System.out.println("인기동영상....");
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		}
	}

	public void switchExample1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("과일이름 [사과,바나나,복숭아,키위] 를 입력하시오 : ");
		String input = sc.nextLine();

		switch (input) {
		case "사과":
			System.out.println("사과의 가격은 1000원 입니다.");
			break;
		case "바나나":
			System.out.println("바나나의 가격은 3000원 입니다.");
			break;
		case "복숭아":
			System.out.println("복숭아의 가격은 2000원 입니다.");
			break;
		case "키위":
			System.out.println("키위의 가격은 5000원 입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");

		}
	}

	public void switchExample2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("********초기 메뉴********");
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("7.종료");

		System.out.print("메뉴 번호 입력 : ");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			System.out.println("입력메뉴선택");
			break;
		case 2:
			System.out.println("수정메뉴선택");
			break;
		case 3:
			System.out.println("조회메뉴선택");
			break;
		case 7:
			System.out.println("프로그램을 종료합니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다. 프로그램을 종료합니다.");
			break;

		}
	}

	public void switchExample3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("********메  뉴********");
		System.out.println("떡볶이 --------1000");
		System.out.println("김밥 ----------2000");
		System.out.println("오뎅 ----------1000");
		System.out.println("순대 ----------2000");
		System.out.println("튀김 ----------3000");
		System.out.println("떡튀순 --------8000");

		System.out.print("메뉴번호 입력 : ");
		String input = sc.nextLine();

		switch (input) {
		case "떡볶이":
			System.out.println("떡볶이는 1000원입니다.");
			break;
		case "김밥":
			System.out.println("김밥은 2000원입니다.");
			break;
		case "오뎅":
			System.out.println("오뎅은 1000원입니다.");
			break;
		case "순대":
			System.out.println("순대는 2000원입니다.");
			break;
		case "튀김":
			System.out.println("튀김은 3000원입니다.");
			break;
		case "떡튀순":
			System.out.println("떡튀순은 8000원입니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다.");
			break;

		}
	}

	public void switchExample4() {
		System.out.println("********메  뉴********");
		System.out.println("a. 햄버거 --------3000");
		System.out.println("b. 감자튀김 ------2000");
		System.out.println("c. 치킨 ----------5000");
		System.out.println("d. 사이다 --------1000");
		System.out.println("e. 콜라 ----------1000");

		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴번호 입력 : ");
		char input = sc.next().charAt(0);

		switch (input) {
		case 'a':
			System.out.println("햄버거는 3000원입니다.");
			break;
		case 'b':
			System.out.println("감자튀김은 2000원입니다.");
			break;
		case 'c':
			System.out.println("치킨은 5000원입니다.");
			break;
		case 'd':
			System.out.println("사이다는 1000원입니다.");
			break;
		case 'e':
			System.out.println("콜라는 1000원입니다.");
			break;
		default:
			System.out.println("번호가 잘못 입력되었습니다.");

		}
	}

	public void switchExample5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세요 : ");
		int input = sc.nextInt();

		switch (input / 10) {
		case 10:
			System.out.println("A입니다.");
			break;
		case 9:
			System.out.println("A입니다.");
			break;
		case 8:
			System.out.println("B입니다.");
			break;
		case 7:
			System.out.println("C입니다.");
			break;
		case 6:
			System.out.println("D입니다.");
			break;
		default:
			System.out.println("F");

		}
	}

	public void switchExample6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수를 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력 : ");
		int mat = sc.nextInt();

		int sum = kor + eng + mat;
		double avg = sum / 3;

		
		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("합격입니다.");
		}else{
			if(kor<=40) {
				System.out.println("국어 과목의 점수 미달로 불합격 입니다.");
			}else if(eng<=40) {
				System.out.println("영어 과목의 점수 미달로 불합격 입니다.");
			}else if(mat<=40) {
				System.out.println("수학 과목의 점수 미달로 불합격 입니다.");
			}else {
				System.out.println("평균 점수의 미달로 불합격 입니다.");
			}
		}

	}

	public void switchExample7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("월 급여 입력 : ");
		int money = sc.nextInt();
		System.out.print("월 매출 입력 : ");
		int money2 = sc.nextInt();
		System.out.println("======================");
		System.out.println("매출액 : " + money2);
		double bonus = 0;
		if (money2 >= 5000) {
			System.out.println("보너스율 : " + 0.05);
			bonus = money2 * 0.05;
			System.out.println("보너스 금액 : " + bonus);
		} else if (money2 >= 3000) {
			System.out.println("보너스율 : " + 0.03);
			bonus = money2 * 0.03;
			System.out.println("보너스 금액 : " + bonus);
		} else if (money2 >= 1000) {
			System.out.println("보너스율 : " + 0.01);
			bonus = money2 * 0.01;
			System.out.println("보너스 금액 : " + bonus);
		}
		System.out.println("=================");
		System.out.println("총 급여 : " + (money + bonus));

	}
}
