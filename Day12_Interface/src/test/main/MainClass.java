package test.main;

import test.mypac.IWeapon;
import test.mypac.Weapon;

public class MainClass {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		//Weapon 인터페이스를 구현한 IWeapon 객체 생성하기.
		IWeapon weapon1=new IWeapon();
		//참조값을 인터페이스 형태로도 받을수 있다.
		Weapon weapon2=new IWeapon();
		Object weapon3=new IWeapon();
		
		weapon1.attackSky();
		weapon2.attackSky();
		
		System.out.println(Weapon.NAME);
	}
}
