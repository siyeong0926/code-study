package ex01_class_basic;

public class Student {
	
	public String name; // Field ; 속성(클래스의 특징)
	public int age;
	public String address;
	
	
	
	//생성자 ; 무조건 클래스의 생성자가 정의 되어야만, 다른쪽에서 new(객체생성) 할 수 있다.
	//당연하기 때문에 생성자를 정의하지 않으면 컴파일러가 자동으로 기본생성자를 추가해준다.
	//기본생성자 ; 구현 코드가 하나도 없고, 파라미터도 없다.
	//아무것도 쓰지 않았을 뿐이지, 중괄호가 있으면 이미 메서드가 정의된 것이다.
	//public Student() {}
	// => 생성자가 정의되었기 때문에 다른쪽에서 new Student를 사용할 수 있다.
	// ex) ex01_class_basic_test > Class01_Test 에서 확인
	
	public Student() {
		name = "홍길동";
		age = 19;
		address = "서울시";
	}
	
	
	
	public Student(String name, int age, String address) { //클래스의 생성자
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void study() { // Method ; 기능(처리)
		System.out.println("복습한다.");
		System.out.println("예습한다.");
		System.out.println("과제한다.");
	}

	public void zzz() {
		System.out.println("쿨쿨");
	}
	
	class Exam //inner class ; 클래스 안에 클래스가 있는 경우
	{
		
	}

}
