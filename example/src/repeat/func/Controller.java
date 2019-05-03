package repeat.func;

import java.util.Scanner;

public class Controller {
	public void whileExample4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		int i = 1;
		while (i <= num) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

	public void whileExample5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		int i = 1, sum = 0;
		while (i <= num) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public void example1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.print("문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		int sum = 0;
		int temp;
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			if ((temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122)) {
				if (temp == ch) {
					sum++;
				}
			} else {
				answer = "Error";
			}
		}

		if (answer.equals("Error")) {
			System.out.println(answer);
		} else {
			System.out.println("포함된 갯수 : " + sum);
		}

	}

	public void exampleAnswer1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열입력 : ");
		String str = sc.nextLine();
		System.out.print("찾을 문자 :");
		char searhChar = sc.next().charAt(0);
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == searhChar) {
				count++;
			}
		}

		System.out.println("찾은 문자 갯수 : " + count);
	}

	public void example2() {
//		String age, name, address, height, weight,phone;
		String name, address, phone;
		String result = "";
		double ageAvg = 0, heightAvg = 0, weightAvg = 0;
		int age;
		double height, weight;

		Scanner sc = new Scanner(System.in);
		System.out.print("몇명 저장할거냐 ? : ");
		int input = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < input; i++) {
			System.out.print("이름 입력 : ");
			name = sc.nextLine();
			System.out.print("나이 입력 : ");
			age = sc.nextInt();
			ageAvg += age;
			System.out.print("주소 입력 : ");
			address = sc.nextLine();
			sc.nextLine();
			System.out.print("키 입력 : ");
			height = sc.nextDouble();
			heightAvg += height;
			System.out.print("몸무게 입력 : ");
			weight = sc.nextDouble();
			weightAvg += weight;
			System.out.print("연락처 입력 : ");
			sc.nextLine();
			phone = sc.nextLine();

			result += name + " " + age + "세 " + address + " " + height + "cm " + weight + "kg " + phone + "\n";

		}
		System.out.println("======================================");
		System.out.print(result);
		ageAvg /= input;
		weightAvg /= input;
		heightAvg /= input;
		System.out.printf("평균나이 %.1f세 / 평균 키 : %.1fCM / 평균 몸무게 : %.1fKg", ageAvg, heightAvg, weightAvg);

	}

	public void testExample1() {
		Scanner sc = new Scanner(System.in);
		int ran = (int) (Math.random() * 100 + 1);
		int count = 0;
		while (true) {
			System.out.print("정수 한개 입력 : ");
			int input = sc.nextInt();
			count++;
			if (input == ran) {
				System.out.println("정답입니다. " + count + "회 만에 정답을 맞추셨습니다.");
				break;
			} else if (ran < input) {
				System.out.println("난수가 입력하신 정수보다 작습니다.");
			} else {
				System.out.println("난수가 입력하신 정수보다 큽니다.");
			}
		}
	}

	public void testExample2() {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean isTemp = false;
		System.out.print("정수를 입력하세요");
		num = sc.nextInt();

		while (true) {

			if (num > 2) {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						isTemp = false;
						break;
					} else {
						isTemp = true;
					}
				}
				if (isTemp) {
					System.out.println("소수다");
					break;
				} else {
					System.out.println("소수가 아니다.");
					break;
				}
			} else {
				System.out.print("잘못 입력하셨습니다. 다시 입력하세요. : ");
				num = sc.nextInt();
			}
		}
	}

	public static void ex() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.nextLine();
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		String answer = "";

		int temp = 0;
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			// 소문자 97 ~ 122 (a~z) 대문자 65 ~ 90 A~Z
			if (str.charAt(i) != ' ') {
				if (!((temp >= 65 && temp <= 90) || (temp >= 97 && temp <= 122))) {
					answer = "Error";
				} else {
					num %= 26;
					if (temp >= 65 && temp <= 90) {
						temp += num;
						if (temp > 90) {
							temp -= 26;
						}
					} else if (temp >= 97 && temp <= 122) {
						temp += num;
						if (temp > 122) {
							temp -= 26;
						}
					}
					answer += (char) temp;
				}
			} else {
				answer += " ";
			}

		}
		System.out.println(answer);
	}

	public void testExample3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("받으신 금액을 입력하세요 : ");
		int input = sc.nextInt();
		System.out.print("상품 가격을 입력하세요 : ");
		int goods = sc.nextInt();
		int temp = 0;
		int result = input - goods;

		temp = result / 50000;
		result -= (temp * 50000);
		System.out.println("5만원권 : " + temp);

		temp = result / 10000;
		result -= (temp * 10000);
		System.out.println("1만원권 : " + temp);

		temp = result / 5000;
		result -= (temp * 5000);
		System.out.println("오천원 : " + temp);

		temp = result / 1000;
		result -= (temp * 1000);
		System.out.println("천원 : " + temp);

		temp = result / 500;
		result -= (temp * 500);
		System.out.println("오백원 : " + temp);

		temp = result / 100;
		result -= (temp * 100);
		System.out.println("백원 : " + temp);

		temp = result / 50;
		result -= (temp * 50);
		System.out.println("오십원 : " + temp);

		temp = result / 10;
		result -= (temp * 10);
		System.out.println("십원 : " + temp);

	}

	// 소수구하기 강사님
	public void primeNum() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("정수입력 : ");
			int su = sc.nextInt();
			int count = 0;
			if (su > 2) {
				for (int i = 0; i < su; i++) {
					if (su % (i + 1) == 0) {
						count++;
					}
					if (count > 2) {
						System.out.println("소수가 아니다");
					} else {
						System.out.println("소수다.");
					}
				}
			} else {
				System.out.print("잘못입력하셨습니다.");
			}
			sc.nextLine();
			System.out.println("계속 진행하시겠습니까?(Y/N)?");
			String go = sc.nextLine();
			if (go.equals("N")) {
				break;
			}
		}
	}
}
