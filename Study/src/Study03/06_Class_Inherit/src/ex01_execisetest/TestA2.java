package ex01_execisetest;

public class TestA2 {
	//자바 9장 연습문제 5,6번
	int a = 2;	//멤버필드를 선언할 때 주는 초기값 => 모든 인스턴스가 동일
	int c = 5;
	static int b = 3;
	
	static {	//static int b = 3; 대신에 좀 더 복잡한 코드(조건, 반복문)가 온다면 블럭으로 사용 가능.
		b = 100;
	}

	public TestA2() {	//생성자를 추가하면 기본생성자는 생기지 않기 때문에 기본생성자도 정의해준다.
		
	}
	
	public TestA2(int a, int c) {	//생성자를 추가한다.
		this.a = a;
		this.c = c;
	}
	
	public TestA2(int a, int c, int b) {	//생성자를 추가하여 초기값을 내가 줄 수 있게 설정.
		this.a = a;
		this.c = c;
		this.b = b;	//기본생성자의 static멤버도 초기값을 줄 수 있다.
	}
	
	void abc() {
		System.out.println(a);
		System.out.println(b);
	}

	static void bcd() {
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		TestA2 a = new TestA2();
		a.a = 10;
		System.out.println(a.a);
		System.out.println(a.c);
		System.out.println(a.b);		//100
		System.out.println(TestA2.b);	//100
		
		TestA2 a2 = new TestA2();
		a2.a = 20;
		System.out.println(a2.a);
		System.out.println(a2.c);
		
		//생성할 때마다 서로 다른 값으로 멤버속성(필드)에 초기값을 줄 수 있다.
		TestA2 a3 = new TestA2(30, 40);	//내가 주고 싶은 값으로 셋팅
		System.out.println(a3.a);
		System.out.println(a3.c);
		
		TestA2 a4 = new TestA2(10, 20, 30);	//내가 주고 싶은 값으로 셋팅
		TestA2 a5 = new TestA2(60, 50, 40);	//내가 주고 싶은 값으로 셋팅
		
		System.out.println(a4.a);	 //10
		System.out.println(a4.c);	 //20
		System.out.println(a4.b);	 //40
		
		System.out.println(a5.a);	 //60
		System.out.println(a5.c);  	 //50
		System.out.println(a5.b); 	 //40
	}
}
