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
		Scanner sc = new Scanner(System.in);

		String name;
		int age;
		double height;

		System.out.print("�̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.print("Ű�� �Է��ϼ��� : ");
		height = sc.nextDouble();

		if (age > 0 && height > 0) {
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + age);
			System.out.println("Ű : " + height);
			System.out.println(name + "�� ���̴� " + age + "���̰�, Ű��" + height + " �̴�.");
		}
	}

	public void test6() {
		Scanner sc = new Scanner(System.in);
		int num, num2;
		System.out.print("���� 1 �Է� : ");
		num = sc.nextInt();
		System.out.print("���� 2 �Է� : ");
		num2 = sc.nextInt();

		if (num > 0 && num2 > 0) {
			System.out.println(num + " + " + num2 + " = " + (num + num2));
			System.out.println(num + " - " + num2 + " = " + (num - num2));
			System.out.println(num + " * " + num2 + " = " + (num * num2));
			System.out.println(num + " / " + num2 + " = " + (num / num2));
			System.out.println(num + " % " + num2 + " = " + (num % num2));
		}
	}

	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int score = sc.nextInt();
		char result=' ';
		if(score>0) {
			if(score>=90) {
				result='A';
			}else if(score>=80) {
				result='B';
			}else if(score>=70) {
				result='C';
			}else if(score>=60) {
				result='D';
			}else {
				result='F';
			}
		}else {
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}
		System.out.println("������ : "+score+" ������ : "+result);
	}
}
