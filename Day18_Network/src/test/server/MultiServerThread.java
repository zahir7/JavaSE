package test.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MultiServerThread implements Runnable{
	
	private BufferedReader br;
	private BufferedWriter bw;
	private MultiServer ms;
	public MultiServerThread(MultiServer ms){
		this.ms = ms;
	}
	public void run(){
		boolean isStop = false;
		try {
			br = new BufferedReader(
				new InputStreamReader(ms.getSocket().getInputStream()));
			bw = new BufferedWriter(
					new OutputStreamWriter(ms.getSocket().getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isStop = true;
		}
		while(!isStop){
			try {
				String msg = br.readLine();
				String[] temp = msg.split("#");
				if(temp[0].equals("1")){
					broadcast("1#"+temp[1]+" : "+temp[2]+System.getProperty("line.separator"));
				}else if(temp[0].equals("2")){
					broadcast("2#"+temp[1]+System.getProperty("line.separator"));
					isStop = true;
					ms.getList().remove(this);
				}
			} catch (IOException e) {				
				isStop = true;
			}
		}
	}
	private void broadcast(String msg) throws IOException{
		for(int i=0;i<ms.getList().size();i++){
			MultiServerThread mst = (MultiServerThread)
					ms.getList().get(i);
			mst.send(msg);
		}
	}
	private void send(String msg) throws IOException{
		bw.write(msg);
		bw.flush();
	}
}

