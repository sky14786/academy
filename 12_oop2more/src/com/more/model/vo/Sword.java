package com.more.model.vo;

public class Sword extends Item{

	private String name;
	private int attack;
	
	public Sword() {
		// TODO Auto-generated constructor stub
	}
	
	public Sword(String name, int attack) {
		super();
		this.name = name;
		this.attack = attack;
	}

	public String getName() {
		return name;
	}
	public int getAttack() {
		return attack;
	}

	@Override
	public String toString() {
		return "ÀÌ°Ç °ËÀÌ¾ß ¾æ¾æ";
	}
	
	
	
	
}
