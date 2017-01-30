package test.client;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoFileClient {
	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			//3 Socket ��ü ����
			socket = new Socket("192.168.0.157",3000);
			//4 Socket ��ü�� ��� ��Ʈ���� ����
			OutputStream out = socket.getOutputStream();
			//5.��� ��Ʈ��(out)���� ���ϸ��� ������ ������.
			out.write("naver.jpg".getBytes());
			
			//7. ������ �о� �������� FileInputStream ��ü�� �����Ѵ�.
			FileInputStream fis = null;
			//7
			fis = new FileInputStream(
					"c:\\naver.jpg");
			//7
			byte[] b = new byte[1024];
			//7
			int readByteCnt = 0;
			
			//fis.read(b) ���� ������ ������ �о b�� �����Ѵ�.
			while((readByteCnt = fis.read(b))!= -1){
				//8.��� ��Ʈ������ �о�� ����(b)�� ���������� ����Ѵ�.
				out.write(b,0,readByteCnt);
			}
			
			
			//
			out.close();
			
			socket.close();
			
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
