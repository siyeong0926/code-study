package ex03_etcforwhile;

import java.util.Scanner;

public class DivideTest {

	public static void main(String[] args) {
		//ex01();
		//ex02();
		//ex03();
	}
	
	public static void ex01() {
		Scanner scan = new Scanner(System.in);
				
		//두개의 정수를 입력 받아서 덧셈 결과를 출력하시오.
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.printf("%d + %d = %d", x, y, x+y);
		
		scan.close();//scan을 더이상 쓰지 않는다는 시점에 닫아주는게 좋다.
	}
	
	public static void ex02() {
		Scanner scan = new Scanner(System.in);
		
		//두개의 정수를 입력 받아서 나눗셈 결과를 출력하시오.
		//분모가 0이 되는 경우에는 Exception이 발생한다. == 에러
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.printf("%d / %d = %d", x, y, x/y);
		
		scan.close();
	}
	
	public static void ex03() {
		Scanner scan = new Scanner(System.in);
		
		//두개의 실수를 입력 받아서 나눗셈 결과를 출력하시오.
		//분모가 0.0이 되는 경우에 예외가 발생하지 않는다. 대신 계산할 수 없다는 Infinity가 나온다 == 에러는 아님
		double d1 = scan.nextDouble();
		double d2 = scan.nextDouble();
		System.out.printf("%f / %f = %f", d1, d2, d1/d2);
		
		scan.close();
	}
}
