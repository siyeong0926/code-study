package ex02_condition;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//관람료예매
		//0~7세:무료, 8~19세:500원 20~65세:2000원, 65~:무료		
		//나이를 입력받고, 관람료를 계산해서 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요:");		
		String sAge = sc.nextLine();
		
		int age = 0;
		//유효성체크
		//1.숫자만 입력했는지 2.숫자의 범위가 유효한지
		if (isNumeric(sAge)) //내가 입력받은 sAge(문자열)이 숫자인지 아닌지 확인하는 함수
		{
			age = Integer.parseInt(sAge); //"숫자인걸 확인하고 숫자로 형변환해라"
			
			if (age < 0 || age > 150)
			{
				System.out.println("잘못입력하셨습니다.");
				return; //유효성이 맞지 않으면 메서드의 끝으로
			}
		}
		else
		{
			System.out.println("나이를 숫자로 입력하세요.");
			return; //유효성이 맞지 않으면 메서드의 끝으로
		} 
		
		//유효한 범위의 숫자를 입력한 경우에만 실행
		
		String pay = "";
		
		if (age <= 7 || age > 65) {
			pay = "무료";
		}
		else if (age <= 19) {
			pay = "500원";
		}
		else if (age <= 65) {
			pay = "2000원";
		}
		
		System.out.printf("당신은 요금이 %s 입니다.", pay);
	}
	
	public static boolean isNumeric(String str)
	{
		if (str != null && str.matches("[0-9]+")) //정규표현식
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void ex01Condition()
	{
		int age = 15;
		
		String message = "";
		
		if(age >= 20) {
			message = "성인";
		}		
		else {
			message = "미성년자";
		}
		System.out.println(message);
	}
}