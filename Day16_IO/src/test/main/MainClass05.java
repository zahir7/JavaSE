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
			//FileReader�� naver.txt ������ ���� �Է� ��Ʈ������ ��ü����
			fr = new FileReader("c:\\naver.txt");
			
			//FileWriter�� naver.txt ������ ���� ��� ��Ʈ������ ��ü����
			fw = new FileWriter("c:\\naver1.txt");
			
			int readChar = 0;
			//fr.read() �޼���� �Է� ��Ʈ���� �ִ� �ѹ���(char)�� �б� 
			while((readChar = fr.read()) != -1){
				//fw.write() �޼���� ��� ��Ʈ���� �ִ� �ѹ���(char)�� ���
				//readChar �����ڵ�(����)
				//�����ڵ带 ���ڷ� ��ȯ�ϱ� ���ؼ��� char ĳ�����ؾ���.
				fw.write(readChar);
				System.out.print((char)readChar);
			}
			
			fw.flush();
			
			
			int readCharCnt = 0;
			char[] c = new char[1024];
			//fr.read(c) �޼���� �Է� ��Ʈ���� �ִ� ���ڸ� c�迭 ũ��(1024)
			//��ŭ �о c �迭�� �����ϰ� ������ �迭�� ũ�⸦ ��ȯ�Ѵ�. 
			while((readCharCnt = fr.read(c)) != -1){
				//fw.write(c,0,readCharCnt) �޼���� ��� ��Ʈ���� c�迭
				//�� ����Ǿ� �ִ� ���ڸ� ����ϵ� 0���� readCharCnt ���̸�ŭ
				//����Ѵ�.
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
