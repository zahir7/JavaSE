package test.main;
/*
 * while ���� �̿��ؼ� 1~100 ���� ���� ���ؼ� ����ϴ� ����
 */
public class MainClass12 {
	
	public static void main(String[] args) {
		//ī��Ʈ�� ���� ���� ����
		int count=0;
		//���� ������ ����
		int sum=0;
		//while ���� �����ϱ� ���� boolean  ����
		boolean isCommit = true;
		//�ݺ��� ���鼭 ���ڸ� ���ؼ� sum �̶�� ������ ���� ��Ű��
		while(isCommit){
			count = count + 1;
			sum = sum + count;
			if(count == 100) isCommit=false;
		}
	
		System.out.println("1~100������ ����: "+sum);
	}
}
