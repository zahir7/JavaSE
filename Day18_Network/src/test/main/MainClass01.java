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
					//Socket(ip,port) ip�� port�� �̿��Ͽ� Socket
					//��ü�� �����Ǹ� �ش� ������ port�� ���� �ִٴ� �ǹ�
					s = new Socket(ia.getHostAddress(),i);
					System.out.println(i+"�� ��Ʈ�� ���� �ֽ��ϴ�.");
				} catch (IOException e) {
					System.out.println(i+"�� ��Ʈ�� ���� �ֽ��ϴ�.");
				}
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
