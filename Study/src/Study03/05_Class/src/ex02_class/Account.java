package ex02_class;

public class Account {
	String accNum;	//계좌번호
	String name;	//예금주명
	int money;		//잔액
	static double rate = 5.1;	//이자율, 공용이기 때문에 static 사용.
	
	
	public Account(String accNum, String name, int money) { //source에서 자동생성 가능.
		this.accNum = accNum;
		this.name = name;
		this.money = money;
	}

	//static 메서드는 static 멤버변수만 사용가능하다.
	//static 메서드는 static 메서드만 사용가능하다. (인스턴스 메서드는 사용불가)
	public static void changeRate(double rate) {
		Account.rate = rate;	//같은 클래스이기 때문에 클래스명 생략 가능하다.
	}
	
	//인스턴스 메서드는 모든 멤버변수(static 멤버 + 일반멤버)를 사용가능하다.
	//인스턴스 메서드는 모든 메서드를 다 사용가능하다.
	public void changeMoney(int inputMoney) {
		this.money = this.money + inputMoney;
		changeRate(5.3);
	}
	
	public void PrintAccount() {
		System.out.println("계좌번호:" + this.accNum);
		System.out.println("예금주명:" + this.name);
		System.out.println("잔액:" + this.money);
		System.out.println("이자율:" + this.rate);
	}
}
