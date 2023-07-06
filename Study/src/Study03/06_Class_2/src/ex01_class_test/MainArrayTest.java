package ex01_class_test;

import ex01_class.*;

public class MainArrayTest {

	public static void main(String[] args) {
		//부모의 생성자가 먼저 호출되고, 자식의 생성자가 호출된다.
		Student s = new Student();
		s.name = "홍홍홍";
		s.age = 25;
		s.stuID = "201701";
						
		
		Human[] hrs = new Human[3];
		hrs[0] = new Student();	//자동형변환 Student => Human
		hrs[1] = new Worker();	//자동형변환 Worker => Human
		hrs[2] = new Human();

	}

}
