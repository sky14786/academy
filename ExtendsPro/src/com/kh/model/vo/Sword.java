package com.kh.model.vo;

public class Sword extends Item{
	private String name;
	private int attack;

	public Sword() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	@Override
	public String toString() {
		return "Sword [name=" + name + ", attack=" + attack + "]";
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public Sword(String name, int attack) {
		super();
		this.name = name;
		this.attack = attack;
	}

}
