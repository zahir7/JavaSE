package test.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class UnicastServer {
	private ServerSocket serverSocket;
	private Socket socket ;
	public UnicastServer(int port){
		try {
			//ServerSocket 객체 생성
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO: handle exception
		}
		while(true){
			System.out.println("클라이언트 접속 대기중...");
			try {
				//ServerSocket으로 클라이언트 요청 대기
				//클라이언트에서 요청이 들어오면 Socket 객체를 생성
				socket = serverSocket.accept();
				
				System.out.println("클라이언트 접속("+
				socket.getInetAddress().getHostAddress()+")");
				
				//클라이언트와 지속적인 채팅을 하기위해서 Thread 생성
				//this는 UnicastServer의 모든 멤버변수를 사용하기
				//위한 변수
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
		new UnicastServer(3000);
	}
}
