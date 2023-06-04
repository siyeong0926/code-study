package ex03_etcforwhile;

public class StarTest {

	public static void main(String[] args)
	{
		int numStar = 5;	//별의 갯수가 제일 많은게 5개이기 때문

		drawStar1(numStar);	//메서드의 호출
		drawStar2(numStar);
		
	}
	//별찍기 1번; r번째 줄 c개 - 횟수가 정해져 있는 for
			/*
	*
	**
	***
	****
	*****
			 */
	public static void drawStar1(int numStar)	//위에 호출한 drawStar1(numStar); 을 받기 위해 작성
	{	
		for(int r=0; r<numStar; r++)	//r=줄의 갯수,위에서 지정한 변수 int numStar = ;에 따라서 갯수 자동변환
		{
			for(int c=0; c<=r; c++)	//뒤에 공백은 굳이 찍지 않아도 되기 때문에 <와 =이 같이 들어감
			{
				System.out.print("*");
			}
			System.out.println();	//한번 찍고 다음줄에 다시 찍어야 함.
		}
			
	}
	
	//별찍기 2번; r번째 줄 공백 c개
			/*
		    *
		   **
		  ***
		 ****
		*****
			 */
	public static void drawStar2(int numStar)
	{	//위에 호출한 drawStar2(numStar); 을 받기 위해 작성
		for(int r=0; r<numStar; r++)	//numStar에 한줄에 찍힐 최대 별의 갯수를 적어도 됨. == 5
		{
			for(int c=1; c<=5; c++)	
			{
				if (c < 5 - r)	//공백을 출력하는 식
					System.out.print(" "); //스페이스바 == 공백
				else	//공백이 아니라면 출력되는 식
					System.out.print("*");
			}
			System.out.println();	//반복문이 끝날 때마다 줄바꿈
		}
	}
}
