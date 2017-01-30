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
			//ServerSocket ��ü ����
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			// TODO: handle exception
		}
		while(true){
			System.out.println("Ŭ���̾�Ʈ ���� �����...");
			try {
				//ServerSocket���� Ŭ���̾�Ʈ ��û ���
				//Ŭ���̾�Ʈ���� ��û�� ������ Socket ��ü�� ����
				socket = serverSocket.accept();
				
				System.out.println("Ŭ���̾�Ʈ ����("+
				socket.getInetAddress().getHostAddress()+")");
				
				//Ŭ���̾�Ʈ�� �������� ä���� �ϱ����ؼ� Thread ����
				//this�� UnicastServer�� ��� ��������� ����ϱ�
				//���� ����
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
