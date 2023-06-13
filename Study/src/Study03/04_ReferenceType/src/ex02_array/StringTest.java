package ex02_array;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "Hello"; //문자열 리터럴
		String str2 = new String("Hello"); //문자열 객체
		String str3 = "Hello"; //문자열 리터럴
		String str4 = new String("Hello"); //문자열 객체
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		
		//문자열 리터럴은 String constant Pool로 관리가 되기 때문에
		//같은 문자열은 또 생성되지 않고, 기존에 생성된 참조값을 공유
		//같은 참조값을 갖는다.
		if(str1 == str3)
			System.out.println("str1 == str3");
		
		//문자열 객체는 new 할때마다 새롭게 인스턴스가 생성되므로
		//같은 문자열이라도 각기 다른 인스턴스이다.
		//참조값이 모두 다르다.
		if(str2 != str4)
			System.out.println("str2 != str4");
		
		//문자열 객체와 문자열 리터럴은 서로 다른 참조값을 갖는다.
		if(str1 != str2)
			System.out.println("str1 != str2");
		
	}

}
