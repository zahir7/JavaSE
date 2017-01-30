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
			//IO Filtering => BuffereReader Ŭ������ ������ ���� ��
			//�ִ� �޼���(readLine())�� ����
			br = new BufferedReader(fr);
			
			fw = new FileWriter("c:\\naver1.txt");
			//IO Filtering => BufferedWriter Ŭ������ ���۸��� �ϸ�
			//�� ����� �ϰ� ������ �� �ִ� �޼��带 ����(newLine())
			bw = new BufferedWriter(fw);
			
			//IO Filtering => autoFlush ����, print()�� println()
			//�޼��带 �����Ѵ�.
			pw = new PrintWriter(bw,true);
			
			String readLine = null;
			//readLine() �޼���� ������ �о���� ������ ���ܵ�
			//���̻� ���� �� ������ null�� ��ȯ�Ѵ�.
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
