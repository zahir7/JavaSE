package ex1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;



public class TcpIpMultichatServer1 {
HashMap clients;
	
	TcpIpMultichatServer1() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}
	
	public void start(){
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("������ ���۵Ǿ����ϴ�.");
			
			while (true) {
				socket = serverSocket.accept(); //������ ��ٸ���.
				System.out.println("["+socket.getInetAddress() + ":" + socket.getPort()+"]"+"���� �����Ͽ����ϴ�.");
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}// while
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}// try ~ catch
	}// start()
	
	void sendToAll(String msg){
		Iterator it = clients.keySet().iterator();
		
		while(it.hasNext()){
			try {
				DataOutputStream out = (DataOutputStream)clients.get(it.next());
				out.writeUTF(msg);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}// while
	}// sendToAll
	
	public static void main(String[] args) {
		new TcpIpMultichatServer1().start();
	}
	
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (Exception e) {			
				e.printStackTrace();
			}
		}
		
		public void run(){
			String name = "";
			try {
				name = in.readUTF();
				sendToAll("#"+name+"���� �����̽��ϴ�.");
				
				clients.put(name, out);
				System.out.println("���� ���������� ���� " + clients.size() + "�Դϴ�.");
				while(in!=null){
					sendToAll(in.readUTF());
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {
				sendToAll("#"+name+"���� �����̽��ϴ�.");
				clients.remove(name);
				System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]"+"���� ������ �����Ͽ����ϴ�.");
				System.out.println("���� ���������� ���� " + clients.size()+"�Դϴ�");
			}// try
		}// run
	} // ReceiverThread
}
