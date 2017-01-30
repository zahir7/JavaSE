package test.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JFrame;

public class MultiServer {
	private ServerSocket serverSocket;
	private Socket socket ;
	private ArrayList list;
	public MultiServer(int port){
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO: handle exception
		}
		while(true){
			System.out.println("클라이언트 접속 대기중...");
			try {
				socket = serverSocket.accept();
				
				MultiServerThread mst = 
						new MultiServerThread(this);
				list.add(mst);
				Thread t = new Thread(mst);
				t.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public ArrayList getList(){
		return list;
	}
	public Socket getSocket(){
		return socket;
	}
	public static void main(String[] args) {
		new MultiServer(9898);
	}
}
