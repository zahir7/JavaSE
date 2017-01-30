package test.mypac;

public class MyUtil {
	
	public static class HelloPrinter{
		public final static String NAME="오늘의 인사";
		
		//메소드
		public void printHello(){
			System.out.println("Hello World!");
		}
	}
	public static class Calculator{
		//메소드
		public void calc(int a,int b){
			int result=a+b;
			System.out.println("전달받은 두정수의 합:"+result);
		}
	}
}
