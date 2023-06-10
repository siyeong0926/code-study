package ex01_1dim_array;

public class String01 {	//String == 참조타입

	public static void main(String[] args) {
		String str = "Hello";
		changeStr(str);
		System.out.println(str); //2-1. Hello => 일반적인 참조타입이라면 World가 출력되야함.
								 //String은 참조타입의 이단아. 불변타입이라 같이 가리킨건 맞지만, 수정이 안된다.
								 //참조타입을 공부할 때, String으로 공부하면 안된다.
		
//		int num = 10;	//int는 기본타입이라 값이 출력
//		plusNum(num);		
//		System.out.println(num); //2. 10
	}

	public static void changeStr(String str)
	{
		str = "World";
		System.out.println(str); //1-1. World
	}
	
	public static void plusNum(int su)
	{
//		su += 10;
//		System.out.println(su);	//1. 20
	}
	
}
