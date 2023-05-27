package ex01_operators;

import java.util.Scanner;

public class ConverTest {

	public static void main(String[] args) {
		int a = 100;
		
		//기본=>기본타입의 형변환은 (타입명) 으로 가능		
		short s = (short)a; //자동형변환 안됨.
		System.out.println("안녕" + 100); //안녕100 으로 출력
		
		//int가 String으로 변환
		//1. String.valueOf() 사용
		//2. +연산자 사용
		String str = String.valueOf(a); 
		String str2 = a + "";
		
		Scanner scan = new Scanner(System.in);
		//나이를 입력받을 때, 잘못 입력될 수도 있으므로
		//nextInt()를 사용하지 않고, nextLine()인 문자열로 받는다.
		String sAge = scan.nextLine();
		
		boolean result = isNumeric(sAge);
		
		if (result)
		{	
			//String을 int로 변환(2가지 방법) -> 경우에 따라 오류 발생
			int age = Integer.valueOf(sAge); //Integer을 반환(정수 객체), 문자열(sAge)이 숫자(age)로 바뀌어서 리턴된다.
			//int age = Integer.parseInt(sAge); //int를 반환(정수 기본타입)
		
			//당신의 내년은 몇살입니다.
			System.out.println(++ age); 
		}
		else
		{
			System.out.println("나이는 숫자로만 입력하세요.");
		}
	} //method end
	
	//전달받은 문자열이 숫자만 있는지, 아닌지를 판단해서 반환
	public static boolean isNumeric(String str)
	{
		if (str != null && str.matches("[0-9.]+")) //정규표현식
		{
			return true;
		}
		else
		{
			return false;
		}
	}
} //class end
