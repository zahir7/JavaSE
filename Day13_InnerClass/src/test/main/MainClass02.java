package test.main;

import test.mypac.MyUtil;
import test.mypac.MyUtil.HelloPrinter;

public class MainClass02 {
	public static void main(String[] args) {
		//MyUtil Ŭ�����ȿ� �ִ� HelloPrinter Ŭ������ �̿��ؼ� ��ü ����
		MyUtil.HelloPrinter p=new MyUtil.HelloPrinter();
		//�޼ҵ� ����ϱ�.
		p.printHello();
		//MyUtil Ŭ�����ȿ� �ִ� Calculator Ŭ������ �̿��ؼ� ��ü ��������
		//�޼ҵ带 ����غ�����!
		MyUtil.Calculator c=new MyUtil.Calculator();
		c.calc(10, 20);
		
		String name = MyUtil.HelloPrinter.NAME;
		
		System.out.println(name);
	}
}







