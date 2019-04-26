package kh.operator.function;

import java.util.Scanner;

public class Example {
	Scanner sc = new Scanner(System.in);

	public void opSample1() {
		int kor, eng, mat, sum = 0;
		double avg = 0;

		System.out.print("국어 점수를 입력하시오 :");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하시오 :");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하시오 :");
		mat = sc.nextInt();

		sum = kor + eng + mat;
		avg = sum / 3;

		System.out.println("국어 점수는 : " + kor + "\n영어 점수는 : " + eng + "\n수학 점수는 : " + mat);
		System.out.println(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60 ? "합격입니다." : "불합격입니다.");

	}

	public void opSample2() {
		String name, ban, no, grade, gender;
		double sung;

		System.out.print("이름을 입력하시오 : ");
		name = sc.nextLine();
		System.out.print("학년을 입력하시오 : ");
		grade = sc.nextLine();
		System.out.print("반을 입력하시오 : ");
		ban = sc.nextLine();
		System.out.print("번호를 입력하시오 : ");
		no = sc.nextLine();
		System.out.print("성별을 입력하시오 (남자 M , 여자 F) : ");
		gender = sc.nextLine();
		System.out.print("성적을 입력하시오 (실수) : ");
		sung = sc.nextDouble();
		
		gender = gender.charAt(0)=='M'?"남학생":"여학생";
		
//		System.out.println(grade+"학년 "+ban+"반 "+no+"번 "+gender+" "+name +"은"+"성적이 "+sung+"이다");
		System.out.printf("%s학년 %s반 %s번 %s %s은 성적이 %.2f이다.", grade,ban,no,gender,name,sung);

	}
	
	public void opSample3() {
		System.out.print("정수 하나를 입력하시오 : ");
		System.out.println(sc.nextInt()<0?"양수가 아니다":"양수다");
	}
	
	public void opSample4() {
		System.out.print("정수 하나를 입력하시오 : ");
		System.out.println(sc.nextInt()%2==0?"짝수이다":"홀수이다");
	}
}
