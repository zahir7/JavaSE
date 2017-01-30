package test.mypac2;

public class Truck extends Car{
	//트럭의 메소드
	public void load(){
		System.out.println("짐을 실어요!");
	}
	//부모의 메소드 오버 라이딩(재정의) 하기
	public void drive(){
		System.out.println("힘차게 달려요!");
	 }
}
