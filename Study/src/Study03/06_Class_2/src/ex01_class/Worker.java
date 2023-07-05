package ex01_class;

public class Worker extends Human { // Human:부모클래스, Worker:자식클래스
	public int workID;

	public void gotoWork() {
		System.out.println("Worker - gotoWork");
	}

}
