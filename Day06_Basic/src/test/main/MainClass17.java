package test.main;
/*
 * ���� ������
 * 
 * ���ǽ� ? ���ǽ��� ���ΰ�� : ���ǽ��� �����ΰ��
 * 
 */
public class MainClass17 {
	public static void main(String[] args) {
		int num = 10;
		
		String result = num > 0 ? "num �� ���" : "num �� ����";
		System.out.println(result+" �Դϴ�.");
		
		String result2=null; //�������� ����� ���ÿ� �ʱ�ȭ �ϱ�
		if(num>0){
			result2="num �� ���";
		}else{
			result2="num �� ����";
		}
		System.out.println(result2+" �Դϴ�.");
		
	}
}








