package day5_2;

import java.util.Scanner;
import day5_2.smart.EtcSmartPhone;
import day5_2.smart.Galluxy;
import day5_2.smart.Iphone;

/*
 * 
 * JVM �޸� ����
 * 
 * Ŭ����
 * ������ - �����ε�
 *  static block ������
 * 	block ������ 
 * 	�Ϲ� ������
 * 	** �������
 * ���� 
 * 	�⺻��, ������
 *  ������ġ
 *  ���� ����
 * �޼ҵ�
 * 	�����ε�
 * 	����������
 * 	����Ÿ��
 * 	�Ķ��Ÿ
 * 
 * ��ü
 * 	��� - ������ �߿�!!!!!!!!!
 * 		�������̵� 
 * 		����� 1���� ����.
 * 	�������̽�
 * 		ǥ��ȭ,Ʋ
 * 		�������̵�
 *  �߻�Ŭ����
 *  	�̿ϼ�Ŭ����
 *  	�̿ϼ� �޼ҵ� ����.	 - �������̵����� ������ ������ �ϼ�.
 *  
 * 
 */

public class MainEx {
	
	static int total = 10;
	
	public static void main(String[] args) {
		while(true){
			System.out.println("�� ����Ʈ��  ��� : " + total );
			System.out.println("������ ����Ʈ���� ���ÿ�.");
			System.out.println("1. ������");
			System.out.println("2. ������");
			System.out.println("3. ��Ÿ����Ʈ��");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			int result = sc.nextInt();
			
			if(result == 1){
				System.out.println("������ �Դϴ�.");
				Galluxy g = (Galluxy)phone82(new Galluxy());
				g.no_water();
			}else if(result == 2){
				System.out.println("������ �Դϴ�.");
				Iphone i = (Iphone)phone82(new Iphone());
				i.siri();
			}else if(result == 3){
				System.out.println("��Ÿ����Ʈ�� �Դϴ�.");
				EtcSmartPhone etc = (EtcSmartPhone)phone82(new EtcSmartPhone());
				etc.etc();
			}else{
				System.out.println("�����մϴ�.");
				break;
			}
		}
		System.out.println("�� ���� " + total+"�� �Դϴ�.");
	}
	
	public static Object phone82(Object sp){
		total--;
		
		return sp;
	}
	
	
}
