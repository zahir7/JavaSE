package test.main;

import java.io.FileNotFoundException;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass05 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			//FileReader는 naver.txt 파일을 문자 입력 스트림으로 객체생성
			fr = new FileReader("c:\\naver.txt");
			
			//FileWriter는 naver.txt 파일을 문자 출력 스트림으로 객체생성
			fw = new FileWriter("c:\\naver1.txt");
			
			int readChar = 0;
			//fr.read() 메서드는 입력 스트림에 있는 한문자(char)를 읽기 
			while((readChar = fr.read()) != -1){
				//fw.write() 메서드는 출력 스트림에 있는 한문자(char)를 출력
				//readChar 유니코드(숫자)
				//유니코드를 문자로 변환하기 위해서는 char 캐스팅해야함.
				fw.write(readChar);
				System.out.print((char)readChar);
			}
			
			fw.flush();
			
			
			int readCharCnt = 0;
			char[] c = new char[1024];
			//fr.read(c) 메서드는 입력 스트림에 있는 문자를 c배열 크기(1024)
			//만큼 읽어서 c 배열에 저장하고 저장한 배열의 크기를 반환한다. 
			while((readCharCnt = fr.read(c)) != -1){
				//fw.write(c,0,readCharCnt) 메서드는 출력 스트림에 c배열
				//에 저장되어 있는 문자를 출력하되 0부터 readCharCnt 길이만큼
				//출력한다.
				fw.write(c,0,readCharCnt);
				System.out.print(new String(c,0,readCharCnt));
			}
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
