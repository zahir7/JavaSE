package ex1;
import java.io.*;
import java.util.*;
public class FileInfo {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.print("파일경로>>");
		String path = s.nextLine();
		File file = new File(path);
		System.out.println(path + "파일의 상세정보");
		System.out.println("절대경로 :" + file.getAbsolutePath());
		System.out.println("생성일 : " + new Date(file.lastModified()));
		System.out.println("파일크기 : " + file.length());
		System.out.println("읽기속성 : " + file.canRead());
		System.out.println("쓰기속성 : " + file.canWrite());
		System.out.println("파일경로 : " + file.getParent());
		System.out.println("숨김속성 : " + file.isHidden());				
	}

}
