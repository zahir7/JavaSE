package test.main;
/*
 * �� ������
 * 
 * && : and ����, �������� ����, ������ ���  true �϶��� true
 * || : or ����, �������� ����, ��� ������ true �̸� true
 * !  : not ����, �������� ����, ������ ���� ��Ų�� 
 * 		true>>false false>>true
 */
public class MainClass14 {
	public static void main(String[] args) {
		
		boolean result=true && true;
		System.out.println("&& :"+result);
		
		result = true || false;
		System.out.println("|| :"+result);
		
		result = !false;
		System.out.println(result);
		result = true || false || false || false;
		System.out.println(result);
		result = true && true && true && false;
		System.out.println(result);
	}
}










