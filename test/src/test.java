import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		ex();
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

	public static void prac01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println("얼마나 밀거? ");
		int plus = sc.nextInt();
		int nmg = plus % 26;
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			int strCh = str.charAt(i);
			if ((char) strCh != ' ') {
				if ((strCh >= 65 && strCh <= 90) || (strCh >= 97 && strCh <= 122)) {
					result = str.charAt(i) + nmg;
					if ((result >= 65 && result <= 90) || (result >= 97 && result <= 122)) {
						System.out.print((char) (result));
					} else {
						result = result - 26;
						System.out.println((char) (result));
					}
				} else {
					System.out.println("알파벳만 입력하세요.");
				}
			} else {
				System.out.print((char) (strCh));
			}
		}
	}

	public static void beta() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 한 개를 입력해주세요 : ");
		String str = sc.nextLine();
		System.out.print("정수를 입력해주세요. : ");
		int num = sc.nextInt();

		if (num > 0) // 0보다 큰 정수 입력
		{
			int gap = num % 26;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch >= 'A' && ch <= 'Z') // 대문자일때
				{
					if (ch + gap > 90)
						System.out.print((char) (ch - 26 + gap));
					else
						System.out.print((char) (ch + gap));
				}

				else if (ch >= 'a' && ch <= 'z') // 소문자일때
				{
					if (ch + gap > 122)
						System.out.print((char) (ch - 26 + gap));
					else
						System.out.print((char) (ch + gap));
				}

				else if (ch == ' ') // ch가 공백문자일때
				{
					System.out.print(ch);
				}

				else // 예외처리
				{
					System.out.println("...");
					System.out.println("알파벳과 공백문자 외의 문자이므로 암호화 실패!");
					System.out.println("프로그램을 종료합니다.");
					return;
				}
			}
		} else {
			System.out.println("0보다 큰 정수만 입력 가능합니다.");
		}
	}
	
	public String solution(String s, int n) {
	      String answer = "";

			int temp = 0;
			for (int i = 0; i < s.length(); i++) {
				temp = s.charAt(i);
				// 소문자 97 ~ 122 (a~z) 대문자 65 ~ 90 A~Z
				if (s.charAt(i) != ' ') {
					n %= 26;
					if (temp >= 65 && temp <= 90) {
						temp += n;
						if (temp > 90) {
							temp -= 26;
						}
					} else if (temp >= 97 && temp <= 122) {
						temp += n;
						if (temp > 122) {
							temp -= 26;
						}
					}
					answer += (char)temp;
				} else {
					answer +=" ";
				}

			}
	      return answer;
	  }
	
	public void javaTest() {
		
	}
	
	
	
	
}