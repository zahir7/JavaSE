package test.main;
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
public class MainClass01 {
	public static void main(String[] args) {
		//�������� ������ �������� �ʱ�ȭ �ϱ�
		int num1=10,num2=0,result=0;
		try{
			//�����ϱ�
			result=num1/num2;
			//���� ���๮��
			System.out.println("------------");
		}catch(ArithmeticException ae){
			//ae.printStackTrace();
			System.out.println("��� ���� 0���� ������ �����ϴ�.");
		}
		
		//����� ����ϱ�
		System.out.println("������:"+result);
	}
}
















