package ex01_1dim_array;

public class Array06 {

	public static void main(String[] args) {
		int[] jumsu = {50, 90, 60, 100, 80};
		
		int tot = 0;
		for(int num : jumsu)
		{
			tot += num;	//인덱스가 아니라 값을 꺼내서 줌
		}
		System.out.println(tot); 
		
		/*
		for(int i=0; i<jumsu.length; i++)
		{
			tot += jumsu[i]; //인덱스를 꺼내서 줌
		}
		System.out.println(tot); 
		*/
	}

}
