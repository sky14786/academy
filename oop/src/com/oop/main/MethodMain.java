package com.oop.main;

import com.oop.controller.MethodTest;

public class MethodMain {

	public static void main(String[] args) {
		new MethodTest().calculator(10, 20, '+');
		System.out.println(new MethodTest().calculator1(20, 30, '/'));
		int[] copy = new MethodTest().arrayReutrn();
		for (int i : copy) {
			System.out.println(i);
		}

		copy = new int[5];
		for (int i : copy) {
			System.out.println(i);
		}
		new MethodTest().intputArr(copy);
		for (int i : copy) {
			System.out.println(i);
		}
	}

}
