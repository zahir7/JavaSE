package test.mypac;
//�������̽� �����ϱ�
//1. implements �������̽� ��
//2. �������� ���� �߻�޼ҵ带 �����Ѵ�.

public class Unit implements Weapon{

	@Override
	public void attack() {
		System.out.println("������ �ؿ�!");
	}
	@Override
	public int attackLand() {
		System.out.println("���� ������ �ؿ�!");
		return 0;
	}
	@Override
	public String attackSky() {
		System.out.println("���� ������ �ؿ�!");
		return null;
	}
	@Override
	public void attackSea(int demage) {
		System.out.println("�ٴ� ������ �ؿ�!");
	}
}







