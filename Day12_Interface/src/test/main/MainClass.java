package test.main;

import test.mypac.IWeapon;
import test.mypac.Weapon;

public class MainClass {
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		//Weapon �������̽��� ������ IWeapon ��ü �����ϱ�.
		IWeapon weapon1=new IWeapon();
		//�������� �������̽� ���·ε� ������ �ִ�.
		Weapon weapon2=new IWeapon();
		Object weapon3=new IWeapon();
		
		weapon1.attackSky();
		weapon2.attackSky();
		
		System.out.println(Weapon.NAME);
	}
}
