package test.mypac4;
/*
 * 추상클래스 (Abstract Class) 
 * -만드는 방법
 * 1. class 예약어 앞에 abstract 를 붙인다.
 * 2. 구현되지 않은 메소드를 만들고 abstract 를 붙인다.
 * 3. 단독으로 객체 생성이 불가능하다.
 */
public abstract class Weapon {
	
	//메소드(구현된 메소드)
	public void attack(){
		System.out.println("공격해요!");
	}
	//추상메소드(구현되지 않은 메소드)
	public abstract void attackSky();
}
