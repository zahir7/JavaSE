package test.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			InetAddress ia = InetAddress.getLocalHost();
			
			//3. localhost, 3000�� port ��ȣ�� ���� �õ��Ѵ�.
			socket = new Socket(ia.getHostAddress(),3000);
			
			//4. Socket�� �̿��Ͽ� ����Ʈ ��� ��Ʈ�� ��ü�� �����Ѵ�.
			OutputStream out = socket.getOutputStream();
			
			//5. getBytes() �޼���� ���ڿ��� byte[]�� �ٲ���.
			out.write("��������".getBytes());
			
			//7. Socket�� �̿��Ͽ� ����Ʈ �Է� ��Ʈ�� ��ü�� �����Ѵ�.
			InputStream in = socket.getInputStream();
			byte[] b = new byte[1024];
			
			//9. �������� ������ �����͸� �о b�� ������.
			int readByteCnt = in.read(b);
			
			System.out.println(new String(b,0,readByteCnt));
			
			//10
			out.close();
			in.close();
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
