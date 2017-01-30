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
				//msg�� �ΰ��� ����
				//1. 1#id#message => �Ϲݸ޼���
				//2. 2#id         => ����޼���
				String msg = uc.getBufferedReader().readLine();
				String[] temp = msg.split("#");
				if(temp[0].equals("1")){
					//�Ϲ� �޼���
					//JTextArea�� �������� ���� �޼��� ���
					uc.getJTextArea().append(
						temp[1]+" : "+temp[2]+
						System.getProperty("line.separator"));
					//JTextArea�� ��ũ�� ������ ���.
					uc.getJTextArea().setCaretPosition(
				uc.getJTextArea().getDocument().getLength());
				}else if(temp[0].equals("2")){
					//���� �޼���
					//������ ����
					isStop = true;
					
				}
			} catch (IOException e) {
				isStop = true;
				
			}
		}//end while
		
		//Socket�� IO ����
		uc.closeAll();
		//���α׷� ����
		uc.exit();
		
	}//end run
}

