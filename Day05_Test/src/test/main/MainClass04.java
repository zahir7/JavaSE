package test.main;

import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		//���ڸ� ���� �Է� �ޱ� ���ؼ�
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int num = scan.nextInt();
		
		System.out.println("�̸��� �Է��ϼ���:");
		String name = scan.next();
		
		if(num >= 90){
			System.out.println("��");
		}else if(num >= 80){
			System.out.println("��");
		}else if(num >= 70){
			System.out.println("��");
		}else if(num >= 60){
			System.out.println("��");
		}else{
			System.out.println("��");
		}
		System.out.println("�̸�:"+name);
		
	}
}
