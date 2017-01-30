package ex1;

import java.util.HashMap;



public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map= new HashMap<>();
		map.put("java", "test");
		map.put("jsp", 100);
		map.put(200, "frameworks");
		System.out.println(map);		
		System.out.println(map.get("java"));
	}
}
