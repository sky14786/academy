package com.kh.forinfor.controller;

public class DoubleArrController {
	public void basicTest() {
		int[][] arr2 = new int[3][3];
		arr2[0][0] = 10;
		arr2[0][1] = 20;
		arr2[0][2] = 30;
	}

	public void basicTest2() {
		int[][] arr = new int[4][4];

		int value = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++, value--) {
				arr[i][j] = value;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void exampleTest1() {
		String[][] arr = { { "ȫ�浿", "�̼���" }, { "������", "������" }, { "�念��", "�Ӳ���" }, { "�庸��", "���¹�" }, { "������", "������" },
				{ "������", "�̻��" } };
		System.out.println(arr.length + " " + arr[0].length + " " + arr[0][0].length());
		for (int i = 0; i < arr.length; i++) {
			if (i == 0)
				System.out.println("====1�д�====");
			else if (i == 3)
				System.out.println("====2�д�====");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
