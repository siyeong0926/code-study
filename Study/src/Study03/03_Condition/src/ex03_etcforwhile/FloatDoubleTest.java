package ex03_etcforwhile;

public class FloatDoubleTest {

	public static void main(String[] args) {
		
		//실수에서 계산을 하게 되면 부동소숫점의 오차가 발생할 수 있기 때문에
		//정수로 만들어서 계산하고 출력을 할 때 다시 실수로 만든다.
		//또는 고정소숫점 방식으로 계산한다.
		//하지만 정수로 만들어서 계산하는게 더 정확하다.
		
		
		//1. float변수를 0.0으로 정의하고, 0.1씩 10번 누적을 하시오. == 1.0
		float f= 0.0f;	//실수는 double이기 때문에 형변환해준다.
		
		for(int i=0; i<10; i++)	
		{
			f += 0.1f;
		}	
		System.out.println(f);	//1.0000001 =>부동소숫점 오차, float은 소숫점 7번째에서 오차가 발생
		System.out.printf("%.1f\n", f);	//1.0
		
		//2. double변수를 0.0으로 정의하고, 0.1씩 10번 누적을 하시오. == 1.0
		double d= 0.0;	//별도의 형변환 필요 없음
		
		for(int i=0; i<10; i++)	
		{
			d += 0.1;
		}	
		System.out.println(d);	//0.9999999999999999 =>부동소숫점 오차, double은 소숫점 14번째에서 오차가 발생, float보다 정확
		System.out.printf("%.1f\n", d);	//1.0
	}

}
