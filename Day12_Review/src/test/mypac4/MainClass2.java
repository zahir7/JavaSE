package test.mypac4;

public class MainClass2 {
	//���� �޼ҵ�
	public static void main(String[] args) {
		//Weapon �߻�Ŭ������ ��ӹ޾� �߻�޼ҵ带 ������ ��ü
		Weapon weapon=new Weapon(){//�͸��� �̳� Ŭ����
			@Override
			public void attackSky() {
				System.out.println("���� ������ �ؿ�!");
			} 
		};
		weapon.attackSky();
		weapon.attack();
	}
}
