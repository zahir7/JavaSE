package test.main;
/*
 * [[ ������������(���۷�����) ]]
 * String ��
 * -�����ϴ� ���
 * 	String ������;
 * 	-���ڿ��� �����Ҽ� �ִ�.
 */
public class MainClass07 {
	public static void main(String[] args) {
		//���� ����� ���ÿ� �� �����ϱ�
		String str = "���� Ư���� ���α� ���ε�";
		boolean isContain = str.contains("Ư����");
		if(isContain){
			System.out.println("str ���� Ư���� ��� ���ڿ��� �־��");
		}
		System.out.println("4��° �ε���:"+str.charAt(3));
		
		//������ ����� ������ ���ڿ��� ����غ���.
		System.out.println(str);
	}
}
