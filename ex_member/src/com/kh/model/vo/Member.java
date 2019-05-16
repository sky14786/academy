package com.kh.model.vo;

public class Member {
	// �̸� �̸��� �ּ� Ű ������ ����
	private String name, address, email;
	private int age;
	private double weight, height;
	private static int count = 0;

	public Member() {

	}

	public Member(String name, String address, String email, int age, double weight, double height) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public void printMember() {
		System.out.printf("�̸� : %s ���� : %d �ּ� : %s �̸��� : %s Ű : %.1f ������ : %.1f", name, age, address, email, height,
				weight);
	}

	public static int getCount() {
		return count;
	}

	public static void countPlus() {
		count++;
	}

	public static void countMinus() {
		count--;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
