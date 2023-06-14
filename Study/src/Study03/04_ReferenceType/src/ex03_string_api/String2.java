package ex03_string_api;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		String userid = "test1234";

		Scanner scan = new Scanner(System.in);

		System.out.print("회원ID :");
		String inputId = scan.nextLine();

		/*
		userid = userid.toLowerCase(); //대문자로 입력해도 소문자로 변경. 비교뿐이기 때문에 대문자로 변경하게 해도 가능하다.
		inputId = inputId.toLowerCase(); //대문자로 변경하던, 소문자로 변경하던 위의 함수와 동일하기만 하면 된다.
		
		if (userid.equals(inputId)) //"=="은 값타입을 비교할 때는 사용가능하지만, 문자를 같다고 할때는 .equals()를 사용한다.
			System.out.println("로그인을 성공하셨습니다.");
		*/
		
		if (userid.equalsIgnoreCase(inputId)) //IgnoreCase으로 위의 함수 생략 가능
			System.out.println("로그인을 성공하셨습니다.");
		else
			System.out.println("잘못된 회원ID 입니다.");
	}

}
