package test.main;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainClass01 {
	public static void main(String[] args) 
			throws UnknownHostException {
		//InetAddress�� IP�� �����ϴ� Ŭ����
		//getLocalHost()�� ���� �ý����� IP�� InetAddress�� ��ȯ
		InetAddress ia = InetAddress.getLocalHost();
		
		//getHostName()�� ȣ��Ʈ �̸��� ��ȯ	
		System.out.println("host name : "+ia.getHostName());
		
		//getHostAddress()�� ȣ��Ʈ�� IP�� ��ȯ
		System.out.println("host ip : "+ia.getHostAddress());
		
		//getByName()�� Ư������Ʈ�� IP�� InetAddress�� ��ȯ
		ia = InetAddress.getByName("www.paran.com");
		
		System.out.println("host name : "+ia.getHostName());
		
		System.out.println("host ip : "+ia.getHostAddress());
		
	}
}
