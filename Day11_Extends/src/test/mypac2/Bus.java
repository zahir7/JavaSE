package test.mypac2;
/*
 * 부모의 drive() 메소드를 오버라이드 해보세요.
 * MainClass04 에서 Bus 객체를 생성후 메소드를 사용해보세요.
 */
public class Bus extends Car{
	//버스의 메소드
	public void loadManyPeople(){
		System.out.println("많은 사람을 실어요!");
	}
	//메소드 오버 라이딩
	public void drive(){
		System.out.println("부드럽게 달려요!");
	}
}
