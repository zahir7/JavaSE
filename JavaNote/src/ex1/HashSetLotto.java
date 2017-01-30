package ex1;

import java.util.*;

class HashSetLotto {
	public static void main(String[] args) {
		Set set = new TreeSet(); //Tree가 들어간 클래스는 정렬을하기때문에 속도는 느리다. 
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1;
			set.add(new Integer(num));			
		}
		//List list = new LinkedList(set);
		//Collections.sort(list);
		System.out.println(set);
	}
}
