package com.kh.test1;

import com.kh.test.Function;

public class Second {
	// 프로그램이 시작되려면 반드시 main
	// 메소드를 가지고 있는 클래스가 있어야한다.
	// 여기서 말하는 main메소드는
	// public static void main(String[] args)
	public static void main(String[] args) {
		// System.out.println("안녕 두번째야!");
		// System.out.println("안녕 난 두번째 밑이야!");
		// System.out.println("옵치,배그하면서 맥주마시기");
		new Function().printMsg();
	}
}