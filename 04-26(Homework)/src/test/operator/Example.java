package test.operator;

import java.util.Scanner;

public class Example {

	// 3-1
	public void sample() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;

		System.out.print("국어 점수를 입력하시오 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하시오 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하시오 : ");
		mat = sc.nextInt();

		// 총점은 국어, 영어, 수학 점수를 모두 합한 것이므로 총점 = 국어 + 수학 + 영어
		// 평균은 총점을 과목의 개수로 나눈것이므로 평균 = 총점/과목의 개수
		sum = kor + eng + mat;
		avg = sum / 3;

		// 삼항연산자와 논리연산자 &&(그리고, and)를 사용함으로 각각 점수가 40점 이상이면서
		// 평균이 60점 이상인 조건식을 세워 합격 불합격 판단여부를 검사한다.
		System.out.println(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60 ? "합격입니다." : "불합격입니다.");

	}

	// 3-2
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		String name;
		char gender;
		int grade, classNumber, no;
		double result;

		System.out.print("이름을 입력하시오 : ");
		name = sc.nextLine();
		System.out.print("학년을 입력하시오 : ");
		grade = sc.nextInt();
		System.out.print("반을 입력하시오 : ");
		classNumber = sc.nextInt();
		System.out.print("번호를 입력하시오 : ");
		no = sc.nextInt();
		System.out.print("성별을 입력하시오 (ex. M, F) : ");
		sc.nextLine();
		gender = sc.nextLine().charAt(0);
		System.out.print("성적을 입력하시오 (ex.95.55) : ");
		result = sc.nextDouble();

		System.out.printf("%d학년 %d반 %d번 " + (gender == 'M' ? "남학생" : "여학생") + " %s은 성적이 %.2f이다", grade, classNumber, no,
				name, result);

	}

	// 3-3
	public void sample3() {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("정수를 입력하시오 : ");
		num = sc.nextInt();

		System.out.println(num >= 0 ? "양수다" : "양수가 아니다");

	}

	// 3-4
	public void sample4() {
		Scanner sc = new Scanner(System.in);
		int num;
		String str;

		System.out.print("정수를 입럭하시오 : ");
		num = sc.nextInt();

		str = num % 2 == 0 ? "짝수다" : "홀수다";

		System.out.println(str);
	}
}
