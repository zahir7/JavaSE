package test.main;

import test.mypac.Member;

public class MainClass1 {
	public static void main(String[] args) {
		//Member ��ü �����ϱ�
	 	Member mem = new Member();
	 	//�޼ҵ� ȣ���ϰ� ���ϵǴ� �������� ������ ���
	 	int num = mem.getNum();
	 	//�������� ����ϱ�.
	 	System.out.println("num:"+num);
	 	
	 	//Member ��ü �����ϱ�.
	 	Member mem1 = new Member(1,"����ȣ","�뷮��");
	 	int num1=mem1.getNum();
	 	System.out.println("num:"+num1);
	}
}



































