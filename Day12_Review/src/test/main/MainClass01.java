package test.main;

import test.mypac.Car;

public class MainClass01 {
	
	static String myName="김구라";
	
	public static void main(String[] args) {
		//Car 객체 생성하기.
		Car car1=new Car();
		//new Car().drive();
		car1.drive();
		car1.drive();
		System.out.println(myName);
		doSomething();
	}
	//맴버 메소드 추가 하기.
	public static void doSomething(){
		System.out.println("무언가를 해요!");
	}
}














