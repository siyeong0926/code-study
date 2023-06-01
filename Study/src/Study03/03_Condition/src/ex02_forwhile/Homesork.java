package ex02_forwhile;

import java.util.Scanner;

public class Homesork {

	public static void main(String[] args) {
		/*
		껌:500원  과자:1500원   초콜릿:2000원    아아:2500원
		현재 용돈 15000원

		용돈이 남아 있을때까지 반복 구매를 할 수 있다.
		구매할때마다 현재 잔액을 출력하시오.
		*/
		
		//선생님풀이
		Scanner sc = new Scanner(System.in);
		
		int money = 15000;		//용돈잔액
		int choice = 0;			//구매상품번호
		int price = 0;			//구매상품가격
		String prodName = "";	//구매상품명
		
		while(true) {
			//구매를 할 수 있도록 상품 목록을 보여준다.
			System.out.println("======================= 상품목록 =======================");
			System.out.println("1.껌 500원  2.과자 1500  3.초콜릿 2000원  4.아아 2500원");
			System.out.println("========================================================");
			
			//이것을 보고 사용자는 구매 상품을 선택한다.
			System.out.print("상품번호 : ");	//상품 번호를 입력할 수 있게 지정
			choice = sc.nextInt();	//구매상품번호를 입력할 수 있게 설정
			
			switch  (choice) {	//가독성을 위해 if가 아닌 좀 더 간단한 switch로 설정
				case 1: 
					price = 500; prodName = "껌"; break;
				case 2: 
					price = 1500; prodName = "과자"; break;
				case 3: 
					price = 2000; prodName = "초콜릿"; break;
				case 4: 
					price = 2500; prodName = "아아"; break;
				default: 
					price = 0; prodName = ""; break;
			}
			
			//잔액이 구매한 상품보다 크면 구매완료하고, 금액을 차감한다.
			//잔액이 구매한 상품보다 작으면 "구매불가" 메세지를 출력한다.
			if (money < price) {
				System.out.println("잔액이 부족합니다");
				continue;	//다시 조건문으로 올라감. break는 조건문을 빠져나간다는 것과 차이	
			}
			
			System.out.printf("구매하신 %s 상품이 여기 있습니다. %d원 입니다.\n", prodName, price);	//\n으로 다시 출력되었을때 밑으로 출력
			System.out.printf("현재 잔액은 %d원 입니다.\n", money);
			money -= price;
				
			if (money < 100)	
				break;	// 판매하는 상품 중에 제일 작은 금액보다 돈이 적으면 이 반복문을 빠져나가겠다. 
		}
		
	}

	
	public static void ex01() {
		//내가 한 숙제
		//1. 간식의 이름과 가격 안내와 동시에 "구입할 간식은 무엇입니까?" 출력하기
		//2. 사용자에게 간식 이름 입력 받고,
		//   현재 용돈 15000원에서 간식에 해당하는 금액 차감해서 출력하기
		//3. 다시 1번 출력하기 => 반복문으로 설정, for문으로 if( ; ; ) 으로 반복문 지정
		//4. 더이상 구매할 수 없을 때까지 반복하고 멈추기
		//5. 남은 금액보다 큰 금액의 간식을 선택했을 경우 "잔액이 부족합니다." 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		for(int money = 15000; money >= 500; ) {	//잔액이 500원 미만이 될 때까지 반복문 설정
			System.out.println("=========간식목록=========");
			System.out.println("1. 껌 : 500원");
			System.out.println("2. 과자 : 1500원");
			System.out.println("3. 초콜릿 : 2000원");
			System.out.println("4. 아메리카노 : 2500원");
			System.out.println();
			if (money == 15000) {
				System.out.println("구입할 간식은 무엇입니까?");
				System.out.println("현재 잔액은 15000원입니다.");
			}
			else {
				System.out.println("구입할 간식은 무엇입니까?");
			}
		
			String snack = scan.nextLine();
			
			if (snack.equals("껌")) {
				if (money < 500) {	//금액을 먼저 체크하고 없으면 잔액부족이 출력되고, 있으면 돈을 차감시킨다.
					System.out.println("잔액이 부족합니다.");
				}
				else {
					money -= 500;	//money에서 500원 뺀 것을 저장시키겠다.
				}
			}
			else if (snack.equals("과자")) {
				if (money < 1500) {
					System.out.println("잔액이 부족합니다.");
				}
				else {
					money -= 1500;
				}	
			}
			else if (snack.equals("초콜릿")) {
				if (money < 2000) {
					System.out.println("잔액이 부족합니다.");
				}
				else {
					money -= 2000;
				} 			
			}
			else if (snack.equals("아메리카노")) {
				if (money < 2500) {
					System.out.println("잔액이 부족합니다.");
				}
				else {
					money -= 2500;
				}
			}
			else {	//정해진 간식 이름이 아닌 다른 문자를 입력했을 때 출력
				System.out.println("잘못 입력하셨습니다.");
			}
			
			System.out.println("남은 잔액은 " + money + "원 입니다.");
			System.out.println();
			}
		
	}
}
