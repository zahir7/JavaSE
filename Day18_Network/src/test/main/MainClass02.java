package test.main;

import java.io.IOException;
import java.net.ServerSocket;

public class MainClass02 {
	public static void main(String[] args) {
		ServerSocket serverS = null;
		
		for(int i=0;i<65535;i++){
			try {
				//ServerSocket(port)객체가 생성되었다는 것은 시스템의
				//port를 사용할 수 있다는 의미.
				serverS = new ServerSocket(i);
				System.out.println(i+"번 포트를 사용할 수 있습니다.");
			} catch (IOException e) {
				System.out.println(i+"번 포트를 사용중입니다.");
			}
		}
	}
}	
