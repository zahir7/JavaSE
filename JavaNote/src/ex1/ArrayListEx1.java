package ex1;

import java.util.ArrayList;

class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(100);
		list.add("hello");
		list.add(5.7);
		list.add(1,500);  // 1���ڸ��� 500�� �ְڴٴ� ��. �߰��� �������.
		
		System.out.println(list);
		list.set(1, 777); // 1���ڸ� 777�� ����.
		System.out.println(list);
		list.remove(2); // ������ ��ġ ����.
		System.out.println(list);
		System.out.println(list.get(0)); // �����ȹ�ȣ �̾��ش�.
		list.clear(); // ��ü ����.
		System.out.println(list);	
		
	}
}
