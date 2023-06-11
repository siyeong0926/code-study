package ex02_array;

import java.util.Arrays;

public class Array2Dim02 {

	public static void main(String[] args) {
		array();
		fin_array();
		array2();
	}
	
	public static void array() {
		//3월 14일 1번째 
		//2차원 함수
		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		//1~16까지 값을 차례대로 저장하세요.
		//저장된 값들을 차례대로 출력하세요.
		
		int[][] arr = new int[4][4]; //0으로 16개가 채워짐.
		
		int num = 1;
		
		for(int r=0; r<4; r++){ //행단위
			for(int c=0; c<4; c++) { //열단위
				arr[r][c] = num++; //num이라는 값을 하나씩 증가시켜라.	
			}
		}
		for(int r=0; r<4; r++) { //2차원 함수인데 밑에 있는 함수를 출력하려면 행단위로 출력하는걸로 입력을 따로 해줘야함.
			System.out.println(Arrays.toString(arr[r])); //저장된 값들을 차례대로 출력해라.
		}
	}
	
	public static void fin_array() {
		//다음과 같이 상수로 소스코드를 짜면 위에 숫자만 변경하면 된다.
		
		final int ROW_COUNT = 3;
		final int COL_COUNT = 3;
		
		int[][] arr = new int[ROW_COUNT][ROW_COUNT]; 
		
		int num = 1;
		
		for(int r=0; r<arr.length; r++){ //행단위
			for(int c=0; c<arr[r].length; c++) { //열단위
				arr[r][c] = num++; //num이라는 값을 하나씩 증가시켜라.	
			}
		}
		for(int r=0; r<arr.length; r++) { //2차원 함수인데 밑에 있는 함수를 출력하려면 행단위로 출력하는걸로 입력을 따로 해줘야함.
			System.out.println(Arrays.toString(arr[r])); //저장된 값들을 차례대로 출력해라.
		}
	}
	
	public static void array2() {
		
		int[][] arr = new int[4][4]; //0으로 16개가 채워짐.
		
		int num = 1;
		
		for(int r=0; r<4; r++){ //행단위
			for(int c=0; c<4; c++) { //열단위
				arr[r][c] = num--; //num이라는 값을 하나씩 감소시켜라.	
			}
		}
		for(int r=0; r<4; r++) { //2차원 함수인데 밑에 있는 함수를 출력하려면 행단위로 출력하는걸로 입력을 따로 해줘야함.
			System.out.println(Arrays.toString(arr[r])); //저장된 값들을 차례대로 출력해라.
		}
	}
}
