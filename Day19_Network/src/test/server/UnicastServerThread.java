package test.server;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
			e.printStackTrace();
			isStop = true;
		}
		while(!isStop){
			try {
				//msg는 2가지 형태로 존재함.
				//1.   1    #   id    #  message =>일반 메세지
				//  temp[0]   temp[1]    temp[2]
				//2.   2    #   id               =>종료 메세지 
				//  temp[0]   temp[1]            
				String msg = br.readLine();
				String[] temp = msg.split("#");
				if(temp[0].equals("1")){
					//일반 메세지
					bw.write("1#"+temp[1]+"#"+temp[2]);
					//bw.write(msg);
					bw.newLine();
					bw.flush();
				}else if(temp[0].equals("2")){
					//종료 메세지
					bw.write("2#"+temp[1]);
					//bw.write(msg);
					bw.newLine();
					bw.flush();
					//쓰레드 종료
					isStop = true;
				}
			} catch (IOException e) {				
				isStop = true;
			}
		}
	}
}

