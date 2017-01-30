package study20120229;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	
	public HashMap getMap(){
		HashMap map = new HashMap();
		
		map.put("1", "1111");
		map.put("2", "2222");
		map.put("3", "3333");
		map.put("4", "4444");
		map.put("4", "5555");
		
		return map;
	}
	
	public static void main(String[] args) {
		MapDemo demo = new MapDemo();
		HashMap map = demo.getMap();
		
		String value1 = (String)map.get("1");
		String value2 = (String)map.get("2");
		String value3 = (String)map.get("3");
		String value4 = (String)map.get("4");
		
		Set set = map.keySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			String key = (String)iterator.next();
			String value = (String)map.get(key);
		}
		
		
		
		
		
		
		
	}
}
