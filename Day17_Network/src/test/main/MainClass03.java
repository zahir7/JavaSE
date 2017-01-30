package test.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainClass03 {
	public static void main(String[] args) {
		HashMap<String,String> map = 
				new HashMap<String,String>();
		// Map 저장 => put
		map.put("k1","v1");
		map.put("k2","v2");
		map.put("k3","v3");
		
		// Map 출력 => get()
		String value1 = map.get("k1");
		String value2 = map.get("k2");
		String value3 = map.get("k3");
		
		//Map에 있는 모든 데이터 출력
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			String value = map.get(key);
			System.out.println(key +  " : " + value);
			
		}
		
		
		
		
		
		
		
		
	}
}
