package test.mypac4;

public class MainClass {
	//���� �޼ҵ�
	public static void main(String[] args) {
		//Weapon ��ü�� ������ �ɱ��?
		//new IWeapon().attack();
		IWeapon weapon1=new IWeapon();
		Weapon weapon2=new IWeapon();
		Object weapon3=new IWeapon();
		
		weapon1.attackSky();
		weapon2.attackSky();
		
	}
}
