package test.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;


public class BroadcastServer {
	private ServerSocket serverSocket;
	private Socket socket ;
	//�����带 �����ϱ� ���� Collection
	private ArrayList list;
	public BroadcastServer(int port){
		try {
			//ServerSocket ��ü ����
			serverSocket = new ServerSocket(port);
			
			list = new ArrayList();
		} catch (IOException e) {
			e.printStackTrace();
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
				BroadcastServerThread ust = 
						new BroadcastServerThread(this);
				list.add(ust);
				System.out.println("Ŭ���̾�Ʈ �����ڼ� : "+
						list.size());
				Thread t = new Thread(ust);
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
		new BroadcastServer(9898);
	}
}
