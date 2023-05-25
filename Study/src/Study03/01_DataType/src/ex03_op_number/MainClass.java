package ex03_op_number;

public class MainClass {
	public static void main(String[] args)
	{
		int a = 5;
		int b = 2;
		
		int div = a / b; //몫
		int mod = a % b; //나머지
	
		int add = a+b;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println((double)a / b); //2.5
		
		System.out.println("몫은 " + div + "이고, 나머지는 " + mod + "입니다.");
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.\n", div, mod);
		
		//250초를 몇분 몇초로 출력하시오. - 4분 10초
		int c = 4;
		int d = 10;
		
		System.out.println(c + "분 " + d + "초 입니다.");
	
		int second = 250;
		
		int min = second / 60; //분_몫
		int sec = second % 60; //초_나머지
		System.out.printf("%d분 %d초 입니다.\n", min, sec);
	}

}
