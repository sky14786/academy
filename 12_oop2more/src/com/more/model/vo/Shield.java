package com.more.model.vo;

public class Shield extends Item{

	private String name;
	private int depence;
	
	public Shield() {
		// TODO Auto-generated constructor stub
	}
	
	public Shield(String name, int depence) {
		super();
		this.name = name;
		this.depence = depence;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepence() {
		return depence;
	}

	public void setDepence(int depence) {
		this.depence = depence;
	}

	@Override
	public String toString() {
		return "Shield [name=" + name + ", depence=" + depence + "]";
	}
	
	
}
