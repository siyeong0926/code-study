package ex04_scannertest;

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		//사용자에게 주소, 이메일, 이름, 나이를 입력받아서 출력하시오.
		
		//ScannerClass는 키보드, 파일, 문자열로부터 입력을 받기 위한 클래스(JDK1.5부터 가능)
		//next~() 공백(space)을 기본 구분자로 사용한다. > 한개로 동일시키기 nextLine과 함께 출력 안됨.
		//nextLine~() enter를 기본 기분자로 사용한다.
		/*
		Scanner scan = new Scanner(System.in);
		
		//서울시 금천구 가산동 520 으로 입력했을 때 공백이 기본 구분자가 된다.
		System.out.print("주소입력.");
		String addr = scan.next(); //서울시 금천구 가산동 520
		
		System.out.print("이메일입력.");
		String email = scan.next(); //금천구 가산동 520
		
		System.out.print("이름입력.");
		String name= scan.next(); //가산동 520
		
		System.out.print("나이입력.");
		String age = scan.next(); //520
		
		System.out.println(addr);
		System.out.println(email);
		System.out.println(name);
		System.out.println(age);
		*/
		
		Scanner scan = new Scanner(System.in);
		
		//서울시 금천구 가산동 520
		System.out.print("주소입력.");
		String addr = scan.nextLine(); 
		
		System.out.print("이메일입력.");
		String email = scan.nextLine(); 
		
		System.out.print("이름입력.");
		String name= scan.nextLine(); 
		
		System.out.print("나이입력.");
		String age = scan.nextLine();
		
		System.out.println(addr);
		System.out.println(email);
		System.out.println(name);
		System.out.println(age);
	}

}
