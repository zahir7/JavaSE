package test.main;

import test.mypac.Car;
import test.mypac.CarFactory;

public class MainClass {
	//���θ޼ҵ�
	public static void main(String[] args) {
		//Car ��ü�� drive() �޼ҵ带 ȣ���ؾ� �Ѵٸ�???
		new Car().drive();
		//CarFactory Ŭ������ �޼ҵ带 �̿��ؼ� ��ü ������.
		CarFactory.getCar().drive();
		
		Car car1=CarFactory.getCar();
		car1.drive();
		
		Car car2=CarFactory.getCar();
		car2.drive();
		
		
		Double d = new Double(12.1231564);
		System.out.println();
	}
}












