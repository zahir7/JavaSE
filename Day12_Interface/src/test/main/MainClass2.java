package test.main;

import test.mypac.Weapon;

public class MainClass2 {
	public static void main(String[] args) {
		//Weapon �������̽��� ������ ��ü�� �ʿ��ϴٸ�???
		Weapon weapon=new Weapon(){
			@Override
			public void attack() {
				System.out.println("�����ؿ�!");
			}
			@Override
			public void attackSky() {
				System.out.println("���߰����� �ؿ�!");
			}
		};
		weapon.attack();
		weapon.attackSky();
	}
}




