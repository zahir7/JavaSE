package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

public class MainClass02 {
	public static String split(String query,String k,
			String first,String second){
		String[] tokens = query.split(first);
		HashMap map = new HashMap();
		for(String token : tokens){
			//token => category=worldfootball , ctg=news
			String[] token1 = token.split(second);
			String key = token1[0];//category
			String value = token1[1];//worldfootball
			map.put(key, value);
		}
		return (String)map.get(k);
	}
	public static void main(String[] args) 
			throws IOException {
		// URL Ŭ������ 2���� ���
		// 1. URL�� �������(protocol,host,port,path,query,ref)
		// �� �˾Ƴ��� �ִ� �޼��带 ����
		// 2. URL�� ���ҽ�(HTML)�� ������ �� �ִ� openStream()�� ����
		URL url = new URL("http://www.doyacart.com/new/common/js/Embed.js");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		//URL�� ��õ� ��Ʈ��ȣ�� �����´�.
		//���࿡ URL�� ��Ʈ��ȣ�� ������ -1�� ��ȯ
		int port = url.getPort();
		
		//�������ݿ� ��õ� �⺻��Ʈ��ȣ�� �����´�. http => 80
		int defaultPort = url.getDefaultPort();
		
		if(port ==-1)
			port = defaultPort;
		
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();
		
		//category=worldfootball&ctg=news&mod=read
		//split("&") �޼���� ���ڿ� �߿� &�� ��ū�Ͽ� ��ū���� ���ڿ� �迭
		//�� ��ȯ�ϴ� �޼���
		/*String[] tokens = query.split("&");
		HashMap map = new HashMap();
		for(String token : tokens){
			//token => category=worldfootball , ctg=news
			String[] token1 = token.split("=");
			String key = token1[0];//category
			String value = token1[1];//worldfootball
			map.put(key, value);
		}*/
		
		//System.out.println(map.get("category"));
		
		
		
		
		System.out.println("protocol : "+ protocol);
		System.out.println("host : "+ host);
		System.out.println("port : "+ port);
		System.out.println("query : "+ query);
		System.out.println("reference : "+ reference);
		
		//URL�� ���ҽ�(HTML)�� �Է� ��Ʈ������ ��ȯ
		InputStream in = url.openStream();
		
		
		InputStreamReader isr = new InputStreamReader(in);
		char[] c = new char[1024];
		int readCharCnt = 0;
		while((readCharCnt = isr.read(c)) != -1){
			System.out.print(new String(c,0,readCharCnt));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
