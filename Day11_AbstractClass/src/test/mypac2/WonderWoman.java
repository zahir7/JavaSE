package test.mypac2;
/*
 * �߻� Ŭ���� ��� �ޱ�
 */
public class WonderWoman extends Woman{

	@Override
	public void dance(Man man) {
		if( man.getHeight()<178 ){
			System.out.println("Ű�� �� �۾�! �ʶ� �����!!");
			return;//�޼ҵ带 ������
		}
		System.out.println("���ڿ� ���ڰ� ���� ���!");
	}
	
}
