package ex04_interface;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student();
		Person p1 = s1;	//자식 -> 부모 ; 암시적형변환
		Method1(s1);
	}

	public static void Method1(Person p) {	//다형성을 구현할 수 있다.
		p.eat();
	}
	
}
