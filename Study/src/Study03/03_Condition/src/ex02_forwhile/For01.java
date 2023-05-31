package ex02_forwhile;

import java.util.Scanner;

public class For01 {
	
	public static void main(String[] args) {
		//ex01();
		//ex02();
		//ex02_1();
		ex04();
	} 
	
	public static void ex01(){
		//사용자에게 이름을 3번 입력받으세요.
		
		Scanner scan = new Scanner(System.in);
				
		//for(초기문;조건문;증감식)
		/* int i=0;
		 * i<3;
		 * 문장들을 실행
		 * i++;
		 * i<3;
		 * 문장들을 실행
		 * i++;
		 * i<3;
		 * 문장들을 실행
		 * i++;
		 * i<3 false라서 for문을 빠져나옴;
		 */
		for(int i=0; i<3; i++)
		{
			System.out.print("이름 > ");
			System.out.println(scan.nextLine());
		}
	}
	
	public static void ex02(){
		//1부터 100까지의 수의 합을 구하시오.
		
				int tot = 0;
				for(int i=1; i<101;i++)
				{
					tot  += i;
				}
				System.out.println(tot); //5050
	}
	
	public static void ex02_1(){
		//1부터 100까지의 수 중에서 짝수의 합을 구하시오.
		
				int tot = 0;
				int i; //for문 안에 int가 없어도 됨.
				for(i=2; i<101; i+=2) //2부터 시작하고 2씩 증가하게 만듬
				{
					tot  += i;
				}
				System.out.println(tot);
	}
	
	public static void ex03(){
		//구구단 5단을 출력하시오.
		for(int num=1; num<10; num++)
		{
			System.out.printf("5 * %d = %d\n", num, 5*num);
		}
	}
	
	public static void ex03_1(){
		//구구단을 출력하시오._밑으로 출력
		for(int dan=2; dan<10; dan++) //2단부터 실행
		{
			for(int num=1; num<10; num++) //2단 *1부터 실행
			{
				System.out.printf("%d * %d = %d\n", dan, num, dan*num);
			} //*9까지 실행
			System.out.println(); //단마다 구분할 수 있게 한줄 띄어쓰기
		} //다음단으로 다시 실행, 9단까지
	}
	
	public static void ex03_2(){
		//구구단을 출력하시오._옆으로 출력
		for(int k=1; k<10; k++) //k == 단에 *1~9를 곱함
		{
			for(int dan=2; dan<10; dan++) //2단부터 9단까지 실행
			{
				System.out.printf("%d * %d = %d\t", dan, k, dan * k); //2~9단 *1~9까지 나열, \t == tap키
			} 
			System.out.println(); 
		}		
	}
	
	public static void ex04(){
		//for문 안에 조건문을 쓰지 않을 경우
		for(int i=0; ;i++)
		{
			System.out.print("a");
			if (i > 10) { //for문에 없는 조건문을 대신 써준다.
				break;
			}
		}
		System.out.println("프로그램을 종료합니다."); //aaaaaaaaaaaa프로그램을 종료합니다.
	}
}