package test.main;

import test.mypac.Car;

/*
 * 메소드를 호출하거나 생성자를 호출할때 전달하는 인자는 크게 2가지로 나눌수 있다
 * 
 * 1. call by value       (값을전달)
 * 2. call by reference   (참조값을 전달)
 */
public class MainClass03 {
	//메인 메소드
	public static void main(String[] args) {
		int num=999;
		//메소드 호출하면서 값을 전달한다.
		test(num); //call by value
		System.out.println(num);
		
		Car car=new Car("벤틀리 Cooper");
		System.out.println(car.name);
		test(car);
		System.out.println(car.name);
		
		
	}
	//추가 메소드
	public static void test(int num){
		num++; //값을 증가 시킨다.
		System.out.println("증가시키후:"+num);
	}
	public static void test(Car car){
		car.name="똥차";
	}
}











