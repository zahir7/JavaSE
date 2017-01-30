package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class MainClass05 {
	public static void main(String[] args) 
			throws MalformedURLException, IOException {
		String query = args[0];
		//URLEncoder.encode(query) 메서드는  query를 encoding 하여
		//반환한다.
		query = URLEncoder.encode(query,"utf-8");
		
		String url = "http://openapi.naver.com/search?key=8e4f32f7f0a45159c68aa38280517a23&query="+query+"&display=10&start=1&target=book";
		URLConnection urlConn = 
				new URL(url).openConnection();
		
		InputStream in = urlConn.getInputStream();
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String readLine = null;
		while((readLine = br.readLine()) != null){
			System.out.println(readLine);
		}		
	}
}
