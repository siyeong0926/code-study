package ex02_class;

public class School {
	//OOP(객체지향프로그래밍) 특징 중 하나인 은닉성(캡슐화)을 구현하기 위해서
	//멤버 속성은 private로 하고 외부에서 접근할 수 있는 setter, getter를 정의.
	private String name;
	private Address address;
	private Student[] students; // 학생들

	// 오른쪽 클릭 > source > Generate Getters and Setters 클릭하면 자동으로 생성.
	// 이 클래스 뿐만이 아니라 public 을 작성함으로서 다른 클래스나 다른 프로젝트에서도 사용 가능.
	public String getName() {
		return name;	//값을 읽기 때문에 매개변수가 없어서 그냥 name만 써도 됨.
	}
	public void setName(String name) {
		if (! name.contains("아카데미")) { 
			this.name = name;	//값을 쓰기 때문에 매개변수가 있어서 name과 this.name을 구분해야함.
		}
		else {
			System.out.println("학교명은 대학, 대학교이어야 합니다.");
		}	
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}

	public void printInfo() {
		System.out.printf("==> 학교 : %s\n", this.name);
		System.out.printf("==> 주소 : (%s) %s\n", this.address.getPostcode(), this.address.getRoadAddress1());
		System.out.printf("         : %s\n", this.address.getRoadAddress2());
		System.out.println("=========================================");
		
		for(int i=0; i<this.students.length; i++)
		{
			System.out.printf("==> 학번 : %s ,  이름 : %s\n", students[i].getStuNo(), students[i].getStuName());
		}
	}
	
	//return 유효성 체크
	//메서드를 만들 때 if에 return을 주면 else에도 똑같이 줘야 한다. (== 모든 경우에 부여해줘야함.)
	public int testMethod(int num) {
		if(num<100) 
			return 0;
		if(this.name.length()<5)
			return this.name.length();
		else
			return -1;
	}
	
}



