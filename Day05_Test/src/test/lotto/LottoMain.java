package test.lotto;

import java.util.Random;

// 1~45 �� ���� �߿��� �ߺ����� �ʴ� �� 6���� �̾Ƴ��� ����

public class LottoMain {
	
	public static void main(String[] args) {
		//������ �����Ҽ��ִ� �迭 ��ü �����ϱ� 45���� ��
		int[] lottoNum = new int[45];
		
		//�ݺ��� ���鼭 ������ �濡 ������� ���� �־�α�
		for(int i=0 ; i < 45 ; i=i+1){
			lottoNum[i] = i+1; 
		}
		//������ ���� �߻� ��Ű�� ���ؼ�  Random ��ü �����ϱ�.
		Random ran=new Random();
		//�ݺ��� ���鼭 ���Ƿ� �迭�� ����� ���ڸ� ����(suffle)
		for(int i=0 ; i < 45 ; i=i+1){
			// 0 ~ 44 ������ ������ ������ �� ������.
			int changeIndex = ran.nextInt(45);
			//�ٲ�� �� �ε����� ���� ���� �ε����� �� �ڸ� �ٲٱ�
			int tmp = lottoNum[i]; //���� �ε��� �� �ӽ� ������ ����
			lottoNum[i] = lottoNum[changeIndex];
			lottoNum[changeIndex] = tmp;
		}
		//�迭����  0 ~ 5 ��° �ε����� ����Ȱ� ��� �� ����
		for(int i=0 ; i < 6 ; i=i+1){
			System.out.print(lottoNum[i]+" / ");
		}
	}
}











