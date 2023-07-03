package ex01_class;

public class Human {
	public String name;
	public int age;

	public Human() { }	//누가 호출할지 모르기 때문에 부모의 기본생성자는 추가해두는 습관이 좋다.
	
	public Human(String name, int age) {	
		this.name = name;
		this.age = age; 
		System.out.println("Human생성자");
	}
	
	public void eat() {
		System.out.println("Human - eat");
	}

	public void sleep() {
		System.out.println("Human - sleep");
	}
}
