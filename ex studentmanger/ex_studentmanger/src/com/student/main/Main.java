package com.student.main;

import com.student.controller.StudentController;

public class Main {

	public static void main(String[] args) {
		while (true) {
			new StudentController().mainMenu();
		}

	}

}
