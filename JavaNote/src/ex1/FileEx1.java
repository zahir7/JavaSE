package ex1;
import java.io.File;
public class FileEx1 {
	public static void main(String[] args) {
		try{
			File f1 = new File("d://test1.txt");
			File f2 = new File("d://test2.txt");
			File f3 = new File("d://test");
			
			f1.createNewFile(); //파일 생성 Exception 발생하므로 try catch 처리해줘야한다.
			f2.createNewFile();
			f3.mkdir();
		}catch(Exception e){
			e.printStackTrace();
		}		
	}
}
