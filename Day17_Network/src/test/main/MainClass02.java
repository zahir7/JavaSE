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
		// URL 클래스는 2가지 기능
		// 1. URL의 구성요소(protocol,host,port,path,query,ref)
		// 를 알아낼수 있는 메서드를 제공
		// 2. URL의 리소스(HTML)를 가져올 수 있는 openStream()를 제공
		URL url = new URL("http://www.doyacart.com/new/common/js/Embed.js");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		//URL에 명시된 포트번호를 가져온다.
		//만약에 URL에 포트번호가 없으면 -1를 반환
		int port = url.getPort();
		
		//프로토콜에 명시된 기본포트번호를 가져온다. http => 80
		int defaultPort = url.getDefaultPort();
		
		if(port ==-1)
			port = defaultPort;
		
		String path = url.getPath();
		String query = url.getQuery();
		String reference = url.getRef();
		
		//category=worldfootball&ctg=news&mod=read
		//split("&") 메서드는 문자열 중에 &로 토큰하여 토큰들을 문자열 배열
		//로 반환하는 메서드
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
		
		//URL의 리소스(HTML)를 입력 스트림으로 반환
		InputStream in = url.openStream();
		
		
		InputStreamReader isr = new InputStreamReader(in);
		char[] c = new char[1024];
		int readCharCnt = 0;
		while((readCharCnt = isr.read(c)) != -1){
			System.out.print(new String(c,0,readCharCnt));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
