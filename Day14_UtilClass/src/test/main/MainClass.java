package test.main;

import java.util.Random;
import java.util.Scanner;

/*
 * [[ Scanner,Random,Math ...]]
 */
public class MainClass {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڿ� �Է�");
		//Ű����� ���ڿ� �Է¹ޱ�.
		//String str=scan.next();
		
		Random ran=new Random();
		//0~9 ������ ������ ���� �߻� ��Ű��
		int ranNum=ran.nextInt(10);
		
		System.out.println(ranNum);
		// 5 �� 10 ���� ���Ϸ���?
		double result=Math.pow(5, 10);
		
	}
}















