package test.mypac5;

public class Parent extends GrandParent{
	String name="부모님";
	public void makeMoney(){
		System.out.println("돈을 벌어요!");
	}
	//메소드 오버라이딩 하기
	public void eat() {
		System.out.println("부모님이 식사를 해요!");
	}
	
}
