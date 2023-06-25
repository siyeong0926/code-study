package ex02_class;

public class Address {
	private String postcode; // 우편번호
	private String roadAddress1; // 도로명주소
	private String roadAddress2;

	// 오른쪽 클릭 > source > Generate Getters and Setters 클릭하면 자동으로 생성.
	// 이 클래스 뿐만이 아니라 public 을 작성함으로서 다른 클래스나 다른 프로젝트에서도 사용 가능.
	public String getPostcode() {
		return postcode;	//값을 읽기 때문에 매개변수가 없어서 그냥 name만 써도 됨.
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;	//값을 쓰기 때문에 매개변수가 있어서 name과 this.name을 구분해야함.
	}
	public String getRoadAddress1() {
		return roadAddress1;
	}
	public void setRoadAddress1(String roadAddress1) {
		this.roadAddress1 = roadAddress1;
	}
	public String getRoadAddress2() {
		return roadAddress2;
	}
	public void setRoadAddress2(String roadAddress2) {
		this.roadAddress2 = roadAddress2;
	}

}
