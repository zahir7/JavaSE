package ex1;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //���ʸ��� �⺻���� ������ �� ����. �������� �����ؾ��Ѵ�.
		list.add("sdafsadf");		
		list.add(100);
		
		Object s = list.get(0); // ����°� ���� �𸣱� ??���� Object�� �޾�����Ѵ�.
		
		System.out.println(s);
		
	}
}
