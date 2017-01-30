package test.mypac;

public class Car {
	//맴버필드
	public String name;
	//생성자
	public Car(String name){
		this.name=name;
	}
	//메소드
	public void drive(){
		System.out.println(name+"이(가) 달려요!");
	}
}
