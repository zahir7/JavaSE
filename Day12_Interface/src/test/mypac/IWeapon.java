package test.mypac;

/*
 * 인터페이스(Interface) 
 * 1.implements 한다.
 * 2.구현되지않은 추상메소드를 오버라이딩(재정의) 한다.
 */
public class IWeapon implements Weapon{

	@Override
	public void attack() {
		System.out.println("공격을 해요!");
	}

	@Override
	public void attackSky() {
		System.out.println("공중 공격을 해요!");
	}
	
}






