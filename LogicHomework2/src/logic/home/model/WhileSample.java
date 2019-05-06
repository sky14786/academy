package logic.home.model;

import java.util.Scanner;

public class WhileSample {
	Scanner sc = new Scanner(System.in);

	public void printUniCode() {
		char input = ' ';
		while (input != '0') {
			System.out.print("문자 입력 : ");
			input = sc.next().charAt(0);
			System.out.println("유니코드 : " + (int) input);
		}
	}

	public void sum1To100() {
		int sum = 0, i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1~100 사이의 합 : " + sum);
	}

	public void numberGame() {
		int ran = (int) Math.random() * 100 + 1;
		int input = 0;
		while (true) {
			System.out.print("1~100 정수 입력 : ");
			input = sc.nextInt();
			if (input == ran) {
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("오답입니다.");
			}
		}
	}

	public void countCharacter() {
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		int i = 0, count = 0;
		while (i < input.length()) {
			count++;
			i++;
		}
		System.out.println("글자 개수 : " + count);
	}

	public void countInChar() {
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		sc.nextLine();
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		int i = 0, count = 0;
		while (i < str.length()) {
			if (ch == str.charAt(i)) {
				count++;
			}
			i++;
		}
		System.out.println("입력한 문자와 같은 개수 : " + count);
	}
}
