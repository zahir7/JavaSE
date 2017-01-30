package test.main;

import java.util.ArrayList;

import test.mypac.Car;

public class MainClass03 {
	
	public static void main(String[] args) {
		//Car 객체를 담을 ArrayList 객체 생성하기
		ArrayList<Car> carList=new ArrayList<Car>();
		//생성한 가변배열 객체에  Car 객체 생성해서 저장하기
		Car car1=new Car("아반떼");
		Car car2=new Car("소나타");
		Car car3=new Car("그랜저");
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(new Car("프라이드"));
		carList.add(new Car("봉고차"));
		//누가 달릴까요?
		carList.get(3).drive();
		carList.get(3).name = "New프라이드";
		carList.get(3).drive();
		
		String carName = carList.get(4).name;
		System.out.println("읽어온 차이름:"+carName);
		
		//배열에 저장되어있는 모든 객체의 drive() 라는 메소드를 호출하려면?
		carList.get(0).drive();
		carList.get(1).drive();
		carList.get(2).drive();
		carList.get(3).drive();
		carList.get(4).drive();
		//반복문을 사용하면.
		for(int i=0 ; i < carList.size() ; i++){
			Car tmp=carList.get(i);
			tmp.drive();
		}
		//확장for문을 사용하면
		for(Car tmp : carList){
			tmp.drive();
		}
	}
}














