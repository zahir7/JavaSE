package test.quiz;

import java.util.Random;
import java.util.Scanner;

/*
 * ������
 * 
 * �����ϼ��� ( ����:1,����:2,�� :3) 
 * 1 + enter
 * �� : ���� 
 * com : ��
 * ��� : �̰���ϴ�.
 * 
 * �����ϼ��� ( ����:1,����:2,�� :3) 
 * 2 + enter
 * �� : ���� 
 * com : ����
 * ��� : �����ϴ�.
 * 
 * 
 */
public class QuizMain01 {
	public static void main(String[] args) {
		//�ʿ��� ��ü �����ϱ�
		
		//���ڸ� �Է� �ޱ� ���ؼ�
		Scanner scan=new Scanner(System.in);
		System.out.println("�����ϼ��� ( ����:1,����:2,�� :3)");
		int userNum=scan.nextInt(); //���� �Է� �޴� ���
		
		//������ ���� �߻���Ű�� ���ؼ�
		Random ran=new Random();
		// 1~3 ������ ���߿��� �����Ѽ� �߻���Ű��.
		int ranNum=ran.nextInt(3)+1; 
		String result=null; //��� ���� ���� ����
		String user=null;
		String com=null;
		//����ڰ� �� ���� ����ϱ� ���ؼ�.
		if(userNum==1){
			user="����";
		}else if(userNum==2){
			user="����";
		}else if(userNum==3){
			user="��";
		}
		//��ǻ�Ͱ� �� ���� ����ϱ� ���ؼ�
		if(ranNum==1){
			com="����";
		}else if(ranNum==2){
			com="����";
		}else if(ranNum==3){
			com="��";
		}
		
		//�ºθ� �Ǻ��ϱ� ���ؼ�
		if(userNum==ranNum){ //�����
			result="�����ϴ�.";
		}else if(userNum==1 && ranNum==2){ //����:���� >>�����
			result="�����ϴ�.";
		}else if(userNum==1 && ranNum==3){ //����:�� >> �̱���
			result="�̰���ϴ�.";
		}else if(userNum==2 && ranNum==1){ //����:���� >> �̱���
			result="�̰���ϴ�.";
		}else if(userNum==2 && ranNum==3){ //����:���� >> �����
			result="�����ϴ�.";
		}else if(userNum==3 && ranNum==1){ //�� :���� >> �����
			result="�����ϴ�.";
		}else if(userNum==3 && ranNum==2){ //�� :���� >> �̱���
			result="�̰���ϴ�.";
		}
		//��� �� ����ϱ�	
		System.out.println("��: "+user);
		System.out.println("com: "+com);
		System.out.println("���: "+result);
		
	}
}











