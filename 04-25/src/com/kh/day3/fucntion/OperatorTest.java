package com.kh.day3.fucntion;

public class OperatorTest {
	public void selfAdd() {
		int num = 10;
//		System.out.println(num++);
		num++;
		++num;
		++num;
		num++; // 14
		int num2 = ++num+20; // 15 +20 
		int num3 = num+++20; // 15(16)+20
		
		//논리부정연산
		boolean flag = true;
		System.out.println(!flag);
		
		
	}
}
