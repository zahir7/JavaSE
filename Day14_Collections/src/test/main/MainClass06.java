package test.main;

import java.util.HashMap;

public class MainClass06 {
	public static void main(String[] args) {
		//HashMap 객체 생성하기.
		HashMap<String,String> map=
				new HashMap<String,String>();
		//데이터 저장하기
		map.put("house", "집");
		map.put("hamburger", "빵 사이에 햄이나 스테이크를 넣은것");
		map.put("chicken", "닥");
		map.put("fried chicken", "닭 튀김");
		//저장된 데이터 출력하기
		System.out.println("chicken 의 뜻:"+map.get("chicken"));
		//hamburger 의 뜻을 출력해보세요!
		System.out.println("hamburger 의 뜻:"+map.get("hamburger"));
	}
}





