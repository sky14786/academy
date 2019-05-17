package com.kh.controller;

import com.kh.model.vo.Sword;
import com.kh.model.vo.Shield;

public class Controller2 {
	public void createChara() {
		com.kh.model.vo.Character c1 = new com.kh.model.vo.Character("지존준영", 1, 100, 20, 0, new Sword("지존검", 200));
		System.out.println(c1);
		((Sword) c1.getItem()).getAttack();
		com.kh.model.vo.Character c2 = new com.kh.model.vo.Character("지존준영", 1, 100, 20, 0, new Shield("지존방패", 200));
		System.out.println(c2);
	}
}
