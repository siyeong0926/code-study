package ex02_forwhile;

import java.util.Scanner;

public class UpDown2 { //while문으로 응용

	public static void main(String[] args) {
		//ex01();
		ex01_1();
	}	
	
	public static void ex01() {
		//업다운 게임 응용
		//반복문 설정
		//마지막 정답 입력시, "정답입니다." 출력
		Scanner scan = new Scanner(System.in);
	
		int com, user;

		com = 35;
		
		while(true) { //반복문 설정
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
			else {
				result = "정답"; // 컴퓨터와 유저입력값이 같을 때 "정답" 출력
				break;
			}	
				
			//결과 출력
			System.out.printf("결과:%s\n", result);
		}
		
		System.out.println("정답입니다.");
	}

	public static void ex01_1() {
		//업다운 게임 응용
		//반복문 설정
		//마지막 정답 입력시, "정답입니다." 출력
		//몇번만에 맞췄는지 출력
		Scanner scan = new Scanner(System.in);
	
		int com, user, cnt;

		//문제 출제
		com = 35;
		cnt = 0; //문제를 출제할 때마다 cnt는 0으로 초기화
		
		while(true) { //반복문 설정
			//입력
			while(true) { //사용자가 정상적인 숫자를 입력할 때까지 무한 반복
				System.out.print("숫자 입력(1~50) : "); //입력값을 받기 전에 뭐라도 화면에 띄워주는 것 == 프롬프트(메세지)
				String temp = scan.nextLine(); // 유효성 체크만 하기 위해 잠시 문자 temp로 두는 것.
				
				//유효성체크
				if (isNumeric(temp)) {	
					user = Integer.parseInt(temp); // 문자인 사용자 변수를 숫자로 형변환
					if (user < 1 || user > 50) {
						System.out.println("숫자(1~50)를 입력하세요.");
						return; //아래는 처리하지 말고 메서드를 나가라.
					}	
					else {
						break;
					}
				}
				else {
					System.out.println("숫자(1~50)를 입력하세요.");
				}	
			}
			
			//처리
			cnt++; //숫자(유효)를 얼마나 입력했는지 출력하기 위해.
			
			String result = "";
			if (com > user)
				result = "UP"; //컴퓨터가 유저입력값보다 클 때 "업" 출력
			else if	(com < user)
				result = "DOWN"; //컴퓨터가 유저입력값보다 작을 때 "다운" 출력
			else {
				result = "정답"; // 컴퓨터와 유저입력값이 같을 때 "정답" 출력
				break;
			}	
				
			//결과 출력
			System.out.printf("결과:%s\n", result);
		}
		
		System.out.printf("%d번만에 정답을 맞추셨습니다.", cnt);
	}

	public static boolean isNumeric(String str) {
		//1,2번 공통 참고
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
	
