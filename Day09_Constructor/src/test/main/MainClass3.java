package test.main;

import test.mypac.Cpu;

public class MainClass3 {
	public static void main(String[] args) {
		//Cpu ��ü �����ϱ�
		Cpu cpu1=new Cpu("������");
		Cpu cpu2=new Cpu("����ھ�");
	
		System.out.println(cpu1.getType());
		System.out.println(cpu2.getType());
		
		String str=cpu1.getType();
		System.out.println(str);
	}
}


























