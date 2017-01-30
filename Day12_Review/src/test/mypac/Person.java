package test.mypac;

public class Person {
	private String name; //이름
	//생성자
	public Person(String name){
		this.name=name;
	}
	//메소드
	public void goHome(){
		Car car=new Car();
		car.drive();
		System.out.println("집에 왔습니다.");
	}
}
