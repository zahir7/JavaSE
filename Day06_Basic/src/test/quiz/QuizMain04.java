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
public class QuizMain04 {
	public static void main(String[] args) {
		//Scanner ��ü �����ϱ�
		Scanner scan=new Scanner(System.in);
		System.out.println("����ϰ� ���� ���� �Է��ϼ���");
		int dan=scan.nextInt(); //������ �Է¹ޱ�
		//�ݺ��� ���鼭 ������ ����ϱ�.
		for(int i=1 ; i <= 9 ; i++){
			int result = dan * i;
			System.out.println(dan+" * "+i+" = "+result);
		}
	}
}















