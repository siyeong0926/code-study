package ex04_interface;

/*
 인터페이스 - 지켜야 하는 규약
 1. 모든 메서드가 public abstract(추상메서드)이므로 메서드를 정의할 때 생략 가능하다.
 2. 규약을 만드는게 목적이지, 구현하는게 목적이 아니다.
 3. JDK 1.7까지는 모두 추상메서드만 가능했었다.
 4. JDK 1.8부터 본문이 있는 default 메서드, static 메서드를 추가할 수 있다.
 	default 메서드 => 인터페이스 소스를 수정하거나 버전업할 때 사용
*/

public interface Person {	
	//interface는 모두 추상메서드여야 한다.
	//구현하면 오류남.
	void eat();
	void sleep();
	void study();
	default void work() {
		
	}
}
