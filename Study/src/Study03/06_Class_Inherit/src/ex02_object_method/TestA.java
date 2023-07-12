package ex02_object_method;

class A {	//외부클래스
	
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();	//Object의 생성자를 부르기 때문에 생략 가능.
		this.name = name;
		this.age = age;
	}
	 
	//toString()
	//Object 클래스에서 상속받은 toString()은 참조타입@해쉬코드이지만,
	//자식 클래스에서 Override 해서 원하는 결과를 문자열로 반환하도록 재정의 할 수 있다.
	//참조타입을 String으로 형변환 하는 경우에도 toString() 사용
	@Override
	public String toString() {	//toSt 작성하고 ctrl + space 입력해서 불러오기
		return "이름:" + this.name + ", 나이:" + this.age ;
	}
	
	//equals()
	//Object 클래스에서 상속받은 equals()은 참조주소값이 같은지 안같은지를 비교해서 true/false로 반환
	//자식 클래스에서 Override 해서 멤버의 값을 비교해서 true/false로 반환하도록 재정의 할 수 있다.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {	//몀시적형변환이 실행시 오류가 날 수 있기 때문에 설정.
			Person other = (Person)obj;	//명시적형변환
			if (this.name.equals(other.name) && this.age == other.age)	//문자열 비교는 ==을 사용할 수 없음, int는 사용 가능.
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	//hashCode()
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.age;	//이름과 나이까지 같은지를 확인
	}
	
}

public class TestA {

	public static void main(String[] args) {	//메인클래스
		
		//기본타입인 i는 참조타입이 아니고 값타입이기 때문에 Object를 상속받지 않는다.
		int i = 10; 
		
		//모든 배열은 다 참조타입이므로 Object를 상속받는다. 
		int[] nums = {1, 2, 3, 4, 5};
		
		//모든 참조타입은 Object를 상속받는다.
		A a = new A();
		A a2 = new A();
		A a3 = a;
		
		//print() 메서드들은 참조타입의 toString()를 호출한다.
		//toString() : 참조변수의 타입@해쉬코드
		System.out.println(a);				//A@6f2b958e
		System.out.println(a2);				//A@5e91993f
		System.out.println(a3);				//A@6f2b958e
		System.out.println(a.toString());	//A@6f2b958e
		
		Person p1 = new Person("홍홍홍", 25);
		Person p2 = new Person("박박박", 35);
		
		System.out.println(p1);	//Person@379619aa	//toString()을 Override 후 >> 이름:홍홍홍, 나이:25
		System.out.println(p2);	//Person@cac736f	//toString()을 Override 후 >> 이름:박박박, 나이:35
		
		
		//문자열로 출력
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		//--------------------------------------------------------------------까지 toString()의 예시
		
		
		// == 연산자는 같은 객체를 참조하는지(참조주소값이 같은지)를 비교
		// == 연산자는 new 할때마다 다른 값을 갖는다.
		if (str1 == str2) {		 //false
			System.out.println("String ==");
		}
		// String 클래스의 equals()는 객체의 값이 같은지를 비교
		// Object를 재정의함.
		if (str1.equals(str2)) { //true
			System.out.println("String equals");
		}
		
		// Object의 equals()는 == 연산자와 동일
		// 참조주소값이 같은지를 비교
		Person p3 = new Person("김연아", 30);
		Person p4 = new Person("김연아", 30);
		if (p3 == p4) {			//false	 
			System.out.println("Person ==");
		}
		if (p3.equals(p4)) {	//false		//equals()를 Override 후 >> true
			System.out.println("Person equals");
		}
		//----------------------------------------------------------------------까지 equals()의 예시
		
		//hashCode()의 값이 동일하다.
		//String은 hashCode()라는 메서드의 문자열이 같으면 같은 값이 나오도록 재정의가 이미 된것.
		System.out.println(str1.hashCode());	//1611021
		System.out.println(str2.hashCode());	//1611021
		
		//hashCode()의 값이 동일하지 않다.
		//Person은 hashCode()라는 메서드를 재정의하지 않아서, Object에 정의된대로 객체를 생성할 때마다 다른 값을 반환
		//hashCode()를 Override하면 같은 값으로 반환됨
		System.out.println(p3.hashCode());	//932583850		//hashCode()를 Override 후 >> 44489650
		System.out.println(p4.hashCode());	//212628335		//hashCode()를 Override 후 >> 44489650
		
		//hashCode()는 코딩에서 직접 호출할 경우는 없지만,
		//객체가 같은지 안같은지를 판단하는 경우(ex. 컬렉션, 제네릭) 내부적으로 호출된다.
		
		//사용자정의 클래스에서 equals(), hashcode()를 같이 재정의 하는 것을 권장

	}
	
}


