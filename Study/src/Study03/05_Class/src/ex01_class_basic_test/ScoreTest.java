package ex01_class_basic_test;

import ex01_class_basic.Score; //ex01_class_basic에 있는 Score를 첨부한다.

public class ScoreTest {

	public static void main(String[] args) {
		//인스턴스를 생성하고, 각 속성들에 초기값을 설정
		
		Score stu1 = new Score();
		stu1.name = "홍길동";
		stu1.kor = 80;
		stu1.eng = 50;
		stu1.math = 77;
		
		System.out.println(stu1.calcSum()); //207
		
		
		Score stu11 = new Score("홍길동", 80, 50, 77);
		System.out.println(stu11.className); //GDJ65
		stu11.className = "파이썬반";
		System.out.println(stu11.className); //파이썬반
		
		Score stu2 = new Score("라라라");
		
		Score stu3 = new Score();
		System.out.println(stu3.className); //GDJ65 , 인스턴스가 다르기 때문에 파이썬반이 아니다.
											//각각의 객체(인스턴스)별로 다른 값들을 저장하고 있다.
											//stu11이 변경되어도 stu3은 변경되지 않는다.
				
		double avg = stu1.calcAvg();
		System.out.println(avg);
		
		Score sss = stu1;	//stu1 변수가 갖고 있는 참조값을 sss에게 준다.는 뜻
		sss.className = "풀스택개발자반";
		System.out.println(sss.className);	//풀스택개발자반
		System.out.println(stu1.className);	//풀스택개발자반
		
		
		//println(참조변수)는 참조변수.toString() 메서드를 내부적으로 호출한다.
		//.toString() : 모든 클래스는 Object를 상속받으므로 모든 참조타입에 존재한다.
		//.toString() : 변수 타입 @참조주소 문자열로 반환한다.
		//각각의 인스턴스를 갖고 있기 때문에 참조주소가 다르다.
		System.out.println(stu11.toString());	//ex01_class_basic.Score@76ccd017 ; 패키지명.클래스명, 무슨타입인지, 참조주소값
		System.out.println(stu3); 	//ex01_class_basic.Score@182decdb
		System.out.println(stu1);	//ex01_class_basic.Score@26f0a63f
		System.out.println(sss);	//ex01_class_basic.Score@26f0a63f ; Score sss = stu1; 했기 때문에 참조주소값이 같다.
		
		stu1.printCmd();//이름:홍길동 국어:80 영어:50 수학:77 평균:69.000000,
		stu3.printCmd();//이름:null 국어:0 영어:0 수학:0 평균:0.000000,
		
		String str = new String("안녕하세요");
		System.out.println(str); //안녕하세요
	}

}
