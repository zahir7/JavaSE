package test.mypac;

public class MyUtil {
	
	public static class HelloPrinter{
		public final static String NAME="������ �λ�";
		
		//�޼ҵ�
		public void printHello(){
			System.out.println("Hello World!");
		}
	}
	public static class Calculator{
		//�޼ҵ�
		public void calc(int a,int b){
			int result=a+b;
			System.out.println("���޹��� �������� ��:"+result);
		}
	}
}
