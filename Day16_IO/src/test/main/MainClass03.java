package test.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class MainClass03 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			fis = new FileInputStream("c:\\naver.txt");
			//IO Filtering => buffer���� �Է� ��Ʈ�� ������� ���
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("c:\\naver1.txt");
			//IO Filtering => buffer ���� ��� ��Ʈ�� ������� ���
			//���� �ؾ��� ���� �� ���������� �ݵ�� flush()�� �ؾ��� 
			bos = new BufferedOutputStream(fos);
			
			//IO Filtering => autoFlush ��� ���� , ���� print(),
			//println() �޼��� overloading �Ǿ�����
			ps = new PrintStream(bos,true);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1){
				ps.write(b,0,readByteCnt);
			}
			
			
			
			ps.println();
			ps.print("=======������ ���=========");
			
			
			
			//bos.flush();
			
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
