package ex01_condition;

import java.util.Scanner;

public class UpDown1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int com, user;

		com = 35;
		
		//입력
		System.out.print("숫자 입력(1~50) : "); //입력값을 받기 전에 뭐라도 화면에 띄워주는 것 == 프롬프트(메세지)
		String temp = scan.nextLine(); // 유효성 체크만 하기 위해 잠시 문자 temp로 두는 것.
		
		//유효성체크
		if (isNumeric(temp))
		{	
			user = Integer.parseInt(temp); // 문자인 사용자 변수를 숫자로 형변환
			if (user < 1 || user > 50)
			{
				System.out.println("숫자(1~50)를 입력하세요.");
				return; //아래는 처리하지 말고 메서드를 나가라.
			}
			else //여기에 업다운 코딩이 가능하긴 하지만, 유효성 체크를 하는 곳에 처리하면 복잡할 수 있음. 밑에 따로 코딩.
			{
				
			}
		}
		else
		{
			System.out.println("숫자(1~50)를 입력하세요.");
			return; //아래는 처리하지 말고 메서드를 나가라.
		}
		
		//처리
		String result = "";
		if (com > user)
			result = "UP"; //컴퓨터가 유저입력값보다 클 때 "업" 출력
		else if	(com < user)
			result = "DOWN"; //컴퓨터가 유저입력값보다 작을 때 "다운" 출력
		else 
			result = "정답"; // 컴퓨터와 유저입력값이 같을 때 "정답" 출력
	
			
		//결과 출력
		System.out.printf("컴:%d 사용자:%d 결과:%s\n", com, user, result);
		
	}

	public static boolean isNumeric(String str)
	{
		if (str != null && str.matches("[0-9-]+")) //앞 -는 0-9까지의 범위를, 9뒤에 -는 음수를 입력할까봐 적음. 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
