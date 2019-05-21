package com.practice.controller;

import com.practice.model.vo.Book;

public class BookController {

	public static void main(String[] args)
	{
		Book b=new Book("자바","유병승",2500);
		Book b1=new Book("자바","류별리",10000);
		Book b2=new Book("자바","유병승",2500);
		System.out.println(b.equals(b1));
		System.out.println(b.equals(b2));
		System.out.println(b==b1);
		System.out.println(b==b2);
		
		Book b3=b;
		System.out.println(b+" "+b.hashCode());
		System.out.println(b3+" "+b3.hashCode());
		
	}
	
	
}
