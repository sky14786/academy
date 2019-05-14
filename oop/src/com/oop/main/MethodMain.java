package com.oop.main;

import com.oop.controller.MethodTest;

public class MethodMain {

	public static void main(String[] args) {
		new MethodTest().calculator(10,20,'+');
		System.out.println(new MethodTest().calculator1(20, 30, '/'));
	}

}
