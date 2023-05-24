package ex02_casting;

public class MainClass {

	public static void main(String[] args) {
		int age = 25;
		short userAge = (short)age; //age 앞에 short를 써서 형변환.
		
		/*
		int age = 32768;
		short userAge = (short)age;
		System.out.println(userAge); //출력값 = -32767 ; short 값의 범위를 넘어갔기 때문에
		*/

		int a = (int)3.2; //3
		double b = a; //암시적(자동)형변환 3.0
		byte c = (byte)5.3; //5
		short d = (short)10; //암시적 형변환도 가능, 10
		
		//해당 클래스의 범위를 알고 싶을 때
		//System.out.println(Byte.MAX_VALUE);_값을 함부로 못바꾸게 상수로 만들어놓기 위해 앞을 대문자로 표기
		//int는 Integer로 표기
		
		int bb = (int)(5 + 3.5);
		//연산자 우선순위 반영해서
		//int bb = (int)5 + 3.5; 는 오류
	}

}
