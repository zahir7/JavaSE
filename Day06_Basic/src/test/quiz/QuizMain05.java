package test.quiz;

import java.util.Scanner;

/*
 * Scanner ��ü�� �̿��ؼ� ����ڰ� �Է��� �ܿ� �ش��ϴ� �������� ����ϼ���.
 * 
 * ������
 * 
 * ����ϰ� ���� ���� �Է��ϼ���.
 * 2 + enter
 * 
 * 2 * 1 = 2
 * 2 * 2 = 4
 * 2 * 3 = 6
 * .
 * .
 * 2 * 9 = 18
 * 
 * 
 */
public class QuizMain05 {
	public static void main(String[] args) {
		//Scanner ��ü �����ϱ�
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.println("����ϰ� ���� ���� �Է��ϼ���(����:0)");
			int dan=scan.nextInt(); //������ �Է¹ޱ�
			if(dan==0)break; // 0�� �Է��ϸ� ����
			if(dan < 2 || dan > 9 ){
				System.out.println("2~9 ������ ���� �Է��ϼ���");
				continue; //�ݺ����� ó������ �ٽ� ��������� �̵��Ѵ�.
			}
			//�ݺ��� ���鼭 ������ ����ϱ�.
			for(int i=1 ; i <= 9 ; i++){
				int result = dan * i;
				System.out.println(dan+" * "+i+" = "+result);
			}//for
		}//while
	}
}















