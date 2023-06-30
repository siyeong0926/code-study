package ex02_class_test;

import ex02_class.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account.changeRate(5.5);	//클래스명.정적메서드() 호출
		
		Account ac1 = new Account("11111", "홍길동", 10000);
		ac1.PrintAccount();
		
		Account ac2 = new Account("22222", "김우빈", 50000);
	
		ac2.changeRate(8.2);	//참조변수명.정적메서스() 호출
								//이자율 변경 =>static(공유)
		ac2.changeMoney(2000000);	//잔액 추가	=>인스턴스(개별)
		
		ac2.PrintAccount();
		ac1.PrintAccount();	//이자율을 ac2만 변경했는데 ac1도 같이 변경되어 있음 => static이기 때문에 공유된다.
	}

}
