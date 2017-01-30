package test.main;

import java.util.Scanner;

public class MainClass02 {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		//사용자로 부터 문자나 숫자를 입력 받기 위해서
		//Scanner 객체 생성하기
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요!");
		
		String str = scan.next();
		
		System.out.println("사용자가 입력한 문자열:"+str);
	}
}
