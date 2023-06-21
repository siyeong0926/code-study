package ex01_class_basic_test;

import  ex01_class_basic.Student; //같은 패키지 안에 있는 클래스 참조

public class Class01_Test {
	
	public static void main(String[] args) {
		
		Student stu = new Student(); 
		
		System.out.println(stu.name + stu.age + stu.address);
	}
	
}
