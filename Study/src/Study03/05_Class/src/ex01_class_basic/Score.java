package ex01_class_basic;

public class Score { // 실행을 하기 위해 필요한 클래스일뿐, 직접 실행하는 메인 클래스가 아니기 때문에 메인이 없어도 됨.
						// public이어야 패키지가 달라도 참조 가능하다.
	public String name;
	public int kor;
	public int eng;
	public int math;
	public String className = "GDJ65";

	// 각 속성들에 초기값을 설정 => 생성자
	// 빈화면 오른쪽 클릭 > sourse > Generate Constructor using Fields > public 체크 > 생성
	// 기본생성자는 개발자가 생성자를 하나도 정의하지 않았을 때만 컴파일러가 자동으로 추가해준다.
	// overloading = 중복정의, 여러개의 정의를 만들어놓는 것. 사용하는 사람은 정의에 따라 선택하여 소스를 만들 수 있다.

	// 1. 기본
	public Score() {

	}

	// 2. 이름만
	public Score(String name) {
		this.name = name;
	}

	// 3. 이름, 국어, 영어, 수학점수
	public Score(String name, int kor, int eng, int math) { // 정의한 경우
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int calcSum() {
		int tot = kor + eng + math;
		return tot; // 207
	}

	public double calcAvg() {// 괄호안에서 나온 결과 int를 double로 주는것은 자동형변환 되기 때문에 오류가 뜨지 않는다.
		int tot = kor + eng + math;
		int avg = tot / 3;
		return avg; // void가 아니면 꼭 return으로 끝나야 한다.
	}

	public int calcAvg2() {// 괄호안에서 나온 결과 double을 int로 주는것은 자동형변환이 안되기 때문에 수동으로 작성해준다.
		int tot = kor + eng + math;
		double avg = tot / 3;
		return (int) avg; // 형변환, 값을 리턴하겠다는 뜻.
							// void에서는 실행을 리턴하겠다는 뜻.
	}

	public void printCmd() {
		System.out.printf("이름:%s 국어:%d 영어:%d 수학:%d 평균:%f,\n", this.name, this.kor, this.eng, this.math, calcAvg());
	}
	
	//ScoreTest2 "뷔","진" 성적 참조
	public Score deepCopy() {
		Score newCopy = new Score(); //새로운 인스턴스 생성
		newCopy.name = this.name;
		newCopy.kor = this.kor;
		newCopy.eng = this.eng;
		newCopy.math = this.math;
		
		return newCopy;
	}
	
//	@Override
//	public String toString() {
//		String temp = String.format("이름:%s 국어:%d 영어:%d 수학:%d 평균:%f,\n", 
//				this.name, this.kor, this.eng, calcAvg());
//		return temp;
//	}
}
