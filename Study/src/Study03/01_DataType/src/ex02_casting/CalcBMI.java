package ex02_casting;

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		//프로그램을 코딩하는 순서
		//1. 입력 : 사용자에게 입력을 받음
		//2. 유효성체크 : 입력값에 대한 유효성을 체크 -> 콘솔창에서 입력하여 체크
		//3. 처리 : 메서드만의 기능을 구현
		//4. 출력 : 사용자에게 결과를 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("================== BMI 지수 ==================");
		//입력받는부분
		System.out.print(">키(cm):");
		double m = sc.nextInt() * 0.01; // 단위환산을 * 하기 때문에 별도의 형변환 필요 없음.
		System.out.println(); //한줄 띄어쓰기

		System.out.print(">체중(kg):");
		double kg = sc.nextDouble();
		System.out.println(); //한줄 띄어쓰기
		//처리하는부분
		double bmi = kg / (m * m);

		String result = ""; //처리부와 출력부를 구분하기 위해 sysout을 중간중간에 넣지 않는다.
		if (bmi <= 18.5)
			result = "저체중";
		else if (bmi <= 22.9)
			result = "정상";
		else if (bmi <= 24.9)
			result = "과체중";
		else
			result = "비만";
		
		System.out.printf("> 당신의 BMI지수는 %.2f 으로 %s 입니다.\n", bmi, result);
		System.out.println("==============================================");

		
	}

}