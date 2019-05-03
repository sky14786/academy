package test.array.premitive;

import java.util.Scanner;

public class ArraySample {
	public void test1() {
		int[] arr = new int[10];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
	}

	public void test2() {
		int[] arr = new int[10];
		int min = 0, max = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
	}

	public void test3() {
		byte[] arr = new byte[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (byte) ((byte) (Math.random() * 127) + 1);
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}

		}
		System.out.println("합계 : " + sum);

	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str =sc.nextLine();
		
	}

}
