package test.main;

import java.util.ArrayList;

import test.dto.Member;

/*
 * ���� �迭 : ArrayList ��ü ����غ���.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//ArrayList ��ü �����ϱ�.
		ArrayList<String> strList=
					new ArrayList<String>(); 
		//������ ��ü�� ������ �߰� �ϱ�
		strList.add("����ȣ");
		strList.add("ȫ�浿");
		strList.add("���߳�");
		strList.add(new String("�Ѻ�"));
		String str="������";
		strList.add(str);
		
		//��ü�� ����� ���� ����غ���
		for(int i=0 ; i < strList.size() ; i++){
			System.out.println(strList.get(i));
		}
	}
}











