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
			//IO Filtering => buffer통한 입력 스트림 기능으로 향상
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("c:\\naver1.txt");
			//IO Filtering => buffer 통한 출력 스트림 기능으로 향상
			//주의 해야할 점은 맨 마지막에는 반드시 flush()를 해야함 
			bos = new BufferedOutputStream(fos);
			
			//IO Filtering => autoFlush 기능 제공 , 각종 print(),
			//println() 메서드 overloading 되어있음
			ps = new PrintStream(bos,true);
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1){
				ps.write(b,0,readByteCnt);
			}
			
			
			
			ps.println();
			ps.print("=======성영한 배상=========");
			
			
			
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
