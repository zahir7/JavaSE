package test.main;

import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		//숫자를 직접 입력 받기 위해서
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int num = scan.nextInt();
		
		System.out.println("이름을 입력하세요:");
		String name = scan.next();
		
		if(num >= 90){
			System.out.println("수");
		}else if(num >= 80){
			System.out.println("우");
		}else if(num >= 70){
			System.out.println("미");
		}else if(num >= 60){
			System.out.println("양");
		}else{
			System.out.println("가");
		}
		System.out.println("이름:"+name);
		
	}
}
