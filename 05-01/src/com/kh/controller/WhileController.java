package com.kh.controller;

import java.util.Scanner;

public class WhileController {
	public void whileStudy() {
		int i = 0;
		while (i < 10) {
			System.out.print(i+" ");
			i++;
		}
	}
	public void whileExample1() {
		int i=1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}
	}
	
	public void whileExample2() {
		int i=100;
		while(i>=100) {
			System.out.println(i);
			i--;
		}
	}
	public void whileExample3() {
		int i=1;
		while(i<=100) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
	}
	public void whileExample4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		int i =1;
		while(i<=num) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
	}
	public void whileExample5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		int i=1,sum=0;
		while(i<=num) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
}
