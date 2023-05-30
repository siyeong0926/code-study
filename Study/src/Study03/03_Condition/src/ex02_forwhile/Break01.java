package ex02_forwhile;

public class Break01 {

	public static void main(String[] args) {
	
	}
	
	public static void ex01() {
	//break문 설명
	//중첩 반복문일 때 break가 가까운 반복문 뿐만이 아니라 그 다음 반복문도 나가게 설정
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(j==3) {
					i=9; //처음 반복문에서의 조건인 ++하고 i<10를 비교하면 false가 되기 때문에 처음 반목문도 나감
					break; // j가 3이 되면 가까운 반복문을 멈추고 나감
				}
				System.out.println(i+", "+j);
			} 
		}	
	}
	
	public static void ex01_1() {
	//break문 설명
	//중첩 반복문일 때 break가 가까운 반복문 뿐만이 아니라 그 다음 반복문도 나가게 설정
	//자바는 좀더 쉽게 가능-break 라벨문

		AAA:for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				if(j==3) {
					
					break AAA; // AAA 라벨까지 반복문을 나감.
				}
				System.out.println(i+", "+j);
			} 
		}	
	}
	
}
