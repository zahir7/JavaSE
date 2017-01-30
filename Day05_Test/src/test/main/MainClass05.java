package test.main;

import java.util.Scanner;

/*
 * ������ (BMI) ����
 * 
 *   ��� = ü��(kg) / Ű(m)�� ����
 *   
 *   	     ���  >= 40  		: ���� ��
 *   40 > ���  >= 30 		:��
 *   30 > ���  >= 25 		:��ü��
 *   25 > ���  >= 18.5 		:ǥ����
 *   18.5 > ��� 				:��ü��
 *   
 *   [[ ������ ���� �ϱ� ]]
 *   
 *   ��)Ű : 170 cm   ü�� 60 kg �̶�� ����
 *   ��� = 60 / (1.7)*(1.7)   �� �ȴ�.
 */
public class MainClass05 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ű�� �Է��ϼ���[m]");
		double height = scan.nextDouble(); //Ű �Է� �ޱ�
		
		System.out.println("�����Ը� �Է��ϼ���[kg]");
		int weight = scan.nextInt(); //������ �Է¹ޱ�
		//BMI ���� ����ϱ�
		double bmi = weight / (height*height) ;
		//��� �� ����ϱ�
		if( bmi >= 40){
			System.out.println("���� ���Դϴ�");
		}else if( bmi >= 30){
			System.out.println("�� �Դϴ�.");
		}else if( bmi >= 25){
			System.out.println("��ü�� �Դϴ�");
		}else if( bmi >= 18.5){
			System.out.println("���� �Դϴ�.");
		}else{
			System.out.println("��ü�� �Դϴ�.");
		}
		System.out.println("����� BMI ����:"+bmi);
	}
}

















