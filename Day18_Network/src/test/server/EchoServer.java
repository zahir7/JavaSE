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
			//1. 3000번 port로 ServerSocket 객체를 생성한다.
			serverSocket = new ServerSocket(3000);
			
			//accept() 메서드는 클라이언트의 요청이 들어오면 클라이언트와
			//통신할 수 있는 Socket 객체를 생성한다.
			System.out.println("클라이언트 요청 대기중.....");
			//2.
			Socket s = serverSocket.accept();
			
			System.out.println("클라이언트 요청 수락.....");
			
			//4.Socket 객체를 이용해서 바이트 입력스트림 객체를 생성한다.
			InputStream in = s.getInputStream();
			
			byte[] b = new byte[1024];
			
			//6. 클라이언트에서 보낸 메시지(hello)를 읽어서 b에 저장함.
			int readByteCnt = in.read(b);
			
			System.out.println(new String(b,0,readByteCnt));
			
			//7. Socket 객체를 이용해서 바이트 출력 스트림 객체를 생성한다.
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
