package com.inter.model.vo;

import com.inter.model.inter.PrintDriver;

public class SamSongPrint implements PrintDriver {
	private String model;
	private String name;

	public SamSongPrint() {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SamSongPrint(String model, String name) {
		super();
		this.model = model;
		this.name = name;
	}

	@Override
	public void printInfo() {

	}

	@Override
	public String printDriver() {
		return "";
	}
}
