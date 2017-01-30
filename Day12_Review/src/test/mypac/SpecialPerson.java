package test.mypac;

public class SpecialPerson extends Car{
	private String name;
	//생성자.
	public SpecialPerson(String name){
		this.name=name;
	}
	//메소드
	public void goHome(){
		drive();
		System.out.println("집에 왔습니다.");
	}
}
