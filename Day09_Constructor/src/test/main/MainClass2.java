package test.main;

import test.mypac.Car;

public class MainClass2 {
	public static void main(String[] args) {
		//Car ��ü �����ϱ�
		Car car1=new Car();
		Car car2=new Car();
		//�޼ҵ� ����غ���
		
		//car1.isEngineStarted = false;
		car1.stopEngine();
		car1.drive();
		car2.drive();
		System.out.println("-------");
		car1.startEngine();
		car1.drive();
	}
}










