package test.main;
/*
 * final ��������
 */
public class MainClass04 {
	public static void main(String[] args) {
		
		final double PI=3.14159; //������
		//���� ���� ���ϱ�
		//���� ������
		int r=10;
		double area=PI*r*r;
		System.out.println("���� ����:"+area);
		
		area=Math.PI*Math.pow(r, 2);
		System.out.println("���� ����:"+area);
		
		double d = Math.sin(Math.PI/6);
		System.out.println(d);
		
	}
}











