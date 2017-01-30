package test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class MainClass07 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.wbflower.net/main/main.php");
			InputStream in = url.openStream();
			
			//����Ʈ �Է� ��Ʈ���� ĳ���� �Է½�Ʈ������ �ٲ��ִ� Ŭ����
			
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			
			
			FileWriter fw = new FileWriter("d:\\test1.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw,true);
			
			//31-35������ InputStreamReader ���
			int readCharCnt = 0;
			char[] c = new char[3];
			while((readCharCnt = isr.read(c)) != -1){
				System.out.print(new String(c,0,readCharCnt));
			}
			
			//38-42 ������ BufferedReader ���
			String readLine = null;
			while((readLine = br.readLine()) != null){
				System.out.println(readLine);
				
			}
			
			
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
