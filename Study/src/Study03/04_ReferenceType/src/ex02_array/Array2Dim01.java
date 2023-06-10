package ex02_array;

public class Array2Dim01 {

	public static void main(String[] args) {
		int[][] scores = { // 3행 5열
				{ 80, 50, 60, 90, 88 }, // 국어
				{ 70, 80, 50, 80, 90 }, // 영어
				{ 90, 30, 50, 40, 80 } // 수학
		};

		// 국어점수의 합계?
		int kor_tot = 0;
		for (int i = 0; i < scores[0].length; i++) // 0번째 행인 국어점수
		{
			kor_tot += scores[0][i];
		}
		// 수학점수의 합계?
		int math_tot = 0;
		for (int i = 0; i < scores[2].length; i++) // 2번째 행인 수학점수
		{
			math_tot += scores[2][i];
		}
		// 전체점수의 합계?
		int tot = 0;
		for (int r = 0; r < scores.length; r++) {
			for (int i = 0; i < scores[r].length; i++) {
				tot += scores[r][i];
			}
		}
		System.out.println(tot); //1028
		
		//전체점수의 합계를 향상된 for문으로 작성
		tot = 0;
		for(int[] jumsu : scores) {
			for (int su : jumsu)
			{
				tot += su;
			}
		}
		System.out.println(tot); //1028
		
		//2차배열의 length는 Row의 수
		//score[0].length는 0번째 행의 Column의 수		
	}
}
