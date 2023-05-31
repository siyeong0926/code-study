package ex02_forwhile;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
	}
	
	public static void ex01() {
		//숫자를 입력하여 짝수인지 홀수인지 출력
		//종료하고 싶을 때는 0을 누르도록 설정-반목문 종료
		
		Scanner scan = new Scanner(System.in);
		int num = 1; //밑의 while문을 true로 실행시키기 위해 1을 줌
		
		while(num > 0) { //반복문으로 설정하기 
		System.out.println("숫자입력 (종료:0) :");
		num = scan.nextInt();
		
		if (num < 1)
			break; //0을 입력했을 때 멈추고 반복문이 끝남
		
		else if (num % 2 ==0)
			System.out.println("짝");
		else
			System.out.println("홀");
		
		} //반복문 끝
		System.out.println("프로그램 종료"); //종료하려고 0을 눌렀을 때 출력되는 결과
	}

	public static void ex01_1() {
		//숫자를 입력하여 짝수인지 홀수인지 출력
		//do-while문으로 변경
		
		Scanner scan = new Scanner(System.in);
		int num = 1; //밑의 while문을 true로 실행시키기 위해 1을 줌
		
		do { //조건없이 일단 무조건 실행하는 반복문으로 설정하기 
		System.out.println("숫자입력 (종료:0) :");
		num = scan.nextInt();
		
		if (num > 0 && num % 2 == 0) //num > 0이라는 조건을 안쓰면 0이 짝수와 프로그램 종료 같이 출력
			System.out.println("짝");
		else if (num % 2 == 1)
			System.out.println("홀");
		} while(num > 0); //계속 할지말지 결정
		
		
		System.out.println("프로그램 종료"); //종료하려고 0을 눌렀을 때 출력되는 결과
	}
	
}
