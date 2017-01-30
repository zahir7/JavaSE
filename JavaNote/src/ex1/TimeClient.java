package ex1;

import java.io.*;
import java.net.*;
import java.util.*;

public class TimeClient {
	public static void main(String[] args) {
		String serverip = "220.86.7.65";
		Date date = null;
		int port = 7000;
		try {
			Socket client = new Socket(serverip, port);
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			date = (Date)ois.readObject();
			System.out.println("현재시간 : "+ date);
			ois.close();
			client.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage()); 			
		}
	}

}
