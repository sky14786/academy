package com.more.model.vo;

public class Rectangle extends Shape{

	private int point;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int point) {
		super();
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Rectangle [point=" + point + "]";
	}
	
	
	
	
	
	
}
