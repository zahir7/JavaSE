package ex1;

public class Main01 {

	public static void main(String[] args) {
		Test01 t1 = new Test01();
		
		// ������ ��ȣ�ϱ����� ��ȿ�� �˻�
		// t1.score = 500; //private�� ���� ���� 
		t1.setScore(55); //�޼ҵ� ���� ��ȸ���� ���氡��
		System.out.println(t1.getScore());
	}
}
