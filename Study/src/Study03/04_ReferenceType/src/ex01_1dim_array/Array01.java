package ex01_1dim_array;

public class Array01 {

	public static void main(String[] args) {
		int[] arr;	//배열 선언
		arr = new int[5];	//배열 생성
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.printf(arr[i] + "  ");
		}
		System.out.println();
		
		int[] nums = {1, 2, 3, 4, 5};	//배열선언과 동시에 생성(초기화==초기값을 미리 생성)
		
		for(int i=0; i<nums.length; i++)
		{
			System.out.println(nums[i] + "  ");
		}
		System.out.println();
	}
}
