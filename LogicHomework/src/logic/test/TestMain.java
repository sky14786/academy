package logic.test;

import java.util.Scanner;

import day7.controller.Function;

public class TestMain {
	static Function function = new Function();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int input;

		do {
			System.out.println("*** ��������/������/��� ���� ���α׷�***");
			System.out.println();
			System.out.println("1. ���� ����");
			System.out.println("2. ���������� ū������ �հ豸�ϱ�");
			System.out.println("3. �Ż����� Ȯ���ϱ�");
			System.out.println("4. �л����� Ȯ���ϱ�");
			System.out.println("5. ���� ���� ����ϱ�");
			System.out.println("6. ���������� �հ� ���ϱ�");
			System.out.println("7. ������ ");
			System.out.println("8. �ֻ��� ���� �˾Ƹ��߱� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ �Է� :");
			input = sc.nextInt();

			switch (input) {
			case 1:
				function.calculator();
				break;
			case 2:
				function.totalCalculator();
				break;

			case 3:
				function.profile();
				break;
			case 4:
				function.sungjuk();
				break;
			case 5:
				function.printStarNumber();
				break;
			case 6:
				function.sumRandomNumber();
				break;
			case 7:
				function.continueGugudan();
				break;
			case 8:
				function.shutNumber();
				break;
			case 9:
				break;
			}
		} while (input != 9);
	}

}
