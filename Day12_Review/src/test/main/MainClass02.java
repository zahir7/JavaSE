package test.main;

import test.mypac.IRandom;
import test.mypac.Person;

public class MainClass02 {
	public static void main(String[] args) {
		//Person ��ü �����ϱ�
		new Person("�豸��").goHome();
		//IRandom ��ü �����ϱ�.
		IRandom ran=new IRandom();
		//������ IRandom ��ü�� �������� �̿��ؼ� �޼ҵ� ȣ���ϱ�.
		int ranNum=ran.getRandomNum();
		int ranNum2=ran.getRandomNum();

		System.out.println("������ ������:"+ranNum);
	}
}
