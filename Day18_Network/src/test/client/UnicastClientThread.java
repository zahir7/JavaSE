package test.client;

import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JTextArea;

public class UnicastClientThread extends Thread{
	private UnicastClient uc;
	public UnicastClientThread(UnicastClient uc) {
		this.uc = uc;
	}
	public void run(){
		boolean isStop = false;
		while(!isStop){     
			
			try {
				String msg = uc.getBufferedReader().readLine();
				String[] temp = msg.split("#");
				if(temp[0].equals("1")){
					uc.getJTextArea().append(temp[1]+System.getProperty("line.separator"));
					uc.getJTextArea().setCaretPosition(
						uc.getJTextArea().getDocument().getLength());
				}else if(temp[0].equals("2")){
					if(temp[1].equals(uc.getId())){
						isStop = true;
						uc.closeAll();
						uc.exit();
					}else{
						uc.getJTextArea().append(temp[1]+"¥‘¿Ã ¡æ∑·«œºÃΩ¿¥œ¥Ÿ."+System.getProperty("line.separator"));
						uc.getJTextArea().setCaretPosition(
							uc.getJTextArea().getDocument().getLength());
					}
					
				}
				
			} catch (IOException e) {
				isStop = true;
				
			}
		}
	}
}

