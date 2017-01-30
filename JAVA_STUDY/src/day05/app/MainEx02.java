package day05.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*

	인터페이스 ?
	추상메소드 집합... 클래스가 아니다. 그러므로 인터페이스로는 객체 생성이 되지 않음.
	표준화 시킬때 사용.
	
	클래스나 추상 클래스는 단일 상속만 가능.
	인터페이스는 다중 상속이 가능.
	
	골격.. 구조.. 틀.. 양식.. 
	
	
	Wrapper 클래스
	
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
		
		// 확장 for문인데 jdk 1.5부터인가?
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
