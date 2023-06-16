package ex01_class_basic;

public class CalcSum {
	
	//메서드를 중복정의(같은 이름의 메서드를 여러개 정의)
	//메서드 시그니처(메서드를 컴파일러가 구분하는 기준) ; 이름, 매개변수 갯수, 매개변수 타입, 매개변수 순서
	// => 리턴(반환)타입은 제외 
	//매개변수의 갯수와 타입에서 차이가 있다면 별도의 메서드를 만들어야 하지만
	//매개변수의 이름에서 차이가 있다면 별도의 메서드를 만들면 안된다._컴파일러가 이름을 판단하지 못해서 호출할 메서드를 찾지 못함.
	
	public int plus(int... nums) {	//nums == 배열
		int tot = 0;
		for(int i=0; i<nums.length; i++)
		{
			tot += nums[i];
		}
		return tot;
	}
	
	/*
	public int plus(int[] nums) {
		int tot = 0;
		for(int i=0; i<nums.length; i++)
		{
			tot += nums[i];
		}
		return tot;
	}
	*/
	
	//int 2개
	public int plus(int x, int y) {
		return x + y;
	}
	
	//int 3개
	public int plus(int x, int y, int z) {
		return x + y + z;
	}
	
	//double 2개
	public double plus(double x, double y) {
		return x + y;
	}
	
	//1. from_to
	public int sum(int from, int to) { //출력에 따라 값이 달라지게 매개변수를 능동적으로 설정.
		int tot = 0;
		for(int i=from; i<=to; i++)
		{
			tot = tot + i;
		}
		return tot;
	}
	
	//2. from_to_num
	//2. 메서드의 중복정의 가능
	public int sum(int from, int to, int num) { //sum이라는 메서드는 동일해도 매개변수 갯수에서 차이가 나면 메서드를 별도로 만들 수 있다.
		int tot = 0;
		for(int i=from; i<=to; i++)
		{
			if(i % num == 0) //num ; 배수 설정
			tot = tot + i;
		}
		return tot;
	}
	
	//3. 메서드의 중복정의 가능
	public int sum(double from, int to) { //sum이라는 메서드는 동일해도 매개변수 타입에서 차이가 나면 메서드를 별도로 만들 수 있다.
		int tot = 0;
		for(int i=(int)from; i<=to; i++)
		{
			tot = tot + i;
		}
		return tot;
	}
	
	
}
