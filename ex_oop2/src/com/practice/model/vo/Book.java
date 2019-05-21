package com.practice.model.vo;

public class Book {

	private String title;
	private String author;
	private int price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "title=" + title + " author=" + author + " price=" + price;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Book temp=(Book)obj;
		
		if(this.title.equals(temp.getTitle())&&
		this.author.equals(temp.getAuthor())&&
		this.price==temp.getPrice())
			return true;
		else {
			return false;
		}

	}
	@Override
	public Object clone() {
		return new Book(this.title,this.author,this.price);
		
	}
	
	
	
	
	
	//Book b=new Book();
	//Book b1=new Book();
	
	

	
	
	
}

