package test.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * [[ HashMap Class ]]
 * 
 * -Map �������̽��� ������ Ŭ���� �̴�
 * -key ��, value �� �� ������ ����ȴ�(���� ����)
 * */
public class MainClass05 {
	public static void main(String[] args) {
		//HashMap ��ü �����ؼ� ������ ���
		HashMap<Integer,String> map1=
				new HashMap<Integer,String>();
		//������ �����ϱ�
		map1.put(1111,"��λ�");
		map1.put(22,"�Ѷ��");
		map1.put(32,"�ҹ��");
		map1.put(41,"������");
		map1.put(5123,"���ǻ�");
		
		//������ ������
		String str=map1.get(3);
		System.out.println(str);
		
		//�ʿ� �ִ� ��� �����͸� ����Ϸ���?
		//Ű���� �����ϰ� �ִ� Set ��ü ������
		Set<Integer> set=map1.keySet();
		//Iterator(�ݺ���) ��ü������
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()){ // �ڷᰡ �ִٸ� �ݺ����� ����.
			//Ű�� �о����.
			int keyValue=it.next();
			//�ش� Ű���� �ش�Ǵ� ��ü�� HashMap���� �о����
			String value=map1.get(keyValue);
			//����غ���
			System.out.println(value);
		}
		
	}
}










