package ex02_array;

public class RefTypeSample1 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 3;
		p1.y = 5;
		//System.out.printf("x:%d y:%d\n", p1.x, p1.y); //3,5
		System.out.println("x:" + p1.x + " y:" + p1.y); //3,5
		
		Point p2 = p1;//얕은복사
		
		p2.x = 10;
		
		System.out.printf("x:%d y:%d\n", p1.x, p1.y); //10, 5
		System.out.printf("x:%d y:%d\n", p2.x, p2.y); //10, 5
		
		
		Point newCopy = new Point(); //새로운인스턴스 만들어서 값을 복사, 깊은복사
		newCopy.x = p1.x;            
		newCopy.y = p1.y;
		Point p3 = newCopy;
		
		p3.x = 20;
		
		System.out.printf("x:%d y:%d\n", p1.x, p1.y); //10, 5
		System.out.printf("x:%d y:%d\n", p3.x, p3.y); //20, 5
	}
}

class Point
{
	int x;
	int y;
}