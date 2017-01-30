package test.main;

import test.mypac.Weapon;

public class MainClass2 {
	public static void main(String[] args) {
		//Weapon 인터페이스를 구현한 객체가 필요하다면???
		Weapon weapon=new Weapon(){
			@Override
			public void attack() {
				System.out.println("공격해요!");
			}
			@Override
			public void attackSky() {
				System.out.println("공중공격을 해요!");
			}
		};
		weapon.attack();
		weapon.attackSky();
	}
}




