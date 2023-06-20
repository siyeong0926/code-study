package ex01_class_basic_test;

import ex01_class_basic.CalcSum; //패키지가 다르기 때문에 삽입됨.

public class CalcSumTest {

	public static void main(String[] args) {
		
		CalcSum cs = new CalcSum(); //기본생성자를 호출
		
		//배열
		int[] arr = {1, 23, 45, 67, 22, 28, 38, 34, 20};
		System.out.println(cs.plus(arr));
		
		//배열의 갯수가 제한이 없음
		//public int plus(int... nums) {} 로 인해 가능함.
		//but int만 가능, double 타입은 또 (double...nums) {}를 만들어줘야함
		//System.out.println(cs.plus(1, 23, 45, 67, 22, 28, 38, 34, 20));
		
		//int, double
		System.out.println(cs.plus(3, 5));
		System.out.println(cs.plus(3, 5, 7));
		System.out.println(cs.plus(3.4, 5.8));
		
		//from_to
		System.out.println(cs.sum(1, 10));
		System.out.println(cs.sum(1, 100));
		System.out.println(cs.sum(1, 99));
		
		//from_to_num
		System.out.println(cs.sum(1, 100, 5));
		
		int cnt = 5;
		//void인 경우
		printHello(cnt); //같은 클래스에 있다면 그냥 출력 가능
		
		//boolean인 경우
		boolean result = printHello(cnt); {
			if(result)
				System.out.println("성공적으로 실행완료");
			else
				System.out.println("실행 중 오류발생");
		}
		
	}

	/*
	//void인 경우
	private static void printHello(int cnt) {
		for(int i=0; i<cnt; i++) {
		System.out.println("Hello 자바");
		}
	}
	*/
	
	//boolean인 경우
	private static boolean printHello(int cnt) {
		if (cnt > 5) {
			System.out.println("5이하의 출력만 가능합니다.");
			return false;
		}
		
		for(int i=0; i<cnt; i++) {
		System.out.println("Hello 자바");
		}
		return true;
	}
	
}







