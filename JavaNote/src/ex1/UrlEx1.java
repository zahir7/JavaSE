package ex1;

import java.io.*;
import java.net.*;

public class UrlEx1 {
	public static void main(String[] args) throws Exception{
		String urlstr = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("URL ������ �Է� ==>");
		urlstr = reader.readLine().trim();
		URL url  = new URL(urlstr);
		System.out.println("�������� : " + url.getProtocol());
		System.out.println("��Ʈ��ȣ : " + url.getPort());
		System.out.println("ȣ��Ʈ : "  + url.getHost());
		System.out.println("URL ���� : " + url.getContent());
		System.out.println("���ϰ�� : " + url.getFile());
		System.out.println("URL ��ü : " + url.toExternalForm());
	}
}
