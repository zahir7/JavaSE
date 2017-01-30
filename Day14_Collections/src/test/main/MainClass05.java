package test.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * [[ HashMap Class ]]
 * 
 * -Map 인터페이스를 구현한 클래스 이다
 * -key 값, value 값 을 쌍으로 저장된다(사전 형태)
 * */
public class MainClass05 {
	public static void main(String[] args) {
		//HashMap 객체 생성해서 변수에 담기
		HashMap<Integer,String> map1=
				new HashMap<Integer,String>();
		//데이터 저장하기
		map1.put(1111,"백두산");
		map1.put(22,"한라산");
		map1.put(32,"소백산");
		map1.put(41,"지리산");
		map1.put(5123,"관악산");
		
		//데이터 빼오기
		String str=map1.get(3);
		System.out.println(str);
		
		//맵에 있는 모든 데이터를 출력하려면?
		//키값을 저장하고 있는 Set 객체 얻어오기
		Set<Integer> set=map1.keySet();
		//Iterator(반복자) 객체얻어오기
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()){ // 자료가 있다면 반복문을 돈다.
			//키값 읽어오기.
			int keyValue=it.next();
			//해당 키값에 해당되는 객체를 HashMap에서 읽어오기
			String value=map1.get(keyValue);
			//출력해보기
			System.out.println(value);
		}
		
	}
}










