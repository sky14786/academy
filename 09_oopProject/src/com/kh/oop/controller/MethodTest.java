package com.kh.oop.controller;

public class MethodTest {

	//����
	//��ȯ���� ���� �Ű������� �ִ� �żҵ�
	public void calculator(int su,int su1,char op) {
		
		switch(op) {
			case '+' : System.out.println(su+su1);break;
			case '-' : System.out.println(su-su1);break;
			case '*' : System.out.println(su*su1);break;
			case '/' : System.out.println((double)su/su1);break;
			case '%' : System.out.println(su%su1);break;
			default : System.out.println("������ �߸��Է�");break;
		}
	}
	
	//��ȯ���� �ְ� �Ű������� �ִ� �żҵ�
	public double calculator1(int su, int su1, char op) {
		double result=0;
		switch(op) {
			case '+' : result=su+su1;break;
			case '-' : result=su-su1;break;
			case '*' : result=su*su1;break;
			case '/' : result=(double)su/su1;break;
			case '%' : result=su%su1;break;
			default : System.out.println("������ �߸��Է�");break;
		}
		return result;
	}
	
	//���ڿ� �ΰ��� �Է¹޾� ��ģ ��  �������ִ� �żҵ�
	public String combine(String msg, String msg2) {
		return msg+msg2;
	}
	
	public String greeting() {
		return "�ȴ��ϼ���~";
	}
	
	//���ϰ����� ��ü, �迭�� ������~
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






