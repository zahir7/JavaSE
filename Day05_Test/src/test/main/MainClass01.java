package test.main;

import test.mypac.Unit;
import test.mypac.Weapon;

public class MainClass01 {
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		//Unit ��ü �����ϱ�
		Unit unit=new Unit();
		
		//�޼ҵ� ����غ���
		unit.attack();
		unit.attackLand();
		unit.attackSky();
		unit.attackSea(10);
	}
}











