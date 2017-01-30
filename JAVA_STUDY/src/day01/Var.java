package day01;

import java.util.Iterator;

// 변수

/*
 * 
 * 파일명.java -> 기계어로 변환(Compile) -> 파일명.class
 * 
 * 객체 (Object) 
 * 
 * 		- 생성자
 * 			: 공장 초기화 값.
 * 		- 변수
 * 			: 속성 값. 예) 자동차 색깔, 연비, 몇륜
 * 		- method(함수)
 * 			: 전진(); , 후진();
 *  
 * 
 * 1. Type 별 변수
 * 
 * 	기본형
 * 		- 무조건 소문자로 시작. 예) int, double, float
 * 
 * 	참조형
 * 		- 대문자로 시작. 객체. 예) String,, 전부다.
 * 
 *  
 * 2. 선언 위치
 * 
 * 	전역 변수	
 * 		- 같은 클래스 내에 어디든 사용가능. 단.. static 구분함..  초기화 안하면 default값이 들어감 (예 null, 0, false)
 * 	지역 변수
 * 		- 지역 같은 메소드?({} 중괄호) 안에서 사용가능. 초기화 반듯이 해줘야 한다.
 * 
 * 3. 정적/동적 변수
 * 
 * 		static(정적) 변수
 * 			- 지역변수 X... 한프로그램내에 한개만 선언됨... 주로 공통변수로 사용함.
 * 		멤버(기본) 변수 
 * 			- 그냥 변수
 * 
 * 
 */

public class Var {
	
	// 전역 변수
	static int c_num1 =11;
	
	//멤버 변수
	int n_num = 10;
	
	
	
	public static void main(String[] args) {
		
		
		Var v = new Var();
		Var v2 = new Var();
		Var v3 = new Var();
		Var v4 = new Var();
		Var v5 = new Var();
		
		v.c_num1= 11;
		v2.c_num1= 21;
		v3.c_num1= 31;
		v4.c_num1= 41;
		v5.c_num1= 51;
		
		v.n_num= 11;
		v2.n_num= 21;
		v3.n_num= 31;
		v4.n_num= 41;
		v5.n_num= 51;
		
		System.out.println(v.c_num1);
		System.out.println(v2.c_num1);
		System.out.println(v3.c_num1);
		System.out.println(v4.c_num1);
		System.out.println(v5.c_num1);
		
		System.out.println(v.n_num);
		System.out.println(v2.n_num);
		System.out.println(v3.n_num);
		System.out.println(v4.n_num);
		System.out.println(v5.n_num);
		
		
		
		
	}
	
	public void test(){
		
		System.out.println(c_num1);
		System.out.println(n_num);
	}
	
	
}
