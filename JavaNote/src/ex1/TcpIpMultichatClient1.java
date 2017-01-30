package ex1;

import java.io.*;
import java.net.*;
import java.util.*;



public class TcpIpMultichatClient1 {
	public static void main(String[] args) {
		if(args.length!=1){
			System.out.println("USAGE: java TcpIpMultichatClient ��ȭ��");
			System.exit(0);
		}
		try {
			String serverIp = "220.86.7.138";
			//��Ĺ�� �����Ͽ� ������ ��û�Ѵ�.
			Socket socket = new Socket(serverIp, 7777);
			System.out.println("������ ����Ǿ����ϴ�.");
			Thread sender = new Thread(new ClientSender(socket, args[0]));
			Thread receiver = new Thread(new ClientReceiver(socket));
			sender.start();
			receiver.start();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	} // main
	static class ClientSender extends Thread{
		Socket socket;
		DataOutputStream out;
		String name;
		ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name =name;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void run(){
			Scanner scanner = new Scanner(System.in);
			try {
				if(out!=null){
					out.writeUTF(name);
				}
				while(out!=null){
					out.writeUTF("["+name+"]"+scanner.nextLine());
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		ClientReceiver(Socket socket){
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}		
		public void run() {
			while(in!=null){
				try {
					System.out.println(in.readUTF());
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				} // try
			} // while			
		} // run()
	} // class ClientsReceiver
	
} // class 
