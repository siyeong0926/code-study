package ex02_array;

import java.util.Arrays;

public class MainTest {
	//String[] args => main이 시작될 때 전달되는 파라미터 값들
	//명령줄 인수 command Line argument
	//전달되는 args 값에 따라서 프로그램의 진행여부를 판단
	public static void main(String[] args) { 
		/*
		if (args.length == 0)
		{
			System.out.println("파라미터를 전달해주십시오.");
			return;
		}
		else
		{
			System.out.println("args[0]");
		}
		*/
		System.out.println("프로그램 시작"); //1번째 출력
		
		String[] words = {"aaa", "bbb", "ccc"}; //printArr(String[] arr)로 이동하여 2번째 출력
		printArr(words);
		
		System.out.println("프로그램 종료"); //3번째 출력
	}
	
	public static void printArr(String[] arr) 
	{
		System.out.println(Arrays.toString(arr));
	}
}
