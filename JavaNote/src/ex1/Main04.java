package ex1;

class TvTest04{
	int channel = 1;
	boolean power = false;
	void channerUp(){	System.out.println(" ä�� ���� ");	}
	void onoff(){	System.out.println("����");	}
}
class VideoTest04 extends TvTest04{
	void play(){
		System.out.println(" ��� ");
	}
}
public class Main04 {
	public static void main(String[] args) {
		VideoTest04 v1 = new VideoTest04();
		TvTest04 t1 = null;
		VideoTest04 v2 = null;
		
		t1 = (TvTest04)v1;
		// t1.play();		
		t1.channerUp();
		t1.onoff();		
		v2 = (VideoTest04)t1;
		v2.play();
				
		double a = 5.6;
		int b = (int)a;
		double c = (double)b;
		
		System.out.println(c);		
		
	}
}
