package ex01_execisetest;

public class TestA {
	//자바 9장 연습문제 4번
	int a = 2;
	static int b = 3;

	void abc() {
		System.out.println(a);
		System.out.println(b);
	}

	static void bcd() {
		//System.out.println(a); => static이 일반 멤버를 그냥 부를 수 없다.
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		bcd();
		
		//일반멤버를 부르고 싶다면 인스턴스를 넣으면 된다.
		TestA2 a = new TestA2();
		a.abc();
	}
} 