package emp.model.vo;

import java.util.Scanner;

public class Hyunhee {

	public void test() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�� 1 �Է� : ");
		int x = sc.nextInt();

		// ù��°���� ����

		System.out.print("�� 2 �Է� : ");
		int y = sc.nextInt();

		int sum = 0;

		for (int i = x; i < y ; i++) {

			sum = sum + i;

		}

		System.out.println(sum);
	}

}
