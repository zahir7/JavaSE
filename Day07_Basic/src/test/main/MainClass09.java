package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		//final ��� ���� �ϱ�
		final int FIST=0;
		final int SWORD=1;
		final int GUN=2;
		//���⸦ ������ ������ ���� �����ϰ� �� �����ϱ�
		int weapon=FIST; //ó�� ����� ���� �����ϱ�
		
		//����� ������ ������ ���� �ٸ� ������ �ϰ� �ϱ� ���ؼ�
		switch(weapon){
		case FIST :
			System.out.println("�ָ����� ����!");break;
		case SWORD :
			System.out.println("Į�� ����!");break;
		case GUN :
			System.out.println("������ ����!");break;
		}//switch()
	}//main
}//calss



