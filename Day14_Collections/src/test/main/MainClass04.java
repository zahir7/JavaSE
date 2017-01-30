package test.main;

import java.util.Vector;

import test.mypac.Car;

/*
 * [[ Vector Class ]]
 * 
 * -ArrayList 와 메소드가 동일하다. 
 * -스레드 동기화를 지원한다.
 * -ArrayList 보다 무겁다.
 */
public class MainClass04 {
	public static void main(String[] args) {
		//Vector 객체 생성하기
		Vector<Car> vec=new Vector<Car>();
		//생성한 객체에 Car 객체 저장하기
		vec.add(new Car("아반테"));
		vec.add(new Car("소나타"));
		//반복문 돌면서 메소드 사용해보기
		for(Car tmp:vec){
			tmp.drive();
		}
	}
}