package ex02_class;

public class Point {
	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void printInfo() {
		System.out.printf("(x,y)=(%d,%d)\n", x, y);
	}
	
	public Point deepCopy() {
		Point newPt = new Point();
		newPt.x = this.x;	//newPt.x에 this.x 값을 준다.
		newPt.y = this.y;	//newPt.y에 this.y 값을 준다.
		
		return newPt;
	}
}
