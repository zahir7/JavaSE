package test.main;

import java.util.ArrayList;

import test.dto.Member;

public class MainClass02 {
	public static void main(String[] args) {
		//Member ��ü�� ������ �ִ� ArrayList ��ü �����ϱ�.
		ArrayList<Member> list= new ArrayList<Member>();
		//Member ��ü �����ϱ�
		Member mem1=new Member(1,"����ȣ","�뷮��");
		Member mem2=new Member(2,"ȫ�浿","����");
		Member mem3=new Member(3,"���߳�","��õ");
		//������ Member ��ü�� �迭�� �����ϱ�
		list.add(mem1);
		list.add(mem2);
		list.add(mem3);
		
		//list ��ü�� ����� ��ü�� �ϳ��� �ҷ��ͼ� ����� ������ ���
		for(int i=0; i<list.size();i++){
			int num = list.get(i).getNum();
			String name=list.get(i).getName();
			String addr=list.get(i).getAddr();
			System.out.println("��ȣ:"+num+" �̸�:"+name+" �ּ�:"+addr);
		}
	}
}













