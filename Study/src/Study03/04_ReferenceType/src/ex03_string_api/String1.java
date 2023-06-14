package ex03_string_api;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {

		//length_trim();
		//length_char();
		//length_index();
		length_lastindex();
		
	}
	public static void length_trim()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 :");
		String name = scan.nextLine();
		name = name.trim(); //trim 함수를 사용하면 문자열 앞뒤 공백만 제거(무시)하고 출력한다. 문자열 사이의 공백은 그대로 출력.
		
		//입력한 이름이 공백이면, 이름을 입력하세요. / 글자수를 출력
		if(name.length() < 1) //글자수가 1보다 작다면
			System.out.println("이름을 입력해주세요.");
		else
			System.out.println(name.length());
	}
	
	public static void length_char()
	{
		String str = "abcd안녕하세요";	
		System.out.println(str.charAt(4)); //안	//문자열 중의 몇번째에 해당하는 문자 1개를 반환
		System.out.println(str.substring(4, 5)); //안	//substring()은 문자열만 출력을 해줌, 4번째부터 5번째까지 중에서 문자열을 가져와라.
		System.out.println(str.substring(4, 6)); //안녕	//4번째부터 6번째까지 중 문자열만 출력.
	}
	
	public static void length_index()
	{
		String str = "abcd안녕안녕하세요";
		
		//indexOf 함수는 전체 문자열 중에 찾으려는 문자열이 시작되는 번째를 int로 반환해주는데,
		//못찾으면 -1로 반환된다.
		
		/*
		int fIdex = str.indexOf("안녕");
		System.out.println(fIdex);	//4 => 전체 문자열 중에 여러번 있더라도 제일 앞에 있는 단어가 나온다.
		*/
		
		int fIdex = str.indexOf("안녕", 5);		
		System.out.println(fIdex);	//6 => "안녕"이라는 문자열을 찾는데, 5번째부터 찾아라. (==4번째부터의 안녕은 건너뜀)
		
	}
	
	public static void length_lastindex()
	{
		
	}
}
