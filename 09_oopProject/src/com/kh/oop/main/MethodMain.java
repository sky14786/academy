package com.kh.oop.main;

import com.kh.oop.controller.MethodTest;

public class MethodMain {

	public static void main(String[] args) {
		new MethodTest().calculator(10,20,'+');
		System.out.println(new MethodTest().calculator1(20, 30, '/'));
		String msg=new MethodTest().greeting();
		msg+=new MethodTest().combine("������ ","������");
		msg+=" ǻ����~! �巡�ﺼ!!! �̾�!!";
		System.out.println(msg);
		
		//�迭�� �������� �ޱ�
		int[] copy=new MethodTest().arrayReturn();
		System.out.println("Main");
		for(int i : copy) {
			System.out.println(i);
		}
		
		copy=new int[5];
		for(int i : copy) {
			System.out.println(i);
		}
		new MethodTest().inputArr(copy);
		
		for(int i : copy) {
			System.out.println(i);
		}
		
		int a=10;
		int b=20;
		new MethodTest().intUpdate(a,b);
		System.out.println(a+" : "+b);
		
		
	}

}







