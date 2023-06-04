package ex03_etcforwhile;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		//난수(==무작위의 수)
		//java.stil.random() 
		Random rnd = new Random();	//괄호안에 숫자(==seed)를 넣을 경우 "프로그램을 껐다가 재실행"하면 같은 값이 출력됨.
									//끄지 않으면 다른 값 출력됨.
		
		//1~46의 난수 6개를 뽑아보시오.
		//나온 숫자가 맘에 안들수도 있으니 5개의 경우의 수로 출력하시오.
		for(int k=0; k<5; k++)	//5개의 경우의 수
		{
			for(int i=0; i<6; i++)	//난수 6개 뽑기
			{
				int iVal =  rnd.nextInt(46) + 1;	//0 <= iVal < 46
				//난수가 출력되게 설정
				System.out.print(iVal + "\t");
			}
			System.out.println();
		}
	}

}
