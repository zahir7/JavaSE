package test.main;

import test.mypac.Member;

/*
 * Member Ŭ������ �̿��ؼ� ��ü �����ϰ� ��(ȸ������) �����غ���.
 */
public class MainClass2 {
	public static void main(String[] args) {
		//Member  ��ü �����ϱ�
		Member mem1=new Member();
		//��ü�� �ʵ忡 �� �־��ֱ�
		mem1.setNum(1);
		mem1.setName("����ȣ");
		mem1.setAddr("�뷮��");
		//��ü�� ����� �� ����غ���
		System.out.println("��ȣ:"+mem1.getNum());
		System.out.println("�̸�:"+mem1.getName());
		System.out.println("�ּ�:"+mem1.getAddr());
		
		//Member ��ü ������ ���ÿ� �ʿ��� �� Ȥ�� ��ü �־��ֱ�
		Member mem2=new Member(2,"ȫ�浿","����");
		//��ü�� ����Ȱ� ����ϱ�.
		System.out.println("��ȣ:"+mem2.getNum());
		System.out.println("�̸�:"+mem2.getName());
		System.out.println("�ּ�:"+mem2.getAddr());
		
		//Member ��ü�� �������ִ� ��5��¥�� �迭 �����
		Member[] list=new Member[2];
		//�迭�� 0 ��° �ε����� mem1 ��ü �����ϱ�
		list[0]=mem1;
		//�迭�� 1 ��° �ε����� mem2 ��ü �����ϱ�.
		list[1]=mem2;
		
		//�ݺ��� ���鼭 ȸ������ ����غ���
		for(int i=0 ; i<list.length ;i++){
			int num=list[i].getNum(); //��ȣ ������
			String name=list[i].getName(); //�̸� ������
			String addr=list[i].getAddr(); //�ּ� ������.
			//���پ� ����ϱ�
			System.out.println("��ȣ:"+num+" �̸�:"+name+" �ּ�:"+addr);
		}
	}
}