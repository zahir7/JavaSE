package ex1;

import java.util.*;

class HashSetLotto {
	public static void main(String[] args) {
		Set set = new TreeSet(); //Tree�� �� Ŭ������ �������ϱ⶧���� �ӵ��� ������. 
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));			
		}
		//List list = new LinkedList(set);
		//Collections.sort(list);
		System.out.println(set);
	}
}
