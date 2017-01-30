package test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass06 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			
			fr = new FileReader("c:\\naver.txt");
			//IO Filtering => BuffereReader 클래스는 한줄을 읽을 수
			//있는 메서드(readLine())를 제공
			br = new BufferedReader(fr);
			
			fw = new FileWriter("c:\\naver1.txt");
			//IO Filtering => BufferedWriter 클래스는 버퍼링을 하면
			//서 출력을 하고 개행할 수 있는 메서드를 제공(newLine())
			bw = new BufferedWriter(fw);
			
			//IO Filtering => autoFlush 제공, print()와 println()
			//메서드를 제공한다.
			pw = new PrintWriter(bw,true);
			
			String readLine = null;
			//readLine() 메서드는 한줄을 읽어오고 개행은 제외됨
			//더이상 읽을 수 없으면 null를 반환한다.
			while((readLine = br.readLine()) != null){
				//bw.write(readLine);
				//bw.newLine();
				pw.println(readLine);
				
				System.out.println(readLine);
			}
			//bw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(fw != null) fw.close();
				if(bw != null) bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
}
