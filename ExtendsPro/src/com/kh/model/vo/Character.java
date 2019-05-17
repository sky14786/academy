package com.kh.model.vo;

public class Character {
	private String name;
	private int level;
	private int attack;
	private int depence;
	private int exp;
	private Item item;

	public Character() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", level=" + level + ", attack=" + attack + ", depence=" + depence + ", exp="
				+ exp + ", item=" + item + "]";
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public Character(String name, int level, int attack, int depence, int exp, Item item) {
		super();
		this.name = name;
		this.level = level;
		this.attack = attack;
		this.depence = depence;
		this.exp = exp;
		this.item = item;
	}

	public int getDepence() {
		return depence;
	}

	public void setDepence(int depence) {
		this.depence = depence;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
