package test.main;

import test.mypac.Man;
import test.mypac.Woman;

public class MainClass03 {
	public static void main(String[] args) {
		//Man ��ü �����ؼ� Object ���·� �ޱ�
		Object man=new Man();
		//Woman ���·� ����ȯ�� �����ұ��?
		Woman man2=(Woman)man; // Exception �߻�.
	}
}
