package test.main;

import java.util.ArrayList;

/*
 * [[ ArrayList Class ]]
 * 
 *  -���� �迭�̴�.
	-�ε��� ���� �ִ�.
 */
public class MainClass02 {
	public static void main(String[] args) {
		//ArrayList ��ü �����ϱ�
		ArrayList<String> list=new ArrayList<String>();
		//������ �����ϱ�
		list.add("�豸��");
		list.add("ȫ�浿");
		list.add("���߳�");
		//����� �������� Ư�� �ε����� ������
		String str=list.get(0);
		System.out.println(str);
		//����� �����Ϳ��� Ư�� �ε����� ���� �����ϱ�
		list.remove(2); //2��° �ε��� �� �����ϱ�
		//����� �������� ������ ��������?
		int num=list.size();
		System.out.println("����� �������� ����:"+num);
		System.out.println(list);
	}
}












