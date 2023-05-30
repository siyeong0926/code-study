package ex02_forwhile;

public class Continue01 {

	public static void main(String[] args) {
			ex02();
	}
	public static void ex01() {
		// 1~50 사이의 수 중에서 4의 배수를 제외하고 출력하시오.
		for(int i=1; i<51; i++){
			
				if(i % 4 == 0) {
					continue; // 4로 나눴을 때 0이 되는 수가 나오면 밑의 출력을 실행하지 않고 다시 반복문으로 돌아감
				}
				System.out.print(i+", ");
			
		}
	}

	public static void ex02() {
		// 1~100 사이의 수 중에서 5의 배수의 합을 구하시오.
		int tot = 0;
		for(int i=1; i<101; i++) {
			if(i % 5 == 0) {
				tot += i;
			}
		}	
		System.out.print(tot);
	}
	
	public static void ex02_1() {
		// 1~100 사이의 수 중에서 5의 배수의 합을 구하시오.	
		//continue를 이용하여 더 쉽게 작성
		int tot = 0;
		for(int i=1; i<101; i++){
			if(i % 5 != 0) {
				continue;	
			}
			tot += i;
		}	
		System.out.print(tot);
	}

	public static void ex03() {
		// 1~100 사이의 수 중에서 3과 5의 배수가 아닌 수들의 합을 구하시오.
		int sum = 0;
		for(int i=1; i<101; i++){
			if(i % 3 == 0 || i % 5 == 0) {
				continue;	
			}
			sum += i;
		}	
		System.out.print(sum);
	}
}