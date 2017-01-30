package test.mypac;
/*
 * Car 객체를 생성해서 리턴하는 CarFactory 클래스
 */
public class CarFactory {
	//static 맴버 메소드
	public static Car getCar(){
		Car car=new Car();
		return car;
	}
}
