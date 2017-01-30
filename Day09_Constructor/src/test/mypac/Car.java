package test.mypac;

public class Car {
	//엔진이 시동이 걸렸는지 저장하는 멤버필드
	private boolean isEngineStarted=false;
	//생성자 
	public Car(){
		//초기화 할 작업이 있을때 초기화를 하면 된다.
		isEngineStarted=true;
	}
	//맴버 메소드
	public void drive(){
		if(isEngineStarted){
			System.out.println("차가 움직여요!");
		}else{
			System.out.println("엔진이 꺼져 있어서 움직일수가 없어요!");
		}
	}
	//엔진을 정지 시키는 메소드
	public void stopEngine(){
		isEngineStarted=false;
		System.out.println("엔진이 꺼졌습니다.");
	}
	//엔진을 다시 켜는 메소드 를 만들어 보세요.startEngine()
	public void startEngine(){
		isEngineStarted=true;
		System.out.println("엔진이 켜졌습니다.");
	}
}

















