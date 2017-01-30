package test.main;

import java.util.Random;
import java.util.Scanner;

/*
 * [[ Scanner,Random,Math ...]]
 */
public class MainClass {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력");
		//키보드로 문자열 입력받기.
		//String str=scan.next();
		
		Random ran=new Random();
		//0~9 사이의 정수중 난수 발생 시키기
		int ranNum=ran.nextInt(10);
		
		System.out.println(ranNum);
		// 5 의 10 승을 구하려면?
		double result=Math.pow(5, 10);
		
	}
}















