package test.mypac4;

public class MainClass {
	//메인 메소드
	public static void main(String[] args) {
		//Weapon 객체가 생성이 될까요?
		//new IWeapon().attack();
		IWeapon weapon1=new IWeapon();
		Weapon weapon2=new IWeapon();
		Object weapon3=new IWeapon();
		
		weapon1.attackSky();
		weapon2.attackSky();
		
	}
}
