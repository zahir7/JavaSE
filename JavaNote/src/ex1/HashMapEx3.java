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
		//map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(80));
		map.put("���ڹ�", new Integer(90));
		
		Set set = map.entrySet(); // entrySet ����Ÿ���� Set .. ��� Ű �������� ������ �ϳ��� ����.
		System.out.println(set);
		Iterator it = set.iterator(); //�ݺ��� 
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); //Map.Entry ����Ŭ����.. = �� �߽����� key value�� �����ش�. Iterator.next()�� ���� ������ Ŀ���� �����ش�
			System.out.println("�̸� : "+ e.getKey() +
								", ���� : " + e.getValue());
		}
		set = map.keySet(); //keySet() ->Ű�� �����°�..
		System.out.println("������ ��� : " + set);
		
		Collection values = map.values();//values -> ���� �����°�..
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()){
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
	}
}