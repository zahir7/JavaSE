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
			//3 Socket 객체 생성
			socket = new Socket("192.168.0.157",3000);
			//4 Socket 객체로 출력 스트림을 생성
			OutputStream out = socket.getOutputStream();
			//5.출력 스트림(out)으로 파일명을 서버로 보낸다.
			out.write("naver.jpg".getBytes());
			
			//7. 파일을 읽어 오기위한 FileInputStream 객체를 생성한다.
			FileInputStream fis = null;
			//7
			fis = new FileInputStream(
					"c:\\naver.jpg");
			//7
			byte[] b = new byte[1024];
			//7
			int readByteCnt = 0;
			
			//fis.read(b) 로컬 파일의 내용을 읽어서 b에 저장한다.
			while((readByteCnt = fis.read(b))!= -1){
				//8.출력 스트림으로 읽어온 내용(b)을 서버쪽으로 출력한다.
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
