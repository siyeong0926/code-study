package ex01_class;

public class Student extends Human {	//Human:부모클래스, Student:자식클래스
	public String stuID;

	/*
	//자식의 생성자는 부모의 기본생성자를 호출한다.
	//부모의 기본생성자가 아닌 다른 생성자를 호출하는 방법
	//1. 자식이 호출할 부모의 생성자를 코딩으로 호출한다.
	//2. 부모에게 기본생성자를 무조건 추가한다.
	public Student() {	//기본생성자
		super(" ", 0);	//부모의 매개변수 2개짜리 생성자를 코딩으로 호출함.
		System.out.println("Student생성자");
	}
	*/
	
	//this(), super() 는 메서드의 첫번째에 코딩해야한다.
	public Student() {
		this("무명씨", 20, "99999");
	}
	//이클립스 source를 통해서 기본생성자를 호출하는 경우의 코드
	public Student(String name, int age, String stuID) {
		super(name, age);	//name, age는 부모생성자에게 맡기고
		this.stuID = stuID;	//stuID는 내가 처리한다.
	}

}
