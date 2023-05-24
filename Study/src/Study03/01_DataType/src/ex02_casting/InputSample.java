package ex02_casting;

import java.util.Scanner;

public class InputSample {

	public static void main(String[] args) {
		/*
		//사용자에게 입력
		Scanner scan = new Scanner(System.in);
				
		System.out.print("밥은 하루 몇번?:");				
		int eat = scan.nextInt();
				
		System.out.print("물은 하루 몇리터?:");
		double water = scan.nextDouble();
				
		System.out.print("복습은 하루 몇시간이 좋을까요?:");
		String study = scan.next();
				
		System.out.println(eat);
		System.out.println(water);
		System.out.println(study);
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("밥은 하루 몇번?:");				
		int eat = scan.nextInt();
				
		System.out.print("물은 하루 몇리터?:");
		double water = scan.nextDouble();
				
		System.out.print("복습은 하루 몇시간이 좋을까요?:");
		String study = scan.next();
				
		System.out.println(eat);
		System.out.println(water);
		System.out.println(study);
		
	}

}
