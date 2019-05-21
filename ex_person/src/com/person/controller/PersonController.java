package com.person.controller;

import com.person.model.vo.Employee;
import com.person.model.vo.Person;
import com.person.model.vo.Student;
import com.person.model.vo.Teacher;

public class PersonController {

	public void personEnroll() {
		Person[] persons=new Person[3];
		//������
		persons[0]=new Student("����ö",32,'��',"����",3,90);
		persons[1]=new Employee("�ڱ��",27,'��',"�д�","������",100);
		persons[2]=new Teacher("������",20,'��',"��ź","�ڹ�",10);
		//��¹� �ۼ�
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
		
		System.out.println("�������ε����� ���");
		for(Person p : persons) {
			if(p.getName().equals("������")) {
				System.out.println(p);
			}
		}
		
		
		
		
	}
	
	
}
