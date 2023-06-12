package ex02_array;

import java.util.Arrays;

public class ArrayInt {

	public static void main(String[] args) {
		
		/*
		//첫번째 방법
		int[] arr = new int[] {10, 20, 30, 40, 50, 0, 0, 0, 0, 0}; //앞 5개는 초기값 부여, 뒤 5개는 기본값 부여.
		*/
		
		//두번째 방법
		int[] arr = new int[10];
		for(int i=0;i<5;i++)
		{
			arr[i] = (i+1)*10;
		}
		System.out.println(Arrays.toString(arr));
	}
}
