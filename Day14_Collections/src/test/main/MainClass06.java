package test.main;

import java.util.HashMap;

public class MainClass06 {
	public static void main(String[] args) {
		//HashMap ��ü �����ϱ�.
		HashMap<String,String> map=
				new HashMap<String,String>();
		//������ �����ϱ�
		map.put("house", "��");
		map.put("hamburger", "�� ���̿� ���̳� ������ũ�� ������");
		map.put("chicken", "��");
		map.put("fried chicken", "�� Ƣ��");
		//����� ������ ����ϱ�
		System.out.println("chicken �� ��:"+map.get("chicken"));
		//hamburger �� ���� ����غ�����!
		System.out.println("hamburger �� ��:"+map.get("hamburger"));
	}
}





