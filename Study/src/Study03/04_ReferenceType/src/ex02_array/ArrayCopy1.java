package ex02_array;

import java.util.Arrays;

public class ArrayCopy1 {

	public static void main(String[] args) {
		//ex01();
		//ex02();
		//ex03();
		//ex04();
		ex05();
	}

	//기본예시
	public static void ex01() {
		int[] a = {3, 4, 5};
		int[] b = a; //같은 인스턴스를 참조하게 된다.
		int[] c = {10, 20, 30, 40};
		
		System.out.println(Arrays.toString(a)); //[3, 4, 5]
		System.out.println(Arrays.toString(b)); //[3, 4, 5]
		
		System.out.println(a); //[I@515f550a
		System.out.println(b); //[I@515f550a
		System.out.println(c); //[I@626b2d4a
	}
	
	//얕은복사 예시
	public static void ex02() {
		int[] a = {3, 4, 5};
		int[] b = a; //같은 인스턴스를 참조하게 된다.(얕은복사, 일반복사), int[] b = a.clone()으로 작성하면 깊은 복사가 됨.
		int[] c = {10, 20, 30, 40};
		
		b[0] = 7;
		
		System.out.println(Arrays.toString(a)); //[7, 4, 5]
		System.out.println(Arrays.toString(b)); //[7, 4, 5]
		
		System.out.println(a); //[I@515f550a
		System.out.println(b); //[I@515f550a
		System.out.println(c); //[I@626b2d4a
	}
	
	//깊은복사 예시
	public static void ex03() {
		int[] a = {3, 4, 5};
		int[] b = a; //같은 인스턴스를 참조하게 된다.
		int[] c = {10, 20, 30, 40};
		
		int[] newCopy = new int[a.length];//새로운 인스턴스에 값만 복사(깊은복사)
		for (int i=0;i<a.length; i++)
		{
			newCopy[i] = a[i]; //a의 i번째 값을 읽어서 newCopy의 i번째에 줘라.
		}
		b = newCopy; //새로만든 인스턴스를 b가 참조하게 된다.
		
		b[0] = 7;
		
		System.out.println(Arrays.toString(a)); //[3, 4, 5]
		System.out.println(Arrays.toString(b)); //[7, 4, 5]
		
		System.out.println(a); //[I@515f550a
		System.out.println(b); //[I@626b2d4a
		System.out.println(c); //[I@5e91993f
	}
	
	//clone함수를 사용_깊은복사
	public static void ex04() {
		int[] a = {3, 4, 5};
		int[] b = a; //같은 인스턴스를 참조하게 된다.
		int[] c = {10, 20, 30, 40};
		
		b = a.clone(); //clone=복제하다, 새로운 인스턴트 하나가 그냥 만들어지고, a값이 복사가 된다.
		
		b[0] = 7;
		
		System.out.println(Arrays.toString(a)); //[3, 4, 5]
		System.out.println(Arrays.toString(b)); //[7, 4, 5]
		
		System.out.println(a); //[I@515f550a
		System.out.println(b); //[I@626b2d4a
		System.out.println(c); //[I@5e91993f
	}
	
	//System.arraycopy() 사용_깊은복사
	public static void ex05() {
		int[] a = {3, 4, 5};
		int[] b = a; //같은 인스턴스를 참조하게 된다.
		int[] c = {10, 20, 30, 40};
		
		b[0] = 7;
		
		//배열은 고정크기이기 때문에 크기를 늘리고 싶은 경우,
		//새로운 배열을 만들고, 기존의 값들을 새로운 배열로 복사해야한다.
		int[] newCopy = new int[a.length + 5]; //새로운 인스턴스에 값만 복사(깊은복사)
		System.arraycopy(a, 0, newCopy, 0, a.length); //a의 0번째부터 복사를 하는데, newCopy의 0번째부터에 넣어라.
		
		System.out.println(Arrays.toString(a)); //[7, 4, 5]
		System.out.println(Arrays.toString(b)); //[7, 4, 5]
		System.out.println(Arrays.toString(c)); //[10, 20, 30, 40]
		System.out.println(Arrays.toString(newCopy)); //[7, 4, 5, 0, 0, 0, 0, 0]
		
		System.out.println(a); //[I@515f550a
		System.out.println(b); //[I@515f550a
		System.out.println(c); //[I@626b2d4a
	}
}
