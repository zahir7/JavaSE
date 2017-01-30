package ex1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {
	public static void main(String[] args) {
		HashMap map = new HashMap<>();
		//map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(80));
		map.put("안자바", new Integer(90));
		
		Set set = map.entrySet(); // entrySet 리턴타입이 Set .. 고로 키 벨류값이 묶여서 하나로 들어간다.
		System.out.println(set);
		Iterator it = set.iterator(); //반복자 
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); //Map.Entry 내부클래스.. = 을 중심으로 key value로 나눠준다. Iterator.next()가 값을 꺼내고 커서를 내려준다
			System.out.println("이름 : "+ e.getKey() +
								", 점수 : " + e.getValue());
		}
		set = map.keySet(); //keySet() ->키만 꺼내는거..
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();//values -> 값만 꺼내는거..
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()){
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
	}
}