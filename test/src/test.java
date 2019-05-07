import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		javaTest5();
	}

	public static void ex() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String str = sc.nextLine();
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		String answer = "";

		int temp = 0;
		for (int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			// �ҹ��� 97 ~ 122 (a~z) �빮�� 65 ~ 90 A~Z
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
		System.out.println("������ �Է��ϼ��� : ");
		String str = sc.nextLine();
		System.out.println("�󸶳� �а�? ");
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
					System.out.println("���ĺ��� �Է��ϼ���.");
				}
			} else {
				System.out.print((char) (strCh));
			}
		}
	}

	public static void beta() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �� ���� �Է����ּ��� : ");
		String str = sc.nextLine();
		System.out.print("������ �Է����ּ���. : ");
		int num = sc.nextInt();

		if (num > 0) // 0���� ū ���� �Է�
		{
			int gap = num % 26;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if (ch >= 'A' && ch <= 'Z') // �빮���϶�
				{
					if (ch + gap > 90)
						System.out.print((char) (ch - 26 + gap));
					else
						System.out.print((char) (ch + gap));
				}

				else if (ch >= 'a' && ch <= 'z') // �ҹ����϶�
				{
					if (ch + gap > 122)
						System.out.print((char) (ch - 26 + gap));
					else
						System.out.print((char) (ch + gap));
				}

				else if (ch == ' ') // ch�� ���鹮���϶�
				{
					System.out.print(ch);
				}

				else // ����ó��
				{
					System.out.println("...");
					System.out.println("���ĺ��� ���鹮�� ���� �����̹Ƿ� ��ȣȭ ����!");
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
			}
		} else {
			System.out.println("0���� ū ������ �Է� �����մϴ�.");
		}
	}

	public String solution(String s, int n) {
		String answer = "";

		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			temp = s.charAt(i);
			// �ҹ��� 97 ~ 122 (a~z) �빮�� 65 ~ 90 A~Z
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
				answer += (char) temp;
			} else {
				answer += " ";
			}

		}
		return answer;
	}

	public static void javaTest() {
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}
	}

	public static void javaTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����, �ٳ���, ������, Ű��, ��� : ");
		String temp = sc.nextLine();
		String[] str = { "����", "�ٳ���", "������", "Ű��", "���" };

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(temp)) {
				System.out.println(str[i] + "   " + i);
				break;
			}
		}
	}

	public static void javaTest3() {
		char[] arr = new char[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("���� �Է� : ");
			arr[i] = sc.next().charAt(0);
		}
		System.out.println(arr);

		for (int i = 0; i < arr.length; i++) {
			if (i == 1 || i == 4)
				System.out.print(arr[i]);
		}
	}

	public static void javaTest4() {
		int[] intArr = { 1, 2, 3, 4, 5 };
		int[] copyArr = new int[intArr.length];
		for (int i = 0; i < intArr.length; i++) {
			copyArr[i] = intArr[i];
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]+" : ");
			System.out.print(copyArr[i]);
		}
		int[] copy2 = new int[intArr.length];
		System.arraycopy(intArr, 0, copy2, 0, intArr.length);
	}
	
	public static void javaTest5() {
		char[] arr = {'a','p','p','l','e'};
		char[] temp = new char[arr.length];
		
		System.arraycopy(arr, 1, temp, 2, 3);
		
		System.out.println(temp);
	}
}