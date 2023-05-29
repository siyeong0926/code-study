package ex01_condition;

import javax.print.DocFlavor.STRING;

public class ScoreIf {

	public static void main(String[] args) {
		//학점을 출력
		
		int score = 86;
		
		if (score < 0 || score > 100)
		{
			System.out.println("잘못된 점수입니다.");
			return;
		}
		
		String result = ""; 
		if (score >= 90)
			result = "A";
		else if (score >= 80)
			result = "B";
		else if (score >= 70)
			result = "C";
		else if (score >= 60)
			result = "D";
		else 
			result = "F";
		System.out.println("당신은 " + result + "학점입니다.");
		
	}

}
