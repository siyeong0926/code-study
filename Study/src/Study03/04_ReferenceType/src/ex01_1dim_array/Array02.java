package ex01_1dim_array;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// 평균, 총점, 최고점, 최저점을 구하시오. {80, 61, 90, 95, 50}
		int[] scores = new int[5]; //{80, 61, 90, 95, 50};	//배열선언과 동시에 생성(초기화==초기값을 미리 생성)
		
		Scanner scan = new Scanner(System.in);
		
		//값을 저장
		for(int i=0; i<scores.length; i++)
	    {
			System.out.print("점수입력 : ");
	    	scores[i] = scan.nextInt();
	    }
		
		//값을 읽음
	    int tot = scores[0];
	    int min = scores[0];
	    int max = scores[0];
	    
	    for(int i=1; i<scores.length; i++)
	    {
	    	tot += scores[i];	//총점
	    	
	    	if (min > scores[i])
	    		min = scores[i];	//최저점 찾기
	    	
	    	if (max < scores[i])
	    		max = scores[i];	//최고점 찾기
	    }
	    double avg = tot / 5.0;	//평균
	    
	    System.out.printf("총점:%d, 평균:%.2f\n, 최고점:%d, 최저점:%d", tot, avg, min, max);
	}
}
