package test.main;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainClass01 {
	public static void main(String[] args) {
		Socket s = null;
		try {
			InetAddress ia = InetAddress.getByName(
					"www.naver.com");
			for(int i=0;i<65535;i++){
				try {
					//Socket(ip,port) ip와 port를 이용하여 Socket
					//객체가 생성되면 해당 서버의 port가 열려 있다는 의미
					s = new Socket(ia.getHostAddress(),i);
					System.out.println(i+"번 포트가 열려 있습니다.");
				} catch (IOException e) {
					System.out.println(i+"번 포트가 닫혀 있습니다.");
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
