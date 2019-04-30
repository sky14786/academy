package emp.model.vo;

import java.util.Scanner;

public class Hyunhee {

	public void test() {

		Scanner sc = new Scanner(System.in);

		System.out.print("수 1 입력 : ");
		int x = sc.nextInt();

		// 첫번째수가 작음

		System.out.print("수 2 입력 : ");
		int y = sc.nextInt();

		int sum = 0;

		for (int i = x; i < y ; i++) {

			sum = sum + i;

		}

		System.out.println(sum);
	}

}
