package ex01_class_basic_test;

import ex01_class_basic.Score;

public class ScoreTest2 {

	public static void main(String[] args) {
		Score stu1 = new Score("뷔", 90, 95, 98);
		stu1.printCmd(); //뷔

		/*
		//같은 참조주소 ==> 같이 변경됨.
		Score jin = stu1;
		jin.name = "진";
		jin.printCmd(); //진
		
		stu1.printCmd(); //진, 같은 참조주소값을 줬기 때문에 주소에 있는 값을 "뷔"에서 "진"으로 변경함.
		*/
		
		//복사하여 다른 참조주소를 "진"에게 줌 ==> "뷔", "진" 둘 다 존재 == 깊은복사(DeepCopy)
		Score jin = stu1.deepCopy();
		jin.name = "진";
		jin.printCmd(); //진
		
		stu1.printCmd();//뷔 ==> 깊은복사로 인해 값이 변함.
	}

}
