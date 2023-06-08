package ex01_1dim_array;

import java.util.Arrays;	//배열 관련한 유용한 메서드가 정의된 클래스

public class Array05 {

	
	public static void main(String[] args) {
		
		int[] aa = {3, 4, 5};
		
		System.out.println(Arrays.toString(aa));	//1. [3, 4, 5]
		
		chaneNumber(aa);	//참조타입 변수를 줌
		
		System.out.println(Arrays.toString(aa));	//4. [9, 10, 5]
	}	
	
	
	public static void chaneNumber(int[] zz) {	//참조타입 변수를 받음
		
		System.out.println(Arrays.toString(zz));	//2. [3, 4, 5]
		
		zz[0] = 9;
		zz[1] = 10;
		
		System.out.println(Arrays.toString(zz));	//3. [9, 10, 5]
	}
	
}
