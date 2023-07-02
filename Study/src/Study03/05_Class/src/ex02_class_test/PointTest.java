package ex02_class_test;

import ex02_class.Point;

public class PointTest {

	public static void main(String[] args) {
		Point pt1 = new Point();
		pt1.setX(5);
		pt1.setY(10);
		
		pt1.printInfo();	//1.(x,y)=(5,10), 1-1.(x,y)=(5,10)
		/*
		//n번째
		swap(pt1); 
		*/
		//n-1번째 deepCopy
		swap(pt1.deepCopy());
		pt1.printInfo();	//4.(x,y)=(10,5), 4-1.(x,y)=(5,10)
	}
	
	public static void swap(Point pt) {	// x,y 좌표 변경
		pt.printInfo();	//2.(x,y)=(5,10), 2-1.(x,y)=(5,10)
		
		int temp = pt.getX();
		pt.setX(pt.getY());
		pt.setY(temp);
		
		pt.printInfo();	//3.(x,y)=(10,5), 3-1.(x,y)=(10,5)
	}

}
