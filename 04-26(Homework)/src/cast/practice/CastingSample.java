package cast.practice;

import java.util.Scanner;
import java.lang.Integer;

public class CastingSample {
	Scanner sc = new Scanner(System.in);
	// public void printUniCode(){}
	// - 키보드로 문자하나를 입력받아, 그 문자의 유니코드를 출력되게 함
	// - 입력예 :
	// 문자 입력 : A
	// - 출력예 :
	// A is unicode : 95

	public void printUniCode() {
		System.out.print("문자 하나를 입력하시오  : ");
		String word = sc.nextLine();
		int num = (int) word.charAt(0);

		System.out.println(word.charAt(0) + " is Unicode " + num);
	}

	public void calculatorScore() {
		System.out.print("국어 점수를 입력하시오 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 점수를 입력하시오 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 점수를 입력하시오 : ");
		double mat = sc.nextDouble();

		int sum, avg;
		sum = (int) (kor + eng + mat);
		avg = sum / 3;

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

	public void printBitCount() {
		System.out.print("정수 하나를 입력하시오 : ");
		int num = sc.nextInt();

		String bin = Integer.toBinaryString(num);
		System.out.println(num+"의 2진수에 포함된 1의 개수는 "+bin.compareTo("1")+"개 입니다.");

	}
}
