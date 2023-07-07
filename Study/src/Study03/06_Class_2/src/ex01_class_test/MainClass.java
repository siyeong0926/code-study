package ex01_class_test;

import ex01_class.Human;
import ex01_class.Student;
import ex01_class.Worker;

public class MainClass {

	public static void main(String[] args) {
		//Human 객체생성 (필드2개, 메서드2개)
		Human h = new Human();
		h.age = 20;
		h.name = "홍길동";
		h.eat();
		h.sleep();
		
		//Student 객체 생성 (필드3개, 메서드3개)
		Student stu = new Student();
		stu.name = "김길동";
		stu.stuID = "20172871";
		
		//암시적 형변환 ; 자식 -> 부모 형변환
		Human p = stu;	//Student타입인 stu를 Human타입으로 형변환.
		System.out.println(p.name);
		Student ss = (Student)p;	//다시 Student타입으로 형변환, 그렇다면 Human타입(태생은  Student타입)에서  Student타입으로 형변형 가능
		System.out.println(ss.stuID);
		
		//명시적 형변환 ; 부모 -> 자식 형변환
		// =>컴파일은 무조건 통과되지만, 실행시 에러가 발생할 수도 있다.
		// =>java.lang.ClassCastException ; 실행시 클래스를 변환하다가 발생하는 오류
		// =>그 참조변수가 어떤 타입의 인스턴스를 참조하는가에 따라서
		// =>태생을 따라간다. (new 인스턴스 타입)
		// =>Human은 필드2개, 메서드2개 이지만, Student는 필드3개, 메서드3개이기 때문
		//Student s =(Student)h;	=> Human타입인 h를 Student으로 형변환
			
		//참조타입 -> 참조타입 형변환
		// => 아무 상관없는 참조끼리는 형변환 안됨.
		// => 상속관계에 있는 참조타입끼리만 형변환을 고려한다.
		Student s =(Student)p;
		
		
		//Worker 객체 생성 (필드3개, 메서드3개)
		Worker w = new Worker();
		w.age = 28;
		w.name = "이길동";
		w.gotoWork();
		
	}
}
