package test.member;

import java.util.HashMap;

public class MainClass {
	public static void main(String[] args) {
		//HashMap 객체 생성하기
		HashMap<String,String> map =
				new HashMap<String,String>();
		//객체에 영어 단어 저장하기
		map.put("house", "집");
		map.put("car", "자동차");
		map.put("milk", "우유");
		map.put("computer", "컴퓨터");
		map.put("mouse", "쥐");
		
		//저장된 내용중 하나를 출력해보기
		System.out.println(map.get("mouse"));
	}
}





