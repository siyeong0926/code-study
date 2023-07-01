package ex02_class_test;

import ex02_class.*;	// 이 패키지에 있는 모든 클래스를 import 한다. == *
/*
import ex02_class.Address;
import ex02_class.School;
import ex02_class.Student;
*/
public class Mainclass {

	public static void main(String[] args) {
		// School 객체 생성
		School sch = new School();

		sch.setName("구디대학");
		
		Address schAddr = new Address();
		schAddr.setPostcode("23456");
		schAddr.setRoadAddress1("서울시 금천구 가산로 123");
		schAddr.setRoadAddress2("대륭테크노 5층");
		sch.setAddress(schAddr);
		
		Student[] students = new Student[3];
		students[0] = new Student();
		students[0].setStuNo("20172327"); 
		students[0].setStuName("김동영");
		
		students[1] = new Student();
		students[1].setStuNo("20174571"); 
		students[1].setStuName("최기성");
		
		students[2] = new Student();
		students[2].setStuNo("20104571"); 
		students[2].setStuName("만학도");
		
		sch.setStudents(students);
		
		sch.printInfo();
		
	}

}
