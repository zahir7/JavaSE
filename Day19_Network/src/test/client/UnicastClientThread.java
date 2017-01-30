package test.client;

import java.io.IOException;

public class UnicastClientThread extends Thread{
	private UnicastClient uc;
	public UnicastClientThread(UnicastClient uc) {
		this.uc = uc;
	}
	public void run(){
		boolean isStop = false;
		while(!isStop){  
			try {
				//server => client
				//msg는 두가지 종류
				//1. 1#id#message => 일반메세지
				//2. 2#id         => 종료메세지
				String msg = uc.getBufferedReader().readLine();
				String[] temp = msg.split("#");
				if(temp[0].equals("1")){
					//일반 메세지
					//JTextArea에 서버에서 보낸 메세지 출력
					uc.getJTextArea().append(
						temp[1]+" : "+temp[2]+
						System.getProperty("line.separator"));
					//JTextArea의 스크롤 내리기 기능.
					uc.getJTextArea().setCaretPosition(
				uc.getJTextArea().getDocument().getLength());
				}else if(temp[0].equals("2")){
					//종료 메세지
					//스레드 종료
					isStop = true;
					
				}
			} catch (IOException e) {
				isStop = true;
				
			}
		}//end while
		
		//Socket과 IO 종료
		uc.closeAll();
		//프로그램 종료
		uc.exit();
		
	}//end run
}

