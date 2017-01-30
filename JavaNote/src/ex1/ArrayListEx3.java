package ex1;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //제너릭은 기본형을 선언할 수 없다. 참조형만 선언해야한다.
		list.add("sdafsadf");		
		list.add(100);
		
		Object s = list.get(0); // 어떤형태가 올지 모르기 ??문에 Object로 받아줘야한다.
		
		System.out.println(s);
		
	}
}
