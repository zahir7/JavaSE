package test.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			//1. 3000�� port�� ServerSocket ��ü�� �����Ѵ�.
			serverSocket = new ServerSocket(3000);
			
			//accept() �޼���� Ŭ���̾�Ʈ�� ��û�� ������ Ŭ���̾�Ʈ��
			//����� �� �ִ� Socket ��ü�� �����Ѵ�.
			System.out.println("Ŭ���̾�Ʈ ��û �����.....");
			//2.
			Socket s = serverSocket.accept();
			
			System.out.println("Ŭ���̾�Ʈ ��û ����.....");
			
			//4.Socket ��ü�� �̿��ؼ� ����Ʈ �Է½�Ʈ�� ��ü�� �����Ѵ�.
			InputStream in = s.getInputStream();
			
			byte[] b = new byte[1024];
			
			//6. Ŭ���̾�Ʈ���� ���� �޽���(hello)�� �о b�� ������.
			int readByteCnt = in.read(b);
			
			System.out.println(new String(b,0,readByteCnt));
			
			//7. Socket ��ü�� �̿��ؼ� ����Ʈ ��� ��Ʈ�� ��ü�� �����Ѵ�.
			OutputStream out = s.getOutputStream();
			
			//8. 
			out.write(b,0,readByteCnt);
			
			//10.
			in.close();
			out.close();
			s.close();
			serverSocket.close();
			
			
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
