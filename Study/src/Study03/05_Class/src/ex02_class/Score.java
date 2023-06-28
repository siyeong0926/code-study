package ex02_class;

public class Score {
	private int kor;
	private int eng;
	private int math;

	// 오른쪽 클릭 > source > Generate Getters and Setters 클릭하면 자동으로 생성.
	// 이 클래스 뿐만이 아니라 public 을 작성함으로서 다른 클래스나 다른 프로젝트에서도 사용 가능.
	public int getKor() {
		return kor;	//값을 읽기 때문에 매개변수가 없어서 그냥 name만 써도 됨.
	}
	public void setKor(int kor) {
		this.kor = kor;	//값을 쓰기 때문에 매개변수가 있어서 name과 this.name을 구분해야함.
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

}
