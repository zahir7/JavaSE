package test.main;

import java.util.Scanner;

public class MainClass02 {
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		//����ڷ� ���� ���ڳ� ���ڸ� �Է� �ޱ� ���ؼ�
		//Scanner ��ü �����ϱ�
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���!");
		
		String str = scan.next();
		
		System.out.println("����ڰ� �Է��� ���ڿ�:"+str);
	}
}
