package test.operator;

import java.util.Scanner;

public class Example {

	// 3-1
	public void sample() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;

		System.out.print("���� ������ �Է��Ͻÿ� : ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		mat = sc.nextInt();

		// ������ ����, ����, ���� ������ ��� ���� ���̹Ƿ� ���� = ���� + ���� + ����
		// ����� ������ ������ ������ �������̹Ƿ� ��� = ����/������ ����
		sum = kor + eng + mat;
		avg = sum / 3;

		// ���׿����ڿ� �������� &&(�׸���, and)�� ��������� ���� ������ 40�� �̻��̸鼭
		// ����� 60�� �̻��� ���ǽ��� ���� �հ� ���հ� �Ǵܿ��θ� �˻��Ѵ�.
		System.out.println(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60 ? "�հ��Դϴ�." : "���հ��Դϴ�.");

	}

	// 3-2
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		String name;
		char gender;
		int grade, classNumber, no;
		double result;

		System.out.print("�̸��� �Է��Ͻÿ� : ");
		name = sc.nextLine();
		System.out.print("�г��� �Է��Ͻÿ� : ");
		grade = sc.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		classNumber = sc.nextInt();
		System.out.print("��ȣ�� �Է��Ͻÿ� : ");
		no = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ� (ex. M, F) : ");
		sc.nextLine();
		gender = sc.nextLine().charAt(0);
		System.out.print("������ �Է��Ͻÿ� (ex.95.55) : ");
		result = sc.nextDouble();

		System.out.printf("%d�г� %d�� %d�� " + (gender == 'M' ? "���л�" : "���л�") + " %s�� ������ %.2f�̴�", grade, classNumber, no,
				name, result);

	}

	// 3-3
	public void sample3() {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("������ �Է��Ͻÿ� : ");
		num = sc.nextInt();

		System.out.println(num >= 0 ? "�����" : "����� �ƴϴ�");

	}

	// 3-4
	public void sample4() {
		Scanner sc = new Scanner(System.in);
		int num;
		String str;

		System.out.print("������ �Է��Ͻÿ� : ");
		num = sc.nextInt();

		str = num % 2 == 0 ? "¦����" : "Ȧ����";

		System.out.println(str);
	}
}
