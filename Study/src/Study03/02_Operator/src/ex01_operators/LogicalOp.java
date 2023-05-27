package ex01_operators;

import java.util.Scanner;

public class LogicalOp {
	
	public static void main(String[] args) {
		// 논리연산자
		
		// ==  !=
		int x,y;
		x = 3;
		y = 5;
		boolean bb = (x == y); //!=이면 true
		System.out.println(bb); //false
		
		String str1 = "Hello"; //String(문자열) 리터럴
		String str2 = new String("Hello"); //String(문자열) 객체
		String str3 = "Hello";
		String str4 = new String("Hello"); 
		
		//string 리터럴 => Heap메모리에 할당은 되는데,
		//그 중에서 String Constant Pool (문자열 상수풀)에 저장된다. 
		
		//string 객체는 이미 모아져 있는 풀이 아니라 할 때마다 새로 만듬
		System.out.printf("str1: %s, str2: %s\n", str1, str2); //true 같음
		System.out.println(str1 == str2); //false, 레퍼런스 타입 때문에 같아도 오류가 남. => equals 사용
		System.out.println(str1 == str3); //true
		System.out.println(str2 == str4); //false
		
		System.out.println(str1.equals(str2)); //true, equals는 같은지 같지 않은지 물어보는 메서드.
		
		//||연산자
		//||(or)연산자는 한쪽이 T이면, 무조건 T
		//||(or)연산자는 앞의 조건을 따져서 T이면, 뒤는 실행하지도 않는다.
		
		boolean b = (2 > 3) || (2 <= 3); //둘중에 하나만 맞아도 T
		
		System.out.println(b);
		
		//&&연산자
		//&&(and)연산자는 양쪽이 모두 T여야, 그때만 T
		//&&(and)연산자는 앞의 조건을 따져서 앞이 F이면, 뒤는 실행하지도 않는다. 
		
		boolean c = (2 < 3) && (2 <= 3); //둘중에 모두 맞아야 T
		
		System.out.println(c);
	
		//삼항연산자
		//사용자에게 숫자를 입력받아서 짝수, 홀수를 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("숫자를 입력하세요:");
		int number=scan.nextInt();
		String result = CheckNum(number);
		/*
		CheckNum(int num) 함수로 대신 입력
		String result = "";
		
		if (number % 2 == 0) {
			result = "짝수";
		}
		
		else {
			result = "홀수";
		}
		*/
		System.out.printf("입력하신 숫자 %d는 %s입니다.", number, result);
	}

	public static String CheckNum(int num) {//CheckNum(int num)라는 함수 지정, 언제든 식 없이 다시 불러낼 수 있음.
	
		String result = "";
		
		//짝수,홀수 구분
		result = (num%2==0)? "짝수" : "홀수";
		/*
		result = (num%2==0)? "짝수" : "홀수"; 로 스킵
		if (num % 2 == 0) {
			result = "짝수";
		}
		else {
			result = "홀수";
		}
		*/
		return result;
				
	}
	
	//삼항연산자
	//5의 배수인지, 3의 배수인지 구분
	public static String CheckNum2(int num) {
		String result  = "";				
		result = (num % 5 == 0) ? "5의배수": 
								  ((num % 3 == 0) ? "3의배수" : "5또는 3의 배수 아님");
		
		/*	
		if (num % 5 == 0) {
			result = "5의배수";			
		}		
		else if (num % 3 == 0)
		{
			result = "3의배수";
		}
		else
		{
			result = "5또는 3의 배수 아님";
		}
		*/
			
		return result;
  }	
}

