package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		//NumberPrinter 객체 생성하기
		NumberPrinter p=new NumberPrinter();
		
		//메소드 사용하기
		try {
			p.printNumber();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
