package kh.vari.function;

import java.util.Scanner;

public class VariExample {
	public Scanner sc = new Scanner(System.in);

	public void example() {

		System.out.print("����1���� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("����2���� �Է��Ͻÿ� : ");
		int b = sc.nextInt();

		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));

	}

	public void example2() {
		System.out.print("�ѷ��� ������  ���� �簢���� ���ΰ��� �Է� : ");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.print("�ѷ��� ������ ���� �簢���� ���ΰ��� �Է� : ");
		double b = sc.nextDouble();

		System.out.println("�簢���� �ѷ� : " + ((a + b) * 2));
		System.out.println("�簢���� ���� : " + (a * b));
	}

	public void example3() {
		System.out.print("�ܾ �Է��Ͻÿ� : ");
		String word = sc.nextLine();

		for (int i = 0; i < word.length(); i++) {
			System.out.println((i+1)+"��° ���� : "+word.charAt(i));
		}

	}
}
