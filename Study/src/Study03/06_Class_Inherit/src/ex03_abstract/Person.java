package ex03_abstract;

/*
 추상클래스 - abstract
 1. 추상메서드를 1개 이상 가진 클래스
 2. 추상클래스를 상속받은 자식클래스는 반드시 모든 추상메서드를 재정의 해야만 한다.(필수)
 3. 추상클래스는 아직 미완성된 클래스이므로 객체생성( == new 클래스명())을 할 수 없다.
 4. 클래스 설계단계에서 최상위 클래스에 위치한다.
    but, 추상클래스 위에 부모 추상클래스가 위치할 수는 있다.
 
 추상메서드 - abstract
 1. 본문( == {})이 없이 세미콜론으로 끝난 메서드 => 미완성 메서드
 2. 그렇기 때문에 무조건 Override(재정의)를 해야한다.
*/

public abstract class Person {	// 추상메서드가 있으면 추상클래스로 설정
	String name;
	
	public void eat() {
		System.out.println("먹는다.");
	}	
	
	public void sleep() {
		System.out.println("잠을 잔다.");
	}
	
	public abstract void study();	//추상메서드(=abstract)
}
