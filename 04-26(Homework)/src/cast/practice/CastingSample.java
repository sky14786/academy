package cast.practice;

import java.util.Scanner;
import java.lang.Integer;

public class CastingSample {
	Scanner sc = new Scanner(System.in);
	// public void printUniCode(){}
	// - Ű����� �����ϳ��� �Է¹޾�, �� ������ �����ڵ带 ��µǰ� ��
	// - �Է¿� :
	// ���� �Է� : A
	// - ��¿� :
	// A is unicode : 95

	public void printUniCode() {
		System.out.print("���� �ϳ��� �Է��Ͻÿ�  : ");
		String word = sc.nextLine();
		int num = (int) word.charAt(0);

		System.out.println(word.charAt(0) + " is Unicode " + num);
	}

	public void calculatorScore() {
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		double kor = sc.nextDouble();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		double eng = sc.nextDouble();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		double mat = sc.nextDouble();

		int sum, avg;
		sum = (int) (kor + eng + mat);
		avg = sum / 3;

		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}

	public void printBitCount() {
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		int num = sc.nextInt();

		String bin = Integer.toBinaryString(num);
		System.out.println(num+"�� 2������ ���Ե� 1�� ������ "+bin.compareTo("1")+"�� �Դϴ�.");

	}
}
