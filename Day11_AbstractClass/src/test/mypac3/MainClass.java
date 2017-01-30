package test.mypac3;

public class MainClass {
	
	public static void main(String[] args) {
		//만일 Woman 추상클래스를 상속받은 객체가 필요하다면???
		Woman w=new Woman() {
			@Override
			public void dance() {
				System.out.println("춤을 춰요");
			}
		};
	}
}





