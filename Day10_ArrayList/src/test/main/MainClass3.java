package test.main;

import java.util.ArrayList;
import java.util.Scanner;
import test.dto.Member;
/*
 * ȸ�� �߰� , ��ü ȸ�� ��Ϻ��� �� �Ǵ� ���α׷� �����.
 */
public class MainClass3 {
	public static void main(String[] args) {
		//Scanner ��ü �����ϱ�
		Scanner scan=new Scanner(System.in);
		//ȸ�������� ���� ArrayList ��ü �����ϱ�
		ArrayList<Member> list=new ArrayList<Member>();
		int select=0;
		boolean isRun=true;
		int memberCount=0;//ȸ����ȣ.
		//�ݺ����� �����.
		while(isRun){
			System.out.print("ȸ���߰�[1]��Ϻ���[2]����[0]:"); 
			//����ڷ� ���� ������ �Է¹ޱ�.
			select=scan.nextInt();
			switch(select){
			case 1: //ȸ�� ����
				memberCount++; // ȸ����ȣ ���� ��Ű��.
				System.out.print("�̸��Է�:");
				String name=scan.next(); //�̸� �Է¹ޱ�
				System.out.print("�ּ��Է�:");
				String addr=scan.next(); //�ּ� �Է� �ޱ�
				//���� �Էµ� ������ �̿��ؼ�  Member ��ü �����ϱ�
				Member mem=new Member(memberCount,name,addr);
				//������ ��ü�� ArrayList ��ü�� ���
				list.add(mem);
				break;
			case 2: //��Ϻ���
				System.out.println("------------------------");
				//list ��ü�� ����� ��ü�� �ϳ��� �ҷ��ͼ� ����� ������ ���
				for(int i=0; i<list.size();i++){
					int num1 = list.get(i).getNum();
					String name1=list.get(i).getName();
					String addr1=list.get(i).getAddr();
					System.out.println("��ȣ:"+num1+" �̸�:"+name1+" �ּ�:"+addr1);
				}
				System.out.println("------------------------");
				break;
			case 0: //����
				isRun=false; //�ݺ��� ���� ������.
				break;
			}//switch()
		}//while()
	}//main()
}//class




















