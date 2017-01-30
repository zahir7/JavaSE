package test.main;
//다른 페키지에 있는 class 를 사용하기 위해
import test.mypac.ChanelBag;

public class ChanelUserMain {
	//프로그램의 시작점이 되는 메인 메소드
	public static void main(String[] args) {
		
		ChanelBag myBag = new ChanelBag();
		ChanelBag myBag2 = new ChanelBag();
		
		myBag.setItem();
		System.out.println("가방의 색:"+myBag.color);
		
	}
}
