package day05.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*

	�������̽� ?
	�߻�޼ҵ� ����... Ŭ������ �ƴϴ�. �׷��Ƿ� �������̽��δ� ��ü ������ ���� ����.
	ǥ��ȭ ��ų�� ���.
	
	Ŭ������ �߻� Ŭ������ ���� ��Ӹ� ����.
	�������̽��� ���� ����� ����.
	
	���.. ����.. Ʋ.. ���.. 
	
	
	Wrapper Ŭ����
	
	boolean
	int 
	char
	short
	double
	byte
	float
	


*/
public class MainEx02 implements InterfaceEx01, InterfaceEx02 {

	
	public static void main(String[] args) {
		
		int a = 10;
		
		Integer b = 10;
		Character c = 'C';
		
		String strNum = "1234";
		
		int r = Integer.parseInt(strNum);
		
		List list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		// Ȯ�� for���ε� jdk 1.5�����ΰ�?
		for(Object k : list){	
			Integer i = (Integer)k;
		}
		
		
//		System.out.println(str);
		
	}
	
	@Override
	public void interfaceEx01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceEx02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceEx03() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void interfaceEx04() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test5() {
		// TODO Auto-generated method stub
		
	}

}
