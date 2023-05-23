package ex01_variable;

import java.util.Scanner;

/*
 * 여러줄 주석
 * MainClass : 변수를 공부하는 클래스
 * 작성자 : 김시영(siyeong0926@naver.com)
 * 최초작성일 : 2023-03-07
 */
/* 
 * 키워드 이름 규칙
 * 1. 프로젝트 : 마음대로
 * 2. 패키지 : 모두 소문자로. 실무에서는 회사 도메인과 앱이름으로 작성(com.samsung.galaxy)
 * 3. 클래스 : 첫글자는 대문자로. Upper Camel Case 방식(HelloWorld)
 * 4. 메서드 : 첫글자는 소문자로. lower Camel Case 방식(helloWorld, checkLogin)
 * 5. 변수 : 메서드와 동일
 * 6. 상수 : 모두 대문자로 작성(PI, FILE_PATH : Snake case)
 */
public class MainClass {
	
	//타입의 구분
	//1. primitive type : 기본타입(소문자) 8개, 값을 저장하는 타입
	//2. reference type : 참조타입(첫글자가 대문자, 모든 클래스는 다 참조타입)

	public static void main(String[] args) {
		// 한줄 주석(컴파일 해당없음, 설명)
		/*
		 // 문자열 입력 테스트
		  Scanner scan = new Scanner(System.in);
		  
		  System.out.print("당신의 이름은: "); String name = scan.next(); //엔터가 입력될 때까지의 문자열을 반환하는 메서드
		  System.out.println(name + "님, 안녕하세요");
		 */
		/*System.out.println("배고프시죠?");
		System.out.println();
		System.out.println("조금만 참으세요.");
	
		System.out.println("\"철수\"야 밥먹자");
		System.out.println("C:\\GDJ65\\javaworks");
		
		System.out.print("점심메뉴?\t");
		System.out.print("김치찌개");
		*/
		
		char ch = 'A';
		System.out.println(ch);
		
		char ch2 = 97;
		System.out.println(ch2); //'a'
		
		//문자타입의 변수
		//값을 대입할 때 숫자를 대입해도 가능하다.
		char ch3 = 3000; 
		System.out.println(ch3);
		
		short s1 = 'a';
		System.out.println(s1); //97
		
		int i = 10; //10진수
		System.out.println(i); //10
		
		int j = 010; //8진수
		System.out.println(j); //8
		
		int k = 0x10; //16진수
		System.out.println(k); //16
		
		int l = 0b1010; //2진수
		System.out.println(l); //10
		
		int kor = 90;
		int eng = 84;
		int math = 95;
		
		int tot = kor + eng + math;
		double avg = (double)tot / (double)3; //형변환해서 실수로 출력하기. 3 앞에 double 지워도 자동승격으로 가능.
		System.out.println("총점은 " + tot + "이고, 평균은 " + avg + "입니다.");
		
		/*
		float pi = 3.14f; //float pi = (double)3.14;
		
		String job = null; //선언만 한 상태, 가리키는 상태가 없을 때. 참조타입에 변수를 주는 상태
		*/
		
		double PI = 3.14; //final 넣으면 상수 선언_맨 위에서 상수선언하면 밑에서 알아보기 어려우므로 pi를 대문자로 표시.
		
		PI = 3.141592;
		System.out.println(PI * 3 * 3);
		//PI = 3.14;_오류 발생
		//System.out.println(pi * 3 * 3);
	}

	
}
