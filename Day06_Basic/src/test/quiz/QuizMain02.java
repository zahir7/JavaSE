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
public class QuizMain02 {
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
		//����,����,��  ���ڿ��� �迭�� �̸� �����ϱ�
		String[] gameStr={"����","����","��"};
		
		String result=null;
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
		System.out.println("��: "+gameStr[userNum-1]);
		System.out.println("com: "+gameStr[ranNum-1]);
		System.out.println("���: "+result);
		
	}
}











