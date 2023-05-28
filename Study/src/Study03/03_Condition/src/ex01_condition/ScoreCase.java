package ex01_condition;

import javax.print.DocFlavor.STRING;

public class ScoreCase {

	public static void main(String[] args) {
		//학점을 출력
		
		int score = 86;
		
		if (score < 0 || score > 100)
		{
			System.out.println("잘못된 점수입니다.");
			return;
		}
		
		String result = ""; 
		switch(score/10) //if처럼 조건을 못쓰기 때문에 /10 해주고 일의 자리까지 계산
		{
			case 10:
				//9와 결과가 똑같기 때문에 굳이 result와 break를 적지 않는다. 밑에서 걸림.
			case 9:
				result = "A";
				break;//실행하고 switch가 끝나는 부분으로 이동, 다른 case를 실행하지 않음.
			case 8:
				result = "B";
				break;
			case 7:
				result = "C";
				break;
			case 6:
				result = "D";
				break;
			default:
				result = "F";
				break;
		}
		System.out.println("당신은 " + result + "학점입니다.");
		
	}

}
