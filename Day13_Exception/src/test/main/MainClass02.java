package test.main;

import java.util.Random;

/*
 * [[ �ͼ���(Exception) : ���� ]]
 * -���α׷� ���൵�� �߻��Ǵ� ������ �ش��Ѵ�.
 * -���� ó�� : ���ܰ� �߻��Ǿ����� �̸� ó�� �ϴ°�
 * -ó���ϴ� ��� :
 * 
 * try{
 * 	���๮��;
 *  .
 *  .
 * }catch(�ͼ���Ŭ������   ������){
 * 	�ش� ���ܰ� �߻�������� ������ ���� ;
 *  .
 *  .
 * }
 */
public class MainClass02 {
	public static void main(String[] args) {
		//�������� ������ �������� �ʱ�ȭ �ϱ�
		int num1=10,num2=0,result=0;
		Random ran=null;
		
		try{
			ran.nextInt();
			//�����ϱ�
			result=num1/num2;
			//���� ���๮��
			System.out.println("------------");
		}catch(ArithmeticException ae){
			System.out.println("��� ���� 0���� ������ �����ϴ�.");
		}catch(NullPointerException ne){
			System.out.println("null ����Ʈ �ͼ����� �߻��߽��ϴ�.");
		}catch(Exception e){
			System.out.println("���ܰ� �߻��߽��ϴ�");
		}
		
		//����� ����ϱ�
		System.out.println("������:"+result);
	}
}
















