package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		String num="100";
		//���ڿ��� ����(����)�� �ٲٱ�
		int parsedNum = Integer.parseInt(num);
		int result = 100 + parsedNum;
		System.out.println("����:"+result);
		
		String str = Integer.toString(result);
		
		System.out.println("���ڿ�:"+str);
		
	}
}
