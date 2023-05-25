package ex01_operators;

public class ComparisonOp {

	public static void main(String[] args) {
		//비교연산자
		
		boolean b;
		
		b = (2 == 3); //2와 3이 같은지?
		
		System.out.println(b); //false
		
		b = (2 != 3); //2와 3이 같지 않은지?
		
		System.out.println(b); //true
		
		b = !(2 == 3); //2와 3이 같은게 아닌지?
		
		System.out.println(b); //true
		
		b = (2 > 3); //2가 3보다 큰지?
		System.out.println(b); //false
		

	}

}
