package ex03_etcforwhile;

//사용하는 클래스 종류마다 생성되기 때문에 여러개 입력될 수 있음.
import java.util.Scanner;
import java.util.Random;


public class UpDown3 { 

	public static void main(String[] args) {
		//업다운 게임을 하는데, 난수를 설정해 개발자도 숫자를 모르게 만들기.
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		
		int com, user, cnt;

		//문제출제 (1~50)
		com = rnd.nextInt(50)+1; // == 0~50, 괄호 안에 50이 아니라 51을 적고 뒤에 +를 삭제해도 됨.
		cnt = 0; 
		
		while(true) { //반복문 설정
			//입력
			user = inputUser(scan);	//밑에 함수 별도로 설정
			
			//처리
			cnt++; //숫자(유효)를 얼마나 입력했는지 출력하기 위해.
			
			String result = "";
			if (com > user)
				result = "UP"; //컴퓨터가 유저입력값보다 클 때 "업" 출력
			else if	(com < user)
				result = "DOWN"; //컴퓨터가 유저입력값보다 작을 때 "다운" 출력
			else 
			{
				result = "정답"; // 컴퓨터와 유저입력값이 같을 때 "정답" 출력
				break;
			}	
				
			//결과 출력
			System.out.printf("결과:%s\n", result);
		}
		
		System.out.printf("%d번만에 정답(%d)을 맞추셨습니다.", cnt, com); //게임 한번이 종료되는 시점
		
		//더 코드를 작성해서 난이도 조정
		//게임을 계속할건지
		//이것을 몇번만 반복하고, 승률 계산하기
		
		scan.close();
	}
	
	//사용자가 정상입력할 때까지 반복하다가 결국 정상 입력된 값을 반환하는 함수
	public static int inputUser(Scanner scan)
	{
		int user = 0;
		
		while(true) //사용자가 정상적인 숫자를 입력할때까지의 반복문
		{
			System.out.print("숫자 입력(1~50) : "); //prompt
			String temp = scan.nextLine();
			
			//유효성체크
			if (isNumeric(temp))
			{
				user = Integer.parseInt(temp);
				if (user < 1 || user > 50)
					System.out.println("숫자(1~50)를 입력하세요.");
				else
					break;
			}
			else
				System.out.println("숫자(1~50)를 입력하세요.");
		}		
			return user;
	}
	
	//1,2번 공통 참고
	public static boolean isNumeric(String str) {
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
	
