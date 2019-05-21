package day5.student.model.vo;

public class Student {
	
	private int grade;
	private int classroom;
	private int number;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
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
	
	public String information() {
		
//		String msg=grade+"학년 ";
//		msg+=classroom+"반 ";
//		
		return grade+"학년 "+classroom
				+"반 "+number+"번 "+name;
	}
	@Override
	public String toString() {
		return grade+"학년 "+classroom
				+"반 "+number+"번 "+name;
	}

}






