package test.main;

import java.util.Random;

public class MainClass03 {
	public static void main(String[] args) {
		//������ ���� �߻� ��Ű�� ���ؼ�
		Random ran = new Random();
		int ranNum = ran.nextInt(45)+1;
		System.out.println("�������� ������ ��:"+ranNum);
		//75~100 
		ranNum=ran.nextInt(26)+75;
		// -25 ~ + 25
		ranNum=ran.nextInt(51);
		
	}
}
