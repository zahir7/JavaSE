package test.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BroadcastServerThread implements Runnable{
	private BufferedReader br;
	private BufferedWriter bw;
	private BroadcastServer bs;
	private String id;
	public BroadcastServerThread(BroadcastServer bs){
		this.bs = bs;
	}
	public synchronized void run(){
		boolean isStop = false;
		try {
			br = new BufferedReader(
				new InputStreamReader(
						bs.getSocket().getInputStream()));
			bw = new BufferedWriter(
					new OutputStreamWriter(
							bs.getSocket().getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
			isStop = true;
		}
		String msg = null;
		while(!isStop){
			try {
				//msg�� 2���� ���·� ������.
				//0.   0    #   id               =>���� �޼���
				//  temp[0]   temp[0]
				//1.   1    #   id    #  message =>�Ϲ� �޼���
				//  temp[0]   temp[1]    temp[2]
				//2.   2    #   id               =>���� �޼��� 
				//  temp[0]   temp[1]   
				//3.   3    # id1,id2,id3,id4.....
				msg = br.readLine();
				if(msg != null){
					String[] temp = msg.split("#");
					if(temp[0].equals("0")){
						broadcast(msg);
						id = temp[1];
						broadcastList("3");
					}else if(temp[0].equals("1")){
						//�Ϲ� �޼���
						broadcast(msg);
					}else if(temp[0].equals("2")){
						broadcast(msg);
						bs.getList().remove(this);
						//������ ����
						isStop = true;
						broadcastList("3");
						System.out.println("Ŭ���̾�Ʈ �����ڼ� : "+
						bs.getList().size());
					}else if(temp[0].equals("3")){
						broadcastList("3");
						System.out.println("Ŭ���̾�Ʈ �����ڼ� : "+
						bs.getList().size());
					}
				}else{
					bs.getList().remove(this);
					broadcastList("3");
					//������ ����
					isStop = true;
					System.out.println("Ŭ���̾�Ʈ �����ڼ� : "+
					bs.getList().size());
				}
			} catch (IOException e) {
				e.printStackTrace();
				bs.getList().remove(this);
				try {
					broadcastList("3");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				isStop = true;
				System.out.println("Ŭ���̾�Ʈ �����ڼ� : "+
						bs.getList().size());
			}
		}
	}
	//broadcastList("3");
	private void broadcastList(String msg) throws IOException{
		ArrayList list = bs.getList();
		//3#id1,id2,id3.....
		for(int i=0;i<list.size();i++){
			BroadcastServerThread bst = 
					(BroadcastServerThread)list.get(i);
			if(i==0)
				msg += "#"+bst.getId();
			else
				msg += ","+bst.getId();
			
		}
		//msg=>3#id1,id2,id3.....
		//msg�� ��� Ŭ���̾�Ʈ���� ����
		for(int i=0;i<list.size();i++){
			BroadcastServerThread bst = 
					(BroadcastServerThread)list.get(i);
			bst.send(msg);
			
		}
	}
	
	private void broadcast(String msg) throws IOException{
		ArrayList list = bs.getList();
		for(int i=0;i<list.size();i++){
			BroadcastServerThread bst = 
					(BroadcastServerThread)list.get(i);
			bst.send(msg);
		}
	}
	
	public void send(String msg) throws IOException{
		bw.write(msg);
		bw.newLine();
		bw.flush();
	}
	public String getId(){
		return id;
	}
	
}

