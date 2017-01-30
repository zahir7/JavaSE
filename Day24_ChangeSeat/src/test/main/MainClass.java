package test.main;

import java.util.ArrayList;
import java.util.Random;

/*
 * �츮�� �л� 20���� �̸��� �迭�� ������� ������
 * �������� ���� ���� �θ� �����ϴ� ���α׷� �����
 */
public class MainClass {
	public static void main(String[] args) {
		//20���� �̸��� ����ִ� �迭��ü �����
		String[] ourClass={"������","�Ѻ���","����ȣ","�뼺��","����",
						"�载��","�����","������","���ƶ�","���ټ�",
						"������","�����","�ֿ뱺","�迬��","���ر�",
						"��ȿ��","������","�ڼ���","������","������"};
		//Random ��ü �����ϱ�
		Random ran=new Random();
		//�ݺ��� ���鼭 ����(Shuffling)
		for(int i=0 ; i < 20 ; i++){
			//������ �߻� ��Ű�� (0 ~ 19 ������ ����)
			int ranNum = ran.nextInt(20);
			//���� �ε����� �ִ� �̸��� �������� �߻��� �ε����� �̸� �ٲٱ�
			String tmp = ourClass[i]; //�ٲ��̸��� �ӽú����� ����
			ourClass[i] = ourClass[ranNum]; //���� �ε����� �ٲ��̸� ����
			ourClass[ranNum] = tmp ; //�ٲ� �̸��� �ӽú����� �ִ� �̸�����
		}
		//Ŀ�ð�ü�� ������ ���� �迭 �����ϱ�
		ArrayList<Couple> coupleList=new ArrayList<Couple>();
		//�θ� Ŀ�ø��ϱ�
		for(int i=0 ; i < 10 ; i++){
			//�� Ŀ���� ������ ���� ��ü �����ϱ�
			Couple c=new Couple();
			//Ŀ���� �ɹ��ʵ忡 �� �����ϱ�
			c.setFirstPerson(ourClass[i]);
			c.setSecondPerson(ourClass[i+10]);
			//������ Ŀ�ð�ü�� �迭�� �����ϱ�
			coupleList.add(c);
		}
		//10 ���� Ŀ�ð�ü�� �ݺ��� ���鼭 ����غ���
		for(int i=0 ; i < 10 ; i++){
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			String name1 = coupleList.get(i).getFirstPerson();
			String name2 = coupleList.get(i).getSecondPerson();
			System.out.println(i+1+" �� Ŀ��: "+name1+" / "+name2);
		}
	}
}

















