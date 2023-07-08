package ex01_execisetest;

//자바 10장 연습문제 5번. & 오버라이딩 응용
class A {
	int a = 1; // 초기값 선언
	A() {
		System.out.println("A클래스 기본");
	}
	A(int a) {
		this.a = a;
		System.out.println("A클래스 매개변수 1개");
	}
	void printInfo() {
		System.out.println("a=" + a);
	}
}

class B extends A {
	int a = 10;
	int b = 2;
	
	/*
	컴파일러가 자동으로 해주기 때문에 생략 가능
	B() {
		super();
	}
	*/
	/*
	부모의 기본생성자가 아닌 다른 지정생성자를 호출하고 싶으면
	B() {
		super(10);
	}
	*/
	
	void onlyB() {
	}
	
	@Override // 자바에서만 생략 가능.
	void printInfo() { // print + ctrl + enter 누르면 부를 수 있음 or source > override 클릭 후 선택
		System.out.println("a=" + super.a + ", b=" + b); // 앞에 "a=" + a가 생략되어도 Override 되어서 출력된다.
		/*
		 * super로 불러내고 싶다면 
		 * super.printInfo(); 
		 * System.out.println("b=" + b);
		 */
	}
}

class C extends A {
	int c = 3;

	@Override
	void printInfo() {
		System.out.println("a=" + a + ", c=" + c);

	}
}

class D extends B {
	int d = 4;

	@Override
	void printInfo() {
		System.out.println("a=" + a + ", b=" + b + ", d=" + d);
	}
}

public class Abcd {

	public static void main(String[] args) {
		
		B cb = new B();	//"A클래스 기본" 출력
		
		// 다형성
		// 같은 메서드라도 매개변수에 전달된 실제 인스턴스 타입에 따라서
		// 각각의 재정의된 메서드가 실행된다.

		A[] arr = new A[] { new A(), new B(), new C(), new D() };

		/*
		 * A oa = new A(); 
		 * A ob = new B(); 
		 * A oc = new C(); 
		 * A od = new D();
		 * 
		 * overrideTest(new A()); //a overrideTest(new B()); //a,b 업캐스팅(자식 -> 부모)
		 * overrideTest(new C()); //a,c 업캐스팅(자식 -> 부모) overrideTest(new D()); //a,b,d
		 * 업캐스팅(자식 -> 부모)
		 */

		A a = new A();
		a.printInfo(); // a
		
		B b = new B();
		b.printInfo(); // a, b

		// Override를 한 경우, 참조변수의 참조인스턴스 타입에 정의된 메서드가 실행된다.
		// = 태생에 정의된 메서드가 실행된다.
		A a2 = b;
		a2.printInfo(); // a, b

		A aa = b; // B -> A 암시적형변환 100% 성공
		// B bb = a; //A -> B 암시적형변환 불가
		// B bb = (B)a; //A -> B 명시적형변환 컴파일은 100% 성공, 실행은 오류(비정상종료됨)

		// 부모가 자식으로 명시적형변환을 할 때에는 무조건 하지말고,
		// 먼저 명시적형변환이 가능한지 확인을 해보고 형변환 코딩을 한다.
		// instanceof는 true, false를 리턴한다.
		// a = b; 를 if문 위에 선언하면 true이기 때문에 실행된다.
		if (a instanceof B) { // a는 A에서 왔기 때문에 false로 반환된다. => 실행 X
			B bb = (B) a;
			System.out.println("이부분 실행안함");
		}
		System.out.println("명시적형변환 성공");
	}

	private static void overrideTest(A a) { // 부모타입으로 선언
		a.printInfo(); // 부모타입에 있는 printInfo를 부름, 메인함수 밑에서 다형성 정의.
	}

	// 오버로드 (=중복정의)
	private static void overrideTest(A[] arr) {
		for (A a : arr) {
			a.printInfo();	//재정의된 메서드는 호출되는 태생을 따라가서 각각 실행된다.
			
			if (a instanceof B) {	//실제 호출하는 타입이 B여야 하기 때문에 부모인 a로 받았다가 B로 다운캐스팅한다.
				B temp = (B)a;		//다운캐스팅
				temp.onlyB();
			}
		}
	}
}
