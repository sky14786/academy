package kh.operator.function;

import java.util.Scanner;

public class Example {
	Scanner sc = new Scanner(System.in);

	public void opSample1() {
		int kor, eng, mat, sum = 0;
		double avg = 0;

		System.out.print("���� ������ �Է��Ͻÿ� :");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� :");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ� :");
		mat = sc.nextInt();

		sum = kor + eng + mat;
		avg = sum / 3;

		System.out.println("���� ������ : " + kor + "\n���� ������ : " + eng + "\n���� ������ : " + mat);
		System.out.println(kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60 ? "�հ��Դϴ�." : "���հ��Դϴ�.");

	}

	public void opSample2() {
		String name, ban, no, grade, gender;
		double sung;

		System.out.print("�̸��� �Է��Ͻÿ� : ");
		name = sc.nextLine();
		System.out.print("�г��� �Է��Ͻÿ� : ");
		grade = sc.nextLine();
		System.out.print("���� �Է��Ͻÿ� : ");
		ban = sc.nextLine();
		System.out.print("��ȣ�� �Է��Ͻÿ� : ");
		no = sc.nextLine();
		System.out.print("������ �Է��Ͻÿ� (���� M , ���� F) : ");
		gender = sc.nextLine();
		System.out.print("������ �Է��Ͻÿ� (�Ǽ�) : ");
		sung = sc.nextDouble();
		
		gender = gender.charAt(0)=='M'?"���л�":"���л�";
		
//		System.out.println(grade+"�г� "+ban+"�� "+no+"�� "+gender+" "+name +"��"+"������ "+sung+"�̴�");
		System.out.printf("%s�г� %s�� %s�� %s %s�� ������ %.2f�̴�.", grade,ban,no,gender,name,sung);

	}
	
	public void opSample3() {
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		System.out.println(sc.nextInt()<0?"����� �ƴϴ�":"�����");
	}
	
	public void opSample4() {
		System.out.print("���� �ϳ��� �Է��Ͻÿ� : ");
		System.out.println(sc.nextInt()%2==0?"¦���̴�":"Ȧ���̴�");
	}
}
