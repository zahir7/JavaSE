package test.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JFrame;

public class UnicastServer {
	private ServerSocket serverSocket;
	private Socket socket ;
	public UnicastServer(int port){
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO: handle exception
		}
		while(true){
			System.out.println("클라이언트 접속 대기중...");
			try {
				socket = serverSocket.accept();
				
				System.out.println("클라이언트 접속("+
				socket.getInetAddress().getHostAddress()+")");	
				UnicastServerThread ust = 
						new UnicastServerThread(this);
				Thread t = new Thread(ust);
				t.start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Socket getSocket(){
		return socket;
	}
	public static void main(String[] args) {
		new UnicastServer(9898);
	}
}
