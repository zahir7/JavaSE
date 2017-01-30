package test.main;

public class MainClass01 {
	
	public static void main(String[] args) {
		//내부 클래스를 이용해서 객체 생성후 메소드 사용하기.
		new InnerClass().doSomething();
	}
	static class InnerClass{
		//메소드 
		public void doSomething(){
			System.out.println("무언가를 해요!");
		}
	}
}
























