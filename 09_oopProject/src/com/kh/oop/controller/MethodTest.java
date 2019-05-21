package com.kh.oop.controller;

public class MethodTest {

	//계산기
	//반환형이 없고 매개변수가 있는 매소드
	public void calculator(int su,int su1,char op) {
		
		switch(op) {
			case '+' : System.out.println(su+su1);break;
			case '-' : System.out.println(su-su1);break;
			case '*' : System.out.println(su*su1);break;
			case '/' : System.out.println((double)su/su1);break;
			case '%' : System.out.println(su%su1);break;
			default : System.out.println("연산자 잘못입력");break;
		}
	}
	
	//반환형이 있고 매개변수가 있는 매소드
	public double calculator1(int su, int su1, char op) {
		double result=0;
		switch(op) {
			case '+' : result=su+su1;break;
			case '-' : result=su-su1;break;
			case '*' : result=su*su1;break;
			case '/' : result=(double)su/su1;break;
			case '%' : result=su%su1;break;
			default : System.out.println("연산자 잘못입력");break;
		}
		return result;
	}
	
	//문자열 두개를 입력받아 합친 후  리턴해주는 매소드
	public String combine(String msg, String msg2) {
		return msg+msg2;
	}
	
	public String greeting() {
		return "안뇽하세요~";
	}
	
	//리턴값으로 객체, 배열을 보낼때~
	public int[] arrayReturn() {
		int[] arrInt=new int[5];
		for(int i=0;i<arrInt.length;i++) {
			arrInt[i]=i*10;
		}
		return arrInt;
	}
	
	public void inputArr(int[] copy) {
		for(int i=0;i<copy.length;i++) {
			copy[i]=i*20;
		}
	}
	public void intUpdate(int a, int b) {
		a=40;
		b=50;
	}
	
}






