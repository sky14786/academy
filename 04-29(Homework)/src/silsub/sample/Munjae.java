package silsub.sample;

import java.util.Scanner;

public class Munjae {
	public void example1() {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, sum;
		double avg;

		System.out.print("���� ������ �Է��Ͻÿ� : ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� : ");
		mat = sc.nextInt();

		sum = kor + eng + mat;
		avg = sum / 3;

		if (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) {
			System.out.println("�հ��Դϴ�.");
			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + mat);
			System.out.println("�հ� ������ : " + sum + "���� ����� : " + avg);
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** �ʱ� �޴� ***");
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ �Է� : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("�Է¸޴��� ���õǾ����ϴ�");
			break;
		case 2:
			System.out.println("�����޴��� ���õǾ����ϴ�.");
			break;
		case 3:
			System.out.println("��ȸ�޴��� ���õǾ����ϴ�.");
			break;
		case 4:
			System.out.println("�����޴��� ���õǾ����ϴ�.");
			break;
		case 7:
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
		default:
			System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�.\n�ٽ� �Է��Ͻʽÿ�.");
			break;

		}
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		if (num >= 0) {
			System.out.println("�����");
		} else {
			System.out.println("����� �ƴϴ�");
		}
	}

	public void test4() {
		int num;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��Ͻÿ� : ");
		num = sc.nextInt();
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("¦����");
			} else {
				System.out.println("Ȧ����");
			}
		}
	}
	
	public void inputTest() {
		
	}
}
