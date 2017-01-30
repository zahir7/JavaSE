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
			
			//3. localhost, 3000번 port 번호로 접속 시도한다.
			socket = new Socket(ia.getHostAddress(),3000);
			
			//4. Socket를 이용하여 바이트 출력 스트림 객체를 생성한다.
			OutputStream out = socket.getOutputStream();
			
			//5. getBytes() 메서드는 문자열을 byte[]로 바꿔줌.
			out.write("하하하하".getBytes());
			
			//7. Socket를 이용하여 바이트 입력 스트림 객체를 생성한다.
			InputStream in = socket.getInputStream();
			byte[] b = new byte[1024];
			
			//9. 서버에서 보내온 데이터를 읽어서 b에 저장함.
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
