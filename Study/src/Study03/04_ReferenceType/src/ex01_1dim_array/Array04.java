package ex01_1dim_array;

public class Array04 {

	public static void main(String[] args) {
		
		//참조자료형
		int [] aa = {3, 4, 5};
		int [] bb = aa;	//참조타입은 참조값을 전달 => 같은 인스턴스를 참조하게 됨, 수정을 하게 되면 같이 영향을 받음.
		//얕은복사 (<->깊은복사)
		
		bb[0]=7;

		System.out.println(aa[0]);
		System.out.println(bb[0]);	//aa[0]=7, bb[0]=7
		
		
		//기본자료형
		int a = 3;
		int b = a;	
		
		b=7;
		
		System.out.println(a);
		System.out.println(b);	//a=3, b=7
	}

}
