package test.main;

public class MainClass16 {
	public static void main(String[] args) {
		int num=10;
		float f= 10.1f;
		double d= 99.9;
		String addr="�뷮��";
		boolean isWait=false;
		//�Ʒ��� �ΰ��� �޼ҵ带 ���⿡�� ȣ���غ�����.
		aaa(num, d, addr);
		bbb(f ,isWait ,d ,addr );
	}
	public static void aaa(int a,double b,String c){
		System.out.println("aaa�޼ҵ� �� ȣ��Ǿ����ϴ�.");
	}
	public static void bbb(float a,boolean b,double c,String d){
		System.out.println("bbb�޼ҵ� �� ȣ��Ǿ����ϴ�.");
	}
}
