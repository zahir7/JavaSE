package test.main;

import test.mypac.Human;
import test.mypac.Woman;

public class MainClass02 {
	public static void main(String[] args) {
		
		//Woman Ŭ������ �̿��ؼ� ��ü �������� �پ��� ���·� �޾ƺ���.
		Woman woman1=new Woman();
		Human woman2=new Woman();
		Object woman3=new Woman();
		woman1.makeup();
		woman2.say();
		woman3.toString();
		//�ڽ� ���·� ����ȯ�ؼ� ������ ���.
		Woman woman4=(Woman)woman3;
		
	}
}





















