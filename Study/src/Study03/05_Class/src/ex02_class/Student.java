package ex02_class;

public class Student {
	private String stuNo;
	private String stuName;
	private Address address;
	private Score[] score; // Score 라는 클래스 파일에서 score를 불러온다, 한 학생의 여러 점수를 한번에 저장 가능.

	// 오른쪽 클릭 > source > Generate Getters and Setters 클릭하면 자동으로 생성.
	// 이 클래스 뿐만이 아니라 public 을 작성함으로서 다른 클래스나 다른 프로젝트에서도 사용 가능.
	public String getStuNo() {
		return stuNo;	//값을 읽기 때문에 매개변수가 없어서 그냥 name만 써도 됨.
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;	//값을 쓰기 때문에 매개변수가 있어서 name과 this.name을 구분해야함.
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Score[] getScore() {
		return score;
	}
	public void setScore(Score[] score) {
		this.score = score;
	}

}
