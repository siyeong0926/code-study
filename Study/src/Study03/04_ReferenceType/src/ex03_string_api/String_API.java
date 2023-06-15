package ex03_string_api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class String_API {

	static Scanner scan = new Scanner(System.in); // 6개의 메서드에서 모두 사용하려면 메인 메서드 위에 써야함
	static Random rnd = new Random(); //난수를 뽑을 준비가 되어있다는 뜻
	
	public static void main(String[] args) {
		// 1. 사용자에게 Email을 입력받고 유효한 형식인지 아닌지 출력하시오.
		// 정규표현식 사용하지 않고 메서드를 이용한다.
		// @앞에 문자가 1개 이상이 있어야 하고
		// .앞에 문자가 1개 이상이 있어야 한다.
		quiz1();

		// 2. 주민등록번호를 입력받고, 출생년월일과 성별을 출력하시오.
		quiz2();

		// 3. 사용자가 파일을 업로드했을때, 업로드한 파일의 파일명을 출력하고,
		// 확장자가 exe 파일인 경우 업로드 불가 메세지를 출력하시오.
		// 예) C:\Users\GDC 10\Pictures\PBY.jfif
		quiz3();

		// 4. 주문번호가 오늘의 15번째인 경우에 적합한 주문번호를 출력하시오.
		// 예) 2023031500015
		quiz4();

		// 5. 신규비밀번호를 위해서 난수(영문대문자 + 숫자) 8자리를 생성하여 출력하시오.
		quiz5();
	}

	private static void quiz5() {
		// 숫자(0~9) 영어대문자(10~35) 영어소문자(36~61) ; 0~61
		// (대문자A의 아스키코드)65 => +55
		// (소문자a의 아스키코드)97 => +61
		StringBuilder pwd = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			int temp = rnd.nextInt(0, 62);
			if (temp < 10)
				pwd.append(String.valueOf(temp)); // 누적을 위해 복합연산인 += 써준다, int인 temp를 문자열로 바꿔주기 위해 String.valueOf()으로 형변환
			else if (temp < 36)
				pwd.append((char) (temp + 55)); // 대문자 출력
			else
				pwd.append((char) (temp + 61)); // 소문자 출력
		}
		System.out.println("신규 비밀번호는 " + pwd.toString() + " 입니다.");
	}

	private static void quiz4() {
		//첫번째 방법
		//LocalDate를 문자열로 변환하고 replace()로 -을 삭제
		//String date = String.valueOf(LocalDate.now()).replace("-", "");
		//System.out.println(date);
		
		//두번째 방법
		//LocalDate를 문자열로 변환할 때 포맷(yyyyMMdd)을 적용한다.
		DateTimeFormatter formmater = DateTimeFormatter.ofPattern("yyyyMMdd");
		String today = LocalDate.now().format(formmater);
		
		//현재 주문은 15번째라는 가정
		int maxNum = 15; 
		//maxNum이라는걸 문자열로 표현하는데 총 5자리로 표현된다. 
		//빈칸은 공백으로 나옴
		//replace를 넣음으로 공백을 0으로 표시되게 설정한다.
		String seqno = String.format("%5s", maxNum).replace(" ", "0"); 
		
		String orderNo = today.concat(seqno); //.concat()==더하는 함수
		
		
		System.out.println("신규주문번호 " + orderNo);
	}

	private static void quiz3() {
		System.out.print("업로드파일: ");
		String upload = scan.nextLine(); //C:\Users\GD\Downloads\HMH.jfif

		int idx = upload.lastIndexOf("\\"); // "\" 찾기
		String filename = upload.substring(idx+1); //위에서 찾은곳에서 +1 더한곳부터, == HMH.jfif
		
		String ext = filename.substring(filename.lastIndexOf(".") + 1); // == .jfif
		
		if (ext.equalsIgnoreCase("exe")) //대소문자 비교 없이 문자열만 비교함
			System.out.println("해당 파일은 업로드 할 수 없습니다.");
		else
			System.out.println(filename + "이 업로드 되었습니다.");
	}

	private static void quiz2() {
		System.out.print("주민등록번호: ");
		String jumin = scan.nextLine(); // 990926-2123456 또는 9909262123456
		jumin.replace("-", ""); // 990926-2123456를 9909262123456로 바꿔라. == 숫자만 13자리로

		// 주민번호의 길이가 13자리가 아니면 밑이 다 실행되지 않게 설정하기
		// replace 뒤에 설정
		if (jumin.length() != 13) {
			System.out.println("올바른 주민등록번호가 아닙니다. 다시 입력해주세요.");
			return; // 13자리가 안되면 입력이 안되고 나갈 수 있게 설정
		}

		String year, month, day, gender; // 선언, 이제 밑에서 변수에 값을 할당시켜야 한다.

		// 연도 설정
		String temp = jumin.substring(6, 7); // 6번째부터 7보다 작은번째까지 / 1,3,2,4
		year = "19"; // 기본값을 1900년대생으로 설정

		if (temp.equals("3") || temp.equals("4") || temp.equals("7") || temp.equals("8")) // 그 중에서 3,4,7,8번째는 2000년대생
			year = "20" + jumin.substring(0, 2);

		year += jumin.substring(0, 2); // 0,1번째
		month = jumin.substring(2, 4); // 2,3번째
		day = jumin.substring(4, 6); // 4,5번째

		// 성별설정_삼학연산자 사용
		gender = (Integer.parseInt(temp) % 2 == 1) ? "남자" : "여자";

		System.out.printf("%s년 %s월 %s일 성별:%s\n", year, month, day, gender);
	}

	private static void quiz1() {
		System.out.print("Email : "); // 사용자에게 이메일을 입력 받아라
		String email = scan.nextLine(); // 사용자에게 이메일을 입력 받아라
										// 사용자가 adc@def.com 이라고 입력했다면, @다음부터 .을 찾으면 된다

		boolean flag = true; // 이메일이 유효하면 true, 그렇지 않으면 false

		// 유효성 검사 시작 , 유효하지 않은 것부터 체크하는게 좋다.

		// @가 없으면 == 잘못된 것
		if (!email.contains("@"))
			flag = false;
		// 0이면 제일 앞에, -1이면 @가 없다는 것. == 잘못된 것
		if (email.indexOf("@") < 1)
			flag = false;

		// @부터 자른 인덱스부터 뒤에 .이 0이면 제일 앞에, -1이면 .가 없다는 것. == 잘못된 것
		else if (email.substring(email.indexOf("@")).indexOf(".") < 1)
			flag = false;

		// 위의 boolean 함수 유효성 여부 출력
		if (flag)
			System.out.println("유효한 이메일입니다.");
		else
			System.out.println("이메일 형식이 유효하지 않습니다.");
	}

}
