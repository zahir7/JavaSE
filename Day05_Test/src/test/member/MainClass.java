package test.member;

import java.util.HashMap;

public class MainClass {
	public static void main(String[] args) {
		//HashMap ��ü �����ϱ�
		HashMap<String,String> map =
				new HashMap<String,String>();
		//��ü�� ���� �ܾ� �����ϱ�
		map.put("house", "��");
		map.put("car", "�ڵ���");
		map.put("milk", "����");
		map.put("computer", "��ǻ��");
		map.put("mouse", "��");
		
		//����� ������ �ϳ��� ����غ���
		System.out.println(map.get("mouse"));
	}
}





