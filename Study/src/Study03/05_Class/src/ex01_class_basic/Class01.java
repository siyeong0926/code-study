package ex01_class_basic;

public class Class01 {

	public static void main(String[] args) {
		
		Student[] stuArr = new Student[18]; //밑의 함수를 참조하는 객체변수의 배열
		
		stuArr[0].name = "김시영";
		stuArr[0].age = 30;
		stuArr[0].address = "경기도 파주시 야당동";
		stuArr[0].study();
		stuArr[0].zzz();
		
		stuArr[1].name = "김김김";
		stuArr[1].age = 27;
		stuArr[1].address = "경기도";
		stuArr[1].study();
		
		stuArr[2].name = "라라라";
		stuArr[2].age = 24;
		stuArr[2].address = "인천";
		stuArr[2].zzz();
		
		
	}
}



