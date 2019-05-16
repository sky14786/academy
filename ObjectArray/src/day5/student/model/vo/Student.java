package day5.student.model.vo;

public class Student {
	private int grade, classroom, number;
	private String name;

	public Student() {
	}

	public Student(int grade, int classroom, int number, String name) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.number = number;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void information() {
		System.out.printf("%d학년 %d반 %d번 %s\n", grade, classroom, number, name);
	}

}
