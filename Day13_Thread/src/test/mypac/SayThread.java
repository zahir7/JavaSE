package test.mypac;

import java.util.Random;

public class SayThread extends Thread{
	
	String[] msg={"안녕","심심해","배고파","으 지겨워","졸려",
			"목말라","맥주한잔콜?","감기 걸렸어","전화온다.","..."};
	
	@Override
	public void run() {
		Random ran=new Random();
		while(true){//무한 루프를 만든다.
			//0~9 사이의 수중에서 랜덤한 수를 생성한다.
			int ranNum=ran.nextInt(10);
			//배열에서 랜덤으로 생성된 번호에 해당하는 인덱스 값을 읽어와서
			//출력한다.
			System.out.println(msg[ranNum]);
			try {
				Thread.sleep(5000);//매주기 5초씩 쉰다.
			} catch (InterruptedException e) {}
		}//while
	}//run()
}



