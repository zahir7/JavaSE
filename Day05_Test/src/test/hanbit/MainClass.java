package test.hanbit;

public class MainClass {
	//���α׷��� �������� �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		//OurClass ��ü �����ϱ�
		OurClass our = new OurClass();
		String name = our.getRandomName();
		System.out.println(" ��÷�� �л�:"+name);
	}
}
