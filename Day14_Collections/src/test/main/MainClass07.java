package test.main;

import java.util.HashMap;
import java.util.Map;
import test.mypac.Car;

public class MainClass07 {
	public static void main(String[] args) {
		//HashMap ��ü�� Map �������̽� ���·� �������� �ִ�.
		Map<String,Car> carMap=new HashMap<String,Car>();
		
		carMap.put("�뼺��",new Car("���������"));
		carMap.put("������",new Car("����"));
		carMap.put("�����",new Car("����"));
		carMap.put("������",new Car("��Ʋ�� Cooper"));
		carMap.put("�ֿ뱺",new Car("�ƿ��"));
		carMap.put("�����",new Car("K5"));
		
		carMap.get("�ֿ뱺").drive();
		//������� �� �޸��� �غ�����.
	}
}








