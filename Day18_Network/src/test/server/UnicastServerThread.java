package test.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class UnicastServerThread implements Runnable{
	private BufferedReader br;
	private BufferedWriter bw;
	private UnicastServer us;
	public UnicastServerThread(UnicastServer us){
		this.us = us;
	}
	public void run(){
		boolean isStop = false;
		try {
			br = new BufferedReader(
				new InputStreamReader(
						us.getSocket().getInputStream()));
			bw = new BufferedWriter(
					new OutputStreamWriter(
							us.getSocket().getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isStop = true;
		}
		while(!isStop){
			try {
				String msg = br.readLine();
				System.out.println("msg : " +msg);
				String[] temp = msg.split("#");
				if(temp[0].equals("1")){
					bw.write("1#"+temp[1]+" : "+temp[2]+System.getProperty("line.separator"));
					bw.flush();
				}else if(temp[0].equals("2")){
					bw.write("2#"+temp[1]+System.getProperty("line.separator"));
					bw.flush();
					isStop = true;
				}
			} catch (IOException e) {				
				isStop = true;
			}
		}
	}
}

