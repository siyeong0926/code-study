package ex01_operators;

public class AssignmentOp {

	public static void main(String[] args) {
		/*
		int a = 3; //같은 데이터타입은 한줄에 선언하기도 함
		System.out.println(a);
		
		//더하기
		a +=5; //연산기호 위치 중요, a = a + 5; 와 같은 뜻, -= *= /= 등도 있음
		a = a + 1; //반복문 등에서 많이 쓰임, +1일 경우에는 a +=1;와 a++;로도 사용 가능

		a = 10;
		int b = a++;//후위형:연산후 증감수행
		System.out.printf("a:%d b:%d", a, b); //11, 10
		System.out.println();
		a = 10;
		int c = ++a; //전위형:연산전 증감수행
		System.out.printf("a:%d b:%d", a, c); //11, 11
		
		//빼기
		a = a - 1; //a -=1;, a--;와 같음
		*/
		
		int m, n;
		m = 5; 
		n = m--;
		System.out.printf("m:%d n:%d\n", m, n); //4, 5
		
		int x, z;
		x = 5; 
		z = --x;
		System.out.printf("x:%d z:%d\n", x, z); //4, 4
		
		
	}

}
