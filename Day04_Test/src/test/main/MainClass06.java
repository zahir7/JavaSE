package test.main;

import java.util.ArrayList;

import test.mypac.Member;

public class MainClass06 {
	public static void main(String[] args) {
		//Member ��ü �����ϰ� ��ü�� �ڷ� �����ϱ�
		Member mem1 = new Member();
		mem1.num = 1 ;
		mem1.name = "�豸��";
		mem1.addr = "�뷮��";
		
		Member mem2 = new Member();
		mem2.num = 2 ;
		mem2.name = "ȫ�浿";
		mem2.addr = "����";
		
		Member mem3 = new Member();
		mem3.num = 3 ;
		mem3.name = "ȫ�߳�";
		mem3.addr = "��õ";
		
		Member mem4 = new Member();
		mem4.num = 4 ;
		mem4.name = "�ƹ���";
		mem4.addr = "��õ";
		
		//ȸ�� ������ ������ ���� �迭 ��ü �����ϱ�
		ArrayList<Member> list=new ArrayList<Member>();
		//Member ��ü�� �迭�� �����ϱ�.
		list.add(mem1);
		list.add(mem2);
		list.add(mem3);
		list.add(mem4);
		for(int i=0 ; i < list.size() ; i=i+1){
			System.out.print(" ��ȣ: "+list.get(i).num);
			System.out.print(" �̸�: "+list.get(i).name);
			System.out.print(" �ּ�: "+list.get(i).addr);
			System.out.println();//�����ϱ�
		}
		
	}
}














