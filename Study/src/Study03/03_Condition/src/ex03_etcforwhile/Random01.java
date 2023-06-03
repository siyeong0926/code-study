package ex03_etcforwhile;

public class Random01 {

	public static void main(String[] args) {
		//난수(==무작위의 수)
		//무작위 반복문에서 실행될 때 마다 달라지는 조건은 '시간'밖에 없음
		//시간으로 조건 설정해서 다 다른값이 출력되게 하기
		//(java.lang.)Math.random() => 괄호는 생략 가능, 현재 시간을 seed로 사용하도록 내부 코딩이 되어있다.
		
		//난수 출력하기
		//5번 반복하겠다고 설정
		for(int i=0; i<5; i++)
		{
			//난수가 나오게 설정
			double dVal = Math.random();
			//난수가 출력되게 설정
			System.out.println(dVal);
		}
		
		//1~46의 난수 6개를 뽑아보시오.
		//나온 숫자가 맘에 안들수도 있으니 5개의 경우의 수로 출력하시오.
		for(int k=0; k<5; k++)	//5개의 경우의 수
		{
			for(int i=0; i<6; i++)	//난수 6개 뽑기
			{
				//난수가 나오게 설정
				double dVal = Math.random();	//난수를 가지고 올 때는 실수로
				int iVal = (int)(dVal * 46 + 1);	//형변환
				//난수가 출력되게 설정
				System.out.print(iVal + "\t");
			}
			System.out.println();
		}
	}

}
