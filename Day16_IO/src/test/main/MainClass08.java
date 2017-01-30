package test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;

public class MainClass08 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		File f = new File("c:\\upload\\"+year+"\\"+
				month+"\\"+date);
		if(!f.exists())
			f.mkdirs();
		File f1 = new File("c:\\upload\\"+year+"\\"+month+
				"\\"+date,"naver.txt");
		
		InputStream in = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			URL url = new URL("http://www.wbflower.net/main/main.php");
			in = url.openStream();
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			
			
			fw = new FileWriter(f1);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw,true);
			
			
			String readLine = null;
			while((readLine = br.readLine()) != null){
				//System.out.println(readLine);
				pw.println(readLine);
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				if(in != null)in.close();
				if(isr != null)isr.close();
				if(br != null)br.close();
				if(fw != null)fw.close();
				if(bw != null)bw.close();
				if(pw != null)pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String fileName = f1.getName();
		String prefix = fileName.substring(0,fileName.lastIndexOf("."));
		String ext = fileName.substring(fileName.lastIndexOf("."));
		String millis = String.valueOf(c.getTimeInMillis());
		
		String newFileName = millis+ext;
		String path = f.getPath();
		File f3 = new File(path,newFileName);
		f1.renameTo(f3);
	}
}
