package test.mypac;

/*
 * �������̽�(Interface) 
 * 1.implements �Ѵ�.
 * 2.������������ �߻�޼ҵ带 �������̵�(������) �Ѵ�.
 */
public class IWeapon implements Weapon{

	@Override
	public void attack() {
		System.out.println("������ �ؿ�!");
	}

	@Override
	public void attackSky() {
		System.out.println("���� ������ �ؿ�!");
	}
	
}






