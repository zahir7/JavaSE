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
			//1 ServerSocket 객체 생성
			serverSocket = new ServerSocket(3000);
			
			System.out.println("클라이언트 요청 대기중.....");
			//2 accept() 메서드로 클라이언트의 요청을 기다림
			Socket s = serverSocket.accept();
			
			System.out.println("클라이언트 요청 수락.....");
			
			//4 Socket 객체로 입력스트림 객체를 생성
			InputStream in = s.getInputStream();
			//4
			byte[] b = new byte[1024];
			//4
			int readByteCnt = 0;
			
			//6 입력 스트림으로 파일명을 저장(b)함.
			readByteCnt = in.read(b);
			String fileName = new String(b,0,readByteCnt);
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			FileOutputStream fos = null;
			//7. 파일을 저장하기 위한 FileOutputStream 객체를 생성한다.
			
			fos = new FileOutputStream("c:\\temp\\"+fileName);
			
			//9. 클라이언트에서 보내인 파일을 읽어서 b에 저장한다.
			while( (readByteCnt = in.read(b)) != -1){
				//10 b에 저장된 파일을  로컬 파일에 저장한다.
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
