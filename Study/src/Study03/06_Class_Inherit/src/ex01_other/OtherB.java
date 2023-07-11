package ex01_other;

class BB extends ex01_execisetest.PA { // 'ex01_other' 패키지에 있는 'BB'는 'ex01_execisetest' 패키지에 있는 'PA'에서 상속받는다.
	int b = 2;

	void abc() { // 상속받은 클래스 내에서는 a도 가능
		System.out.println(a); // 1
		System.out.println(b); // 2
	}
}

public class OtherB { // OtherB는 PA를 상속받지 않았기 때문에 a 별도로 사용 불가.

	public static void main(String[] args) {
		BB b = new BB();
		b.abc();
	}

}
