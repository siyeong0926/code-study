package ex02_forwhile;

import java.util.Scanner;

public class While01 {
	//for문은 횟수가 정해져 있을 때.
	//while문은 횟수가 정해져 있지 않을 때.

	public static void main(String[] args) {
		//ex01();
		//ex02();
		ex02_1();
	}

	public static void ex01() {
		//1부터 10까지의 합을 구하시오.
		int tot = 0;
		
		int i = 1;
		while(i<11) {
			tot += i++;
		}
		
		System.out.println(tot); //55
	}
	
	public static void ex02() {
		//사용자가 숫자를 입력하는대로 합계를 출력하시오.
		Scanner scan = new Scanner(System.in);
		int tot = 0; //초기값 부여, 반복할 필요가 없음.
		
		while(true) { //true: 무한루프 돌아라.
			
			System.out.print("숫자입력: (종료:0)");
			int num = scan.nextInt(); //숫자를 입력해라.
			
			if (num == 0) {
				break; //사용자가 0을 누르면 나가라., 종료하는 코드를 0으로 설정.
			}	
			
			tot += num; //사용자가 입력한 숫자를 누적시킬 예정이다.
		}	
		System.out.println(tot);
	}
	
	public static void ex02_1() {
		//사용자가 숫자를 입력하는대로 합계를 출력하시오.
		//계속 진행할건지 물어보는 조건문 삽입.
		Scanner scan = new Scanner(System.in);
		int tot = 0; //초기값 부여, 반복할 필요가 없음.
		
		while(true) { //true: 무한루프 돌아라.
			
			System.out.print("숫자입력: ");
			String temp = scan.nextLine(); //숫자를 입력해라.
			if(isNumeric(temp)) {
				
				int num = Integer.parseInt(temp);
				tot += num;//사용자가 입력한 숫자를 누적시킬 예정이다.
			}	
			
			System.out.print("계속하시겠습니까?(Y/N) ");
			String reply = scan.nextLine();
			if (reply.equals("N") || reply.equals("n"))
				break;
		}	
		
		System.out.println(tot);
	}
	
	public static void ex02_2() {
		//사용자가 숫자를 입력하는대로 합계를 출력하시오.
		//ex02_1의 if문을 switch문으로 변경.
		Scanner scan = new Scanner(System.in);
		int tot = 0;
		boolean bContinue = true;//
		
		while(bContinue) {
			System.out.print("숫자입력:");
			String temp = scan.nextLine();
			if (isNumeric(temp))
			{
				int num = Integer.parseInt(temp);
				tot += num;
			}
			
			System.out.print("계속하시겠습니까?(Y/N) ");
			String reply = scan.nextLine();
			switch(reply)
			{
				case "N":
				case "n":
					bContinue = false;					
					break;
			}
//			if (reply.equals("N") || reply.equals("n"))
//				break;			
		}
		
		System.out.println(tot);
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
}




