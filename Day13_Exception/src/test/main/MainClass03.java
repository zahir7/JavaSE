package test.main;

import java.util.Random;

public class MainClass03 {
	public static void main(String[] args) {
		Random ran=new Random();
		
		try{
			System.out.println("DB �� �����մϴ�.");
			System.out.println(ran.nextInt()/0);
			System.out.println("DB ���� �۾��� �մϴ�.");
			
		}catch(Exception e){
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}finally{ //�ݵ��� ������ ����Ǵ� ��
			System.out.println("DB ������ �����մϴ�.");
		}
		
		System.out.println("�۾��� �����մϴ�.");
	}
}








