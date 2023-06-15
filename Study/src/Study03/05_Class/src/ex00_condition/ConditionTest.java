package ex00_condition;

public class ConditionTest {
	public static void main(String[] args) {
		// 1.구구단을 짝수 단만 출력
		//exam1();
		// 2.구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력
		//exam2();
		// 3. 1~100 사이의 3의 배수를 제외한 수들의 합을 출력
		//exam3();
		// 4. 다음의 배열의 요소들 중에서 홀수들의 합을 출력
		//    int[] nums = { 2, 3, 5, 6, 4, 7, 8, 12, 13, 25 };
		//exam4();
		// 5. 자신의 주민등록번호로 주민등록번호 유효성 체크
		/*
		 - 주민등록번호 알고리즘 설명 
		 ① 각 자릿수에 "2 3 4 5 6 7 - 8 9 2 3 4 5"를 각각 곱하기 (맨 마지막 자릿수 제외)
		 ② 곱한 값을 모두 더하기 
		 ③ 그 값을 11로 나눈 나머지 구하기 
		 ④ 11에서 나머지를 빼기 
		 ⑤ 만약 나머지 값이 두 자리가 나온다면, → 10으로 한 번 더 나눈 값의 나머지 이용 
		 ⑥ 그 값이 주민등록번호 맨 마지막 자릿수 값과 일치할 경우 유효한 주민등록번호임
		 */
		ConditionTest test = new ConditionTest(); //참조변수 생성
		test.exam5();
		
	}
	
	private static void exam1() {
		//첫번째 방법
		for(int dan=2; dan<10; dan+=2) { 
			for(int x=1; x<10; x++) 
			{
				System.out.printf("%d * %d = %d\t", dan, x, dan*x); //%d;정수 , %f;실수 , %s;문자열
			}
			System.out.println();
		}	
		//두번째 방법
		for(int dan=2; dan<10; dan++) { 
			if (dan % 2 == 1)
				continue; // 만약에 나눴을 때 짝수단이 아니면 밑의 반복문으로 내려가지 말고 위의 반복문으로 돌아가라.
			for(int x=1; x<10; x++) 
			{
				System.out.printf("%d * %d = %d\t", dan, x, dan*x); //%d;정수 , %f;실수 , %s;문자열
			}
			System.out.println();
		}
	}
	
	private static void exam2() {
		for(int dan=2; dan<10; dan++) { 
			for(int x=1; x<10; x++) {
				if (x > dan) 
					break; //단보다 곱하는 수가 커지면 멈춰라. 라는 뜻
				           //x_for문을 나가서 줄바꿈 실행하고 dan_for문 다시 실행
						   //continue를 사용하면 결과는 같지만, 밑의 출력만 실행하지 않고 x_for문을 끝까지 반복하고 나감.
				System.out.printf("%d * %d = %d\t", dan, x, dan*x);
			}
			System.out.println();
		}	
	}
	
	private static void exam3() {
		//합을 먼저 구하고 출력문을 생성
		//for문에 출력을 설정하면 계속 반복하기 때문
		int tot = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 ==0)
				continue;	// 3의 배수일 때는 멈추고 위의 for문으로 다시 돌아가라. 는 뜻
							// break를 쓰면 for문을 아예 나가기 때문에 다시 for문을 실행하는 continue를 사용한다. 
			tot = tot + i;
		}
		System.out.println("합은 " + tot + "입니다.");
	}
	
	private static void exam4() {
		int[] nums = { 2, 3, 5, 6, 4, 7, 8, 12, 13, 25 }; //각각의 요소를 element 라고 함.
		
		int tot = 0;
		//첫번째 방법
		for (int i=0; i<nums.length; i++)
		{
			if(nums[i] % 2 ==1)
			tot = tot += nums[i]; //nums[i]의 값이 홀수일 때에만 더해라.
		}
		System.out.println("합은 " + tot + "입니다.");
		
		//두번째 방법
		for (int i=0; i<nums.length; i++)
		{
			if(nums[i] % 2 ==0)
			continue; //nums[i]의 값이 짝수일 때에는 위의 for문으로 돌아가라.
		}
		System.out.println("합은 " + tot + "입니다.");
	}
	
	private void exam5() { //static을 삭제하면 인스턴스 메서드가 되기 때문에 호출하려면 참조변수를 먼저 생성해야한다.
		String ssn = "990926-2104347";
		
		int[] check = {2,3,4,5,6,7,0,8,9,2,3,4,5}; //곱해야하는 수를 배열에 넣는다. - 부분은 0으로 표시.
		int tot = 0;
		for (int i=0; i<check.length; i++) { 
			int temp = ssn.charAt(i) - '0'; //1.charAt로 받아온 주민번호 첫자리 char'9'에서 char'0'을 빼서 'char-char=int'로 결과를 도출한다.
			tot += temp * check[i]; //2. 위에서 int로 나온 값을 배열의 숫자와 곱해서 더한다.
		}
		int result = tot % 11; //3. 합을 11에서 나눈 나머지
		result = 11 - result; //4. 11에서 나머지를 빼기
		
		if (result >= 10)
			result = result % 10;
		
		if (result == ssn.charAt(ssn.length()-1) - '0') //마지막 인덱스"==(ssn.length()-1) - '0'"와 나머지 값이 같다면
			System.out.println("주민등록번호가 유효합니다.");
		else //마지막 인덱스와 나머지 값이 같지 않다면
			System.out.println("주민등록번호가 유효하지 않습니다.");
		
	}

}