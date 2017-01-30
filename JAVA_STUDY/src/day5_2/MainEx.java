package day5_2;

import java.util.Scanner;
import day5_2.smart.EtcSmartPhone;
import day5_2.smart.Galluxy;
import day5_2.smart.Iphone;

/*
 * 
 * JVM 메모리 구조
 * 
 * 클래스
 * 생성자 - 오버로딩
 *  static block 생성자
 * 	block 생성자 
 * 	일반 생성자
 * 	** 실행순서
 * 변수 
 * 	기본형, 참조형
 *  선언위치
 *  정적 동적
 * 메소드
 * 	오버로딩
 * 	접근제어자
 * 	리턴타입
 * 	파라메타
 * 
 * 객체
 * 	상속 - 다형성 중요!!!!!!!!!
 * 		오버라이딩 
 * 		상속은 1개만 가능.
 * 	인터페이스
 * 		표준화,틀
 * 		오버라이딩
 *  추상클래스
 *  	미완성클래스
 *  	미완성 메소드 있음.	 - 오버라이딩으로 재정의 함으로 완성.
 *  
 * 
 */

public class MainEx {
	
	static int total = 10;
	
	public static void main(String[] args) {
		while(true){
			System.out.println("총 스마트폰  재고 : " + total );
			System.out.println("사고싶은 스마트폰을 고르시오.");
			System.out.println("1. 갤럭시");
			System.out.println("2. 아이폰");
			System.out.println("3. 기타스마트폰");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			int result = sc.nextInt();
			
			if(result == 1){
				System.out.println("갤럭시 입니다.");
				Galluxy g = (Galluxy)phone82(new Galluxy());
				g.no_water();
			}else if(result == 2){
				System.out.println("아이폰 입니다.");
				Iphone i = (Iphone)phone82(new Iphone());
				i.siri();
			}else if(result == 3){
				System.out.println("기타스마트폰 입니다.");
				EtcSmartPhone etc = (EtcSmartPhone)phone82(new EtcSmartPhone());
				etc.etc();
			}else{
				System.out.println("종료합니다.");
				break;
			}
		}
		System.out.println("총 재고는 " + total+"개 입니다.");
	}
	
	public static Object phone82(Object sp){
		total--;
		
		return sp;
	}
	
	
}
