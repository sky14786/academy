package com.kh.model.vo;

public class Shield extends Item {
	private String name;
	private int depence;

	public Shield() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shield [name=" + name + ", depence=" + depence + "]";
	}

	public int getDepence() {
		return depence;
	}

	public void setDepence(int depence) {
		this.depence = depence;
	}

	public Shield(String name, int depence) {
		super();
		this.name = name;
		this.depence = depence;
	}

}
