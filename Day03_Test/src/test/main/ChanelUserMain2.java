package test.main;

import test.mypac.ChanelBag;

public class ChanelUserMain2 {
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		
		ChanelBag myBag=new ChanelBag();
		myBag.setItem("����");
		myBag.setItem("�ڵ���");
		myBag.setItem("���");
		myBag.setItem("��");
		myBag.setItem("Ŀ��");
		myBag.setItem("������");
		//����غ���
		System.out.println(myBag.items[0]);
		System.out.println(myBag.items[1]);
		System.out.println(myBag.items[2]);
		myBag.setItem("Ŀ��");
		myBag.setItem("������");
		
	}
}
