package test.mypac4;
/*
 * �߻�Ŭ���� (Abstract Class) 
 * -����� ���
 * 1. class ����� �տ� abstract �� ���δ�.
 * 2. �������� ���� �޼ҵ带 ����� abstract �� ���δ�.
 * 3. �ܵ����� ��ü ������ �Ұ����ϴ�.
 */
public abstract class Weapon {
	
	//�޼ҵ�(������ �޼ҵ�)
	public void attack(){
		System.out.println("�����ؿ�!");
	}
	//�߻�޼ҵ�(�������� ���� �޼ҵ�)
	public abstract void attackSky();
}
