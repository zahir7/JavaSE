package test.main;

import test.mypac.Car;
import test.mypac.CarFactory;

public class MainClass {
	//메인메소드
	public static void main(String[] args) {
		//Car 객체의 drive() 메소드를 호출해야 한다면???
		new Car().drive();
		//CarFactory 클래스의 메소드를 이용해서 객체 얻어오기.
		CarFactory.getCar().drive();
		
		Car car1=CarFactory.getCar();
		car1.drive();
		
		Car car2=CarFactory.getCar();
		car2.drive();
		
		
		Double d = new Double(12.1231564);
		System.out.println();
	}
}












