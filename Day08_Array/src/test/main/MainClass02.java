package test.main;
/*
 *  1.���ڿ��� 5 �� ������ �ִ� �迭 ��ü�� �����ϰ� 5���� �̸��� �����غ�����.
 *  2.����� �迭�� ������ ��� ����� ������.
 *  3.����� �迭�� ������ �����ϰ� ����� ������.
 */
public class MainClass02 {
	public static void main(String[] args) {
		//�迭��ü �����ϱ�
		String[] names=new String[5];
		//������ �濡 �̸� �����ϱ�
		names[0] = "����ȣ";
		names[1] = "ȫ�浿";
		names[2] = "���߳�";
		names[3] = "������";
		names[4] = "������";
		//�迭�� ����� ������ for ���� �̿��ؼ� ����ϱ�
		for(int i=0 ; i < names.length ; i++){
			System.out.println(names[i]);
		}
		//Ȯ�� for ���� �̿��ؼ� ����ϱ�
		for(String tmp:names){
			System.out.println(tmp);
		}
		names[4] = "ȣ����";
		//Ȯ�� for ���� �̿��ؼ� ����ϱ�
		for(String tmp:names){
			System.out.println(tmp);
		}
		
	}
}























