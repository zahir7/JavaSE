package test.mypac;
//������ ���� Ŭ����
public class Bank {
	//�ɹ� �ʵ� �����
	public String name="��������";
	public static int count;
	//������
	public Bank(){
		count++; //ī��Ʈ �ø���
		System.out.println("�����ڰ� ȣ��Ǿ����ϴ�.");
	}
	//�޼ҵ� �����
	public void setMoney(){
		System.out.println("������ �߽��ϴ�.");
	}
	//static ��� �޼ҵ带 ����� ����غ�����.
	public static void doSomething(){
		System.out.println("���𰡸� �ؿ�!");
	}
}










