package com.kh.array.controller;

import java.util.Scanner;

public class ArrayController {
	public void arrayTest() {
		// �迭����!
		// �ڷ���[] ������ ;
		int[] intArr;
		char[] charArr;

		intArr = new int[5];
		System.out.println(intArr[2]);

		System.out.println(intArr);

	}

	public void arrayTest2() {
		char[] ch = { '��', '��', '��', '��', '��', '��' };

		ch[2] = '��';
		System.out.println(ch[2]);
		System.out.println(ch);

	}

	public void arrayExample1() {
		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}

	public void arrayExample2() {
		String[] str = { "����", "�ٳ���", "������", "Ű��", "���" };
		str = new String[5];

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("������")) {
				System.out.println("���� ��ġ :" + i + " ���� �� : " + str[i]);
			}
		}
	}

	public void arrayExample3() {
		char[] ch = new char[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ch.length; i++) {
			System.out.print((i + 1) + "��° �Է� : ");
			ch[i] = sc.next().charAt(0);
			if (i == 0) {
				System.out.println("ù��° : " + ch[i]);
			} else if (i == 3) {
				System.out.println("�׹�° : " + ch[i]);
			}
		}
		System.out.println(ch);
	}

	public void arrayExample4() {
		int[] arr = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("���� " + (i + 1) + " : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("�迭�� ���� " + sum + " �Դϴ�.");
	}

	public void arrayExample5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ� : ");
		String str = sc.nextLine();
		sc.nextLine();
		char[] ch = str.toCharArray();
		ch = new char[ch.length];
		System.out.print("ã���� ���ڸ� �Է��Ͻÿ� : ");
		char search = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == search) {
				count++;
			}
		}
		System.out.println("�Է��Ͻ� ���ڿ� " + ch + "���� ã���ô� ���� " + search + "�� " + count + "�� �Դϴ�.");
	}

	public void arrayExample6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹ� ��ȣ�� �Է��Ͻÿ�(- ����) : ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		char[] chClone = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			if (i > 6) {
				chClone[i] = '*';
			} else {
				chClone[i] = ch[i];
			}
		}
		System.out.println("�ֹι�ȣ : " + chClone);

	}

	public void arrayExample7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ȧ���� ���� ������ �Է��Ͻÿ� : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int temp = arr.length / 2;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i > temp) {
				j--;
				arr[i] = j;
			} else {
				j++;
				arr[i] = j;

			}
			System.out.print(arr[i] + ", ");
		}

	}

	public void arrayExample8() {
		int[] arr = new int[7];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = (int) (Math.random() * 45) + 1;
			if (!arr.equals(temp)) {
				arr[i] = temp;
				System.out.print(arr[i] + " ");
			} else {
				temp = (int) (Math.random() * 45) + 1;
				arr[i] = temp;
				System.out.print(arr[i] + " ");
			}
		}
	}
}