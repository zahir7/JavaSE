package ex1;

import java.util.ArrayList;

class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(100);
		list.add("hello");
		list.add(5.7);
		list.add(1,500);  // 1번자리에 500을 넣겠다는 뜻. 중간에 끼어넣음.
		
		System.out.println(list);
		list.set(1, 777); // 1번자리 777로 변경.
		System.out.println(list);
		list.remove(2); // 지정된 위치 삭제.
		System.out.println(list);
		System.out.println(list.get(0)); // 지정된번호 뽑아준다.
		list.clear(); // 전체 삭제.
		System.out.println(list);	
		
	}
}
