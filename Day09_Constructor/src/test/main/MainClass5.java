package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;
import test.mypac.Memory;

public class MainClass5 {
	public static void main(String[] args) {
		//Cpu ��ü �����ϱ�
		Cpu cpu1=new Cpu("����");
		//Memory ��ü �����ϱ�.
		Memory mem1 = new Memory("�Ｚ",100);
		
		//Computer ��ü 2���� �����غ�����.
		Computer com1=new Computer(cpu1 , mem1);
		
		Computer com2=
				new Computer(new Cpu("����"),new Memory("aa",1));
		
		Computer com3=new Computer(null,null);
	}
}










