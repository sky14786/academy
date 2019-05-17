package com.kh.controller;

import com.kh.model.vo.Employee;
import com.kh.model.vo.Person;
import com.kh.model.vo.Student;
import com.kh.model.vo.Teacher;

public class Controller {
	Person[] persons = new Person[3];

	public void basicTest() {
		persons[0] = new Student(3, 33.3, "김준영", "안산시", 25, '남');
		persons[1] = new Employee();
		persons[2] = new Teacher();

		persons[0].print();
		persons[1].print();
		persons[2].print();
//
//		System.out.println(((Student) persons[0]).getGrade());
//		System.out.println(((Student) persons[0]).getResult());

	}
}
