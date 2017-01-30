package test.server;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoFileServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			//1 ServerSocket ��ü ����
			serverSocket = new ServerSocket(3000);
			
			System.out.println("Ŭ���̾�Ʈ ��û �����.....");
			//2 accept() �޼���� Ŭ���̾�Ʈ�� ��û�� ��ٸ�
			Socket s = serverSocket.accept();
			
			System.out.println("Ŭ���̾�Ʈ ��û ����.....");
			
			//4 Socket ��ü�� �Է½�Ʈ�� ��ü�� ����
			InputStream in = s.getInputStream();
			//4
			byte[] b = new byte[1024];
			//4
			int readByteCnt = 0;
			
			//6 �Է� ��Ʈ������ ���ϸ��� ����(b)��.
			readByteCnt = in.read(b);
			String fileName = new String(b,0,readByteCnt);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			FileOutputStream fos = null;
			//7. ������ �����ϱ� ���� FileOutputStream ��ü�� �����Ѵ�.
			
			fos = new FileOutputStream("c:\\temp\\"+fileName);
			
			//9. Ŭ���̾�Ʈ���� ������ ������ �о b�� �����Ѵ�.
			while( (readByteCnt = in.read(b)) != -1){
				//10 b�� ����� ������  ���� ���Ͽ� �����Ѵ�.
				fos.write(b,0,readByteCnt);
			}
			
			in.close();
			s.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
