package test.main;

import java.io.IOException;
import java.net.ServerSocket;

public class MainClass02 {
	public static void main(String[] args) {
		ServerSocket serverS = null;
		
		for(int i=0;i<65535;i++){
			try {
				//ServerSocket(port)��ü�� �����Ǿ��ٴ� ���� �ý�����
				//port�� ����� �� �ִٴ� �ǹ�.
				serverS = new ServerSocket(i);
				System.out.println(i+"�� ��Ʈ�� ����� �� �ֽ��ϴ�.");
			} catch (IOException e) {
				System.out.println(i+"�� ��Ʈ�� ������Դϴ�.");
			}
		}
	}
}	
