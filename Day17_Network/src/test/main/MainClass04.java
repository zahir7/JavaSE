package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass04 {
	public static void main(String[] args) 
			throws IOException {
		URL url = new URL("http://www.naver.com");
		//URLConnection ��ü ����
		//1. URLConnection�� ������ ��� ������ ���� �� ����
		//2. ������ ���ҽ�(HTML)�� ��Ʈ������ ��� �� �� ����
		URLConnection urlConn = url.openConnection();
		
		//getHeaderFields() �޼���� ����� ������ Map���� ��ȯ
		//key - String , value - List<String>
		//23-35���� url�� ��������� ���� ����
		Map<String, List<String>> headMap = 
				urlConn.getHeaderFields();
		
		Set<String> set = headMap.keySet();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			List<String> listValue = headMap.get(key);
			System.out.print(key + " : ");
			for(String values : listValue){
				System.out.print(values + " ");
			}
			System.out.println();
		}
		
		//getInputStream() �޼���� URLConnection���� url�� �Է� 
		//��Ʈ���� ���´�.
		
		//InputStream in = url.openStream();
		InputStream in = urlConn.getInputStream();
		
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null){
			System.out.println(readLine);
		}		
	}
}
