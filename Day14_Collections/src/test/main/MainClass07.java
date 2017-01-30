package test.main;

import java.util.HashMap;
import java.util.Map;
import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {
		//HashMap 객체를 Map 인터페이스 형태로 받을수도 있다.
		Map<String,Car> carMap=new HashMap<String,Car>();
		
		carMap.put("노성일",new Car("람보르기니"));
		carMap.put("조정아",new Car("에쿠스"));
		carMap.put("이재경",new Car("레이"));
		carMap.put("정정선",new Car("벤틀리 Cooper"));
		carMap.put("주용군",new Car("아우디"));
		carMap.put("반장님",new Car("K5"));
		
		carMap.get("주용군").drive();
		//모든차를 다 달리게 해보세요.
	}
}








