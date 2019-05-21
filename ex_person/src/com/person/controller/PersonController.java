package com.person.controller;

import com.person.model.vo.Employee;
import com.person.model.vo.Person;
import com.person.model.vo.Student;
import com.person.model.vo.Teacher;

public class PersonController {

	public void personEnroll() {
		Person[] persons=new Person[3];
		//값대입
		persons[0]=new Student("문은철",32,'남',"서울",3,90);
		persons[1]=new Employee("박기오",27,'남',"분당","개발팀",100);
		persons[2]=new Teacher("서현희",20,'여',"동탄","자바",10);
		//출력문 작성
		for(int i=0;i<persons.length;i++) {
			
//			System.out.println(persons[i].getName()+persons[i].getAge()
//			+persons[i].getGender()+persons[i].getAddress());
			String msg=persons[i].getName()+persons[i].getAge()
					+persons[i].getGender()+persons[i].getAddress();
			if(persons[i] instanceof Student) {
				Student s=(Student)persons[i];
//				System.out.println(s.getGrade()+s.getSungjuck());
				msg+=s.getGrade()+s.getSungjuck();
			}
			else if(persons[i] instanceof Employee) {
				Employee e=(Employee)persons[i];
				//System.out.println(e.getDepartment()+e.getSalary());
				msg+=e.getDepartment()+e.getSalary();
			}
			else if(persons[i] instanceof Teacher) {
				Teacher t=(Teacher)persons[i];
				//System.out.println(t.getGuamook()+t.getExp());
				msg+=t.getGuamook()+t.getExp();
			}
			System.out.println(msg);
		}
		
		System.out.println("동적바인딩으로 출력");
		for(Person p : persons) {
			if(p.getName().equals("서현희")) {
				System.out.println(p);
			}
		}
		
		
		
		
	}
	
	
}
